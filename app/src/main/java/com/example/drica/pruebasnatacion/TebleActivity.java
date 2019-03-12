package com.example.drica.pruebasnatacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class TebleActivity extends AppCompatActivity {
    private  long aLongmilliseconds;
    private long aLongResult;
    private  int anIntDistance;
    private  int anIntStyle;

    private TableRow tableRow1;
    private TableRow tableRow2;
    private  TableRow tableRow3;
    private  TableRow tableRow4;
    private  TableRow tableRow5;
    private  TableRow tableRow6;
    private  TableRow tableRow7;
    private  TableRow tableRow8;
    private  TableRow tableRow9;
    private  TableRow tableRow10;
    private  TableRow tableRow11;
    private  TableRow tableRow12;
    private  TableRow tableRow13;
    private  TableRow tableRow14;
    private  TableRow tableRow15;
    private  TableRow tableRow16;
    private  TableRow tableRow17;


    private TextView textViewr_1;
    private TextView textViewr_2;
    private TextView textViewr_3;
    private TextView textViewr_4;
    private TextView textViewr_5;
    private TextView textViewr_6;
    private TextView textViewr_7;
    private TextView textViewr_8;
    private TextView textViewr_9;
    private TextView textViewr_10;
    private TextView textViewr_11;
    private TextView textViewr_12;
    private TextView textViewr_13;
    private TextView textViewr_14;
    private TextView textViewr_15;
    private TextView textViewr_16;
    private TextView textViewr_17;

    private TextView textViewtr_1;
    private TextView textViewtr_2;
    private TextView textViewtr_3;
    private TextView textViewtr_4;
    private TextView textViewtr_5;
    private TextView textViewtr_6;
    private TextView textViewtr_7;
    private TextView textViewtr_8;
    private TextView textViewtr_9;
    private TextView textViewtr_10;
    private TextView textViewtr_11;
    private TextView textViewtr_12;
    private TextView textViewtr_13;
    private TextView textViewtr_14;
    private TextView textViewtr_15;
    private TextView textViewtr_16;
    private TextView textViewtr_17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teble);
        Bundle bundle = this.getIntent().getExtras();
        tableRow1 = findViewById(R.id.row_1);
        tableRow2 = findViewById(R.id.row_2);
        tableRow3 = findViewById(R.id.row_3);
        tableRow4 = findViewById(R.id.row_4);
        tableRow5 = findViewById(R.id.row_5);
        tableRow6 = findViewById(R.id.row_6);
        tableRow7 = findViewById(R.id.row_7);
        tableRow8 = findViewById(R.id.row_8);
        tableRow9 = findViewById(R.id.row_9);
        tableRow10 = findViewById(R.id.row_10);
        tableRow11 = findViewById(R.id.row_11);
        tableRow12 = findViewById(R.id.row_12);
        tableRow13 = findViewById(R.id.row_13);
        tableRow14 = findViewById(R.id.row_14);
        tableRow15 = findViewById(R.id.row_15);
        tableRow16 = findViewById(R.id.row_16);
        tableRow17 = findViewById(R.id.row_17);

        tableRow1.setVisibility(View.GONE);
        tableRow2.setVisibility(View.GONE);
        tableRow3.setVisibility(View.GONE);
        tableRow4.setVisibility(View.GONE);
        tableRow5.setVisibility(View.GONE);
        tableRow6.setVisibility(View.GONE);
        tableRow7.setVisibility(View.GONE);
        tableRow8.setVisibility(View.GONE);
        tableRow9.setVisibility(View.GONE);
        tableRow10.setVisibility(View.GONE);
        tableRow11.setVisibility(View.GONE);
        tableRow12.setVisibility(View.GONE);
        tableRow13.setVisibility(View.GONE);
        tableRow14.setVisibility(View.GONE);
        tableRow15.setVisibility(View.GONE);
        tableRow16.setVisibility(View.GONE);
        tableRow17.setVisibility(View.GONE);

        textViewr_1 = findViewById(R.id.TextviewRow1);
        textViewr_2 = findViewById(R.id.TextviewRow2);
        textViewr_3 = findViewById(R.id.TextviewRow3);
        textViewr_4 = findViewById(R.id.TextviewRow4);
        textViewr_5 = findViewById(R.id.TextviewRow5);
        textViewr_6 = findViewById(R.id.TextviewRow6);
        textViewr_7 = findViewById(R.id.TextviewRow7);
        textViewr_8 = findViewById(R.id.TextviewRow8);
        textViewr_9 = findViewById(R.id.TextviewRow9);
        textViewr_10 = findViewById(R.id.TextviewRow10);
        textViewr_11 = findViewById(R.id.TextviewRow11);
        textViewr_12 = findViewById(R.id.TextviewRow12);
        textViewr_13 = findViewById(R.id.TextviewRow13);
        textViewr_14 = findViewById(R.id.TextviewRow14);
        textViewr_15 = findViewById(R.id.TextviewRow15);
        textViewr_16 = findViewById(R.id.TextviewRow16);
        textViewr_17 = findViewById(R.id.TextviewRow17);

        textViewtr_1= findViewById(R.id.TextviewRowT1);
        textViewtr_2= findViewById(R.id.TextviewRowT2);
        textViewtr_3= findViewById(R.id.TextviewRowT3);
        textViewtr_4= findViewById(R.id.TextviewRowT4);
        textViewtr_5= findViewById(R.id.TextviewRowT5);
        textViewtr_6= findViewById(R.id.TextviewRowT6);
        textViewtr_7= findViewById(R.id.TextviewRowT7);
        textViewtr_8= findViewById(R.id.TextviewRowT8);
        textViewtr_9= findViewById(R.id.TextviewRowT9);
        textViewtr_10= findViewById(R.id.TextviewRowT10);
        textViewtr_11= findViewById(R.id.TextviewRowT11);
        textViewtr_12= findViewById(R.id.TextviewRowT12);
        textViewtr_13= findViewById(R.id.TextviewRowT13);
        textViewtr_14= findViewById(R.id.TextviewRowT14);
        textViewtr_15= findViewById(R.id.TextviewRowT15);
        textViewtr_16= findViewById(R.id.TextviewRowT16);
        textViewtr_17= findViewById(R.id.TextviewRowT17);

        if (bundle != null) {
            //OBTENER MILISEGUNDOS
            aLongmilliseconds = bundle.getLong("mili");
            //OBTENER ID POSICION DISTANCIA
            anIntDistance = bundle.getInt("posdis");
            //OBTENER ID POSICION DE TIEMPO
            anIntStyle = bundle.getInt("possti");
        }



        if ( anIntDistance==2 ){
            generateTable200L(anIntDistance);
        }
        if (anIntStyle == 1 && anIntDistance == 1 ){
            generateTable100L(anIntDistance);
        }
        if (anIntStyle == 2 && anIntDistance == 1 ){
            generateTable100E(anIntDistance);
        }
        if (anIntStyle == 3 && anIntDistance == 1 ){
            generateTable100M(anIntDistance);
        }
        if (anIntStyle == 4 && anIntDistance == 1 ){
            generateTable100B(anIntDistance);
        }
    }

    public void generateTable100B (int position)
    {
        textViewtr_1.setText("50 Metros");
        tableRow1.setVisibility(View.VISIBLE);
        aLongResult = (long) (aLongmilliseconds*0.4660);
        textViewr_1.setText(EscribirResultado(aLongResult));

        textViewtr_2.setText("100 Metros");
        tableRow2.setVisibility(View.VISIBLE);
        aLongResult = aLongmilliseconds;
        textViewr_2.setText(EscribirResultado(aLongResult));
        }

    public void generateTable100M (int position)
    {
        textViewtr_1.setText("50 Metros");
        textViewtr_2.setText("100 Metros");

        aLongResult = (long) (aLongmilliseconds*0.4690);
        tableRow1.setVisibility(View.VISIBLE);
        textViewr_1.setText(EscribirResultado(aLongResult));

        tableRow2.setVisibility(View.VISIBLE);
        aLongResult = aLongmilliseconds;
        textViewr_2.setText(EscribirResultado(aLongResult));

    }

    public void generateTable100E (int position)
    {
        textViewtr_1.setText("50 Metros");
        textViewtr_2.setText("100 Metros");

        aLongResult = (long) (aLongmilliseconds*0.4863);
        tableRow1.setVisibility(View.VISIBLE);
        textViewr_1.setText(EscribirResultado(aLongResult));

        tableRow2.setVisibility(View.VISIBLE);
        aLongResult = aLongmilliseconds;
        textViewr_2.setText(EscribirResultado(aLongResult));
    }

    public void generateTable100L (int position)
    {
        textViewtr_1.setText("50 Metros");
        textViewtr_2.setText("100 Metros");

        aLongResult = (long) (aLongmilliseconds*0.4822);
        tableRow1.setVisibility(View.VISIBLE);
        textViewr_1.setText(EscribirResultado(aLongResult));

        tableRow2.setVisibility(View.VISIBLE);
        aLongResult = aLongmilliseconds;
        textViewr_2.setText(EscribirResultado(aLongResult));


    }

    public void generateTable200L (int position)
    {
        aLongResult = (long) (aLongmilliseconds*0.4904);
        textViewtr_1.setText("100 Metros");
        tableRow1.setVisibility(View.VISIBLE);
        textViewr_1.setText(EscribirResultado(aLongResult));

        tableRow2.setVisibility(View.VISIBLE);
        textViewtr_2.setText("200 Metros");
        aLongResult = aLongmilliseconds;
        textViewr_2.setText(EscribirResultado(aLongResult));
    }

    public String EscribirResultado(long resul){
        String Texto = String.format("%02d:%02d:%02d",
                TimeUnit.MILLISECONDS.toMinutes(resul) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(resul)),
                TimeUnit.MILLISECONDS.toSeconds(resul) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(resul)),
                TimeUnit.MILLISECONDS.toMillis(resul)- TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(resul)));
        return Texto;
    }
}
