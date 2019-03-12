package com.example.drica.pruebasnatacion;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


import com.example.drica.pruebasnatacion.Timer.MyTimePickerDialog;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Calendar;



public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private EditText Text_tiempo;
    private TextView nav_name;
    private TextView nav_email;
    private String string_tiempo;
    private Spinner spinnerdistance;
    private Spinner spinnerestilo;
    private ArrayAdapter arrayAdapterdistancia;
    private ArrayAdapter arrayAdapterestilo;
    private Button button_iniciar_prueva;
    private Calendar calendar;
    private int Intminutos = 0;
    private int Intsegundos = 0;
    private int Intmilisegundos = 0;
    private int IntPocisionMetros = 0;
    private int anIntPocisionStyle = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        View viewNavHeader = navigationView.inflateHeaderView(R.layout.nav_header_main);
        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        if (firebaseUser != null){
            nav_name = viewNavHeader.findViewById(R.id.nav_name_user);
            nav_name.setText(firebaseUser.getDisplayName());
            nav_email = viewNavHeader.findViewById(R.id.nav_email_user);
            nav_email.setText(firebaseUser.getEmail());

            //String name = firebaseUser.getDisplayName();
            //separarFrase(name);
        }
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        spinnerdistance = findViewById(R.id.spinnerdistancia);
        arrayAdapterdistancia = ArrayAdapter.createFromResource(MainActivity.this, R.array.distancia_array, android.R.layout.simple_spinner_item);
        arrayAdapterdistancia.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerdistance.setAdapter(arrayAdapterdistancia);
        spinnerdistance.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItemText = (String) parent.getItemAtPosition(position);

                if (parent.getItemAtPosition(position).equals("Seleccione la distancia")) {
                    ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor("#9c9c9c"));
                }
                else{
                    IntPocisionMetros = position;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });


        spinnerestilo = findViewById(R.id.spinnerestilo);
        arrayAdapterestilo = ArrayAdapter.createFromResource(MainActivity.this, R.array.estilo_array, android.R.layout.simple_spinner_item);
        arrayAdapterestilo.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerestilo.setAdapter(arrayAdapterestilo);
        spinnerestilo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getItemAtPosition(position).equals("Seleccione un estilo")) {
                    ((TextView) parent.getChildAt(0)).setTextColor(Color.parseColor("#9c9c9c"));
                }
                else{
                    anIntPocisionStyle = position;
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {}
        });

        Text_tiempo = findViewById(R.id.editTime);
        Text_tiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyTimePickerDialog myTimePickerDialog = new MyTimePickerDialog(MainActivity.this, new MyTimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(com.example.drica.pruebasnatacion.Timer.TimePicker view, int hourOfDay, int minute, int seconds) {
                        Text_tiempo.setText(String.format("%02d", hourOfDay)+
                                ":" + String.format("%02d", minute) +
                                "," + String.format("%02d", seconds));
                        Intminutos = hourOfDay;
                        Intsegundos = minute;
                        Intmilisegundos = seconds;
                    }
                }, 1,0,0,true);
                myTimePickerDialog.show();
            }
        });

        button_iniciar_prueva = findViewById(R.id.iniciar_prue);
        button_iniciar_prueva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validarCampos()){
                    Captura(IntPocisionMetros,anIntPocisionStyle);
                }
            }
        });
    }

    public void separarFrase(String s) {
        int cp = 0; // Cantidad de palabras

        // Recorremos en busca de espacios
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { // Si es un espacio
                cp++; // Aumentamos en uno la cantidad de palabras
            }
        }

        // "Este blog es genial" tiene 3 espacios y 3 + 1 palabras
        String[] partes = new String[cp + 1];
        for (int i = 0; i < partes.length; i++) {
            partes[i] = ""; // Se inicializa en "" en lugar de null (defecto)
        }

        int ind = 0; // Creamos un índice para las palabras
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { // Si hay un espacio
                ind++; // Pasamos a la siguiente palabra
                continue; // Próximo i
            }
            partes[ind] += s.charAt(i); // Sino, agregamos el carácter a la palabra actual
        }
        if (ind <=1){
            nav_name.setText(partes[0]);
            nav_email.setText(partes[1]);
        }else {
            nav_name.setText(partes[0]+" "+partes[1]);
            nav_email.setText(partes[2]+" "+partes[3]);
        }

        //return partes; // Devolvemos las partes
    }

    public  boolean validarCampos(){
        boolean complete = true;
        if (Text_tiempo.getText().toString().equals(""))
        {
            Text_tiempo.setError("Campo obligatorio");
            complete = false;
        }
        else if (Text_tiempo.getText().toString().equals("00:00,00"))
        {
            Text_tiempo.setError("valor no valido");
            complete = false;
        }
        else if (spinnerdistance.getSelectedItem().equals("Seleccione la distancia"))
        {
            ((TextView) spinnerdistance.getSelectedView()).setError("Campo vacio");
            Toast.makeText(MainActivity.this  , "Se debe seleccionar la distancia" , Toast.LENGTH_LONG).show();
            complete = false;
        }
        else if (spinnerestilo.getSelectedItem().equals("Seleccione un estilo"))
        {
            ((TextView) spinnerestilo.getSelectedView()).setError("Campo vacio");
            Toast.makeText(MainActivity.this  , "Se debe seleccionar el estilo" , Toast.LENGTH_LONG).show();
            complete = false;
        }


        return complete;
    }

    public void Captura( int dis, int sti ){
        long Intminutosm = Intminutos*60000;
        long Intsegundosm = Intsegundos*1000;
        int pdis = dis;
        int pest= sti;
        Long milli = Intminutosm+Intsegundosm+Intmilisegundos;
        Intent intent = new Intent(MainActivity.this,TebleActivity.class);
        intent.putExtra("mili",milli);
        intent.putExtra("posdis",pdis);
        intent.putExtra("possti",pest);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_salir) {
            FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
            firebaseAuth.signOut();
            Intent intent = new Intent(MainActivity.this,LoginActivity.class);
            startActivity(intent);
            finish();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
