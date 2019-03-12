package com.example.drica.pruebasnatacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;
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


        if ( anIntDistance>7 ){
            generateTable200L(anIntDistance);
        }
        if (anIntStyle == 1 && anIntDistance < 8 ){
            generateTable100L(anIntDistance);
        }
        if (anIntStyle == 2 && anIntDistance < 8 ){
            generateTable100E(anIntDistance);
        }
        if (anIntStyle == 3 && anIntDistance < 8 ){
            generateTable100M(anIntDistance);
        }
        if (anIntStyle == 4 && anIntDistance < 8 ){
            generateTable100B(anIntDistance);
        }
    }

    public void generateTable100B (int position)
    {
        textViewtr_1.setText("15 Metros");
        textViewtr_2.setText("20 Metros");
        textViewtr_3.setText("25 Metros");
        textViewtr_4.setText("30 Metros");
        textViewtr_5.setText("35 Metros");
        textViewtr_6.setText("40 Metros");
        textViewtr_7.setText("45 Metros");
        textViewtr_8.setText("50 Metros");
        textViewtr_9.setText("60 Metros");
        textViewtr_10.setText("65 Metros");
        textViewtr_11.setText("70 Metros");
        textViewtr_12.setText("75 Metros");
        textViewtr_13.setText("80 Metros");
        textViewtr_14.setText("85 Metros");
        textViewtr_15.setText("90 Metros");
        textViewtr_16.setText("95 Metros");
        textViewtr_17.setText("100 Metros");

        if (position >= 1 ) {
            aLongResult = (long) (aLongmilliseconds*0.1110);
            tableRow1.setVisibility(View.VISIBLE);
            textViewr_1.setText(EscribirResultado(aLongResult));

            if (position >= 2 ){
                tableRow2.setVisibility(View.VISIBLE);
                aLongResult = (long) (aLongmilliseconds*0.1617);
                textViewr_2.setText(EscribirResultado(aLongResult));

                tableRow3.setVisibility(View.VISIBLE);
                aLongResult = (long) (aLongmilliseconds*0.2122);
                textViewr_3.setText(EscribirResultado(aLongResult));

                if (position >= 3 ){
                    tableRow4.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.2636);
                    textViewr_4.setText(EscribirResultado(aLongResult));

                    tableRow5.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.3155);
                    textViewr_5.setText(EscribirResultado(aLongResult));

                    tableRow6.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.3667);
                    textViewr_6.setText(EscribirResultado(aLongResult));

                    tableRow7.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.4181);
                    textViewr_7.setText(EscribirResultado(aLongResult));

                    tableRow8.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.4660);
                    textViewr_8.setText(EscribirResultado(aLongResult));

                    if (position >= 4 ){
                        tableRow9.setVisibility(View.VISIBLE);
                        aLongResult = (long) (aLongmilliseconds*0.5634);
                        textViewr_9.setText(EscribirResultado(aLongResult));

                        if (position >= 5 ){
                            tableRow10.setVisibility(View.VISIBLE);
                            aLongResult = (long) (aLongmilliseconds * 0.6176);
                            textViewr_10.setText(EscribirResultado(aLongResult));

                            tableRow11.setVisibility(View.VISIBLE);
                            aLongResult = (long) (aLongmilliseconds*0.6717);
                            textViewr_11.setText(EscribirResultado(aLongResult));

                            tableRow12.setVisibility(View.VISIBLE);
                            aLongResult = (long) (aLongmilliseconds*0.7259);
                            textViewr_12.setText(EscribirResultado(aLongResult));

                            if (position >= 6 ){
                                tableRow13.setVisibility(View.VISIBLE);
                                aLongResult = (long) (aLongmilliseconds*0.7814);
                                textViewr_13.setText(EscribirResultado(aLongResult));

                                tableRow14.setVisibility(View.VISIBLE);
                                aLongResult = (long) (aLongmilliseconds*0.8369);
                                textViewr_14.setText(EscribirResultado(aLongResult));

                                if (position >= 7 ){
                                    tableRow15.setVisibility(View.VISIBLE);
                                    aLongResult = (long) (aLongmilliseconds*0.8924);
                                    textViewr_15.setText(EscribirResultado(aLongResult));

                                    tableRow16.setVisibility(View.VISIBLE);
                                    aLongResult = (long) (aLongmilliseconds*0.9479);
                                    textViewr_16.setText(EscribirResultado(aLongResult));

                                    tableRow17.setVisibility(View.VISIBLE);
                                    aLongResult =  aLongmilliseconds*1;
                                    textViewr_17.setText(EscribirResultado(aLongResult));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void generateTable100M (int position)
    {
        textViewtr_1.setText("15 Metros");
        textViewtr_2.setText("20 Metros");
        textViewtr_3.setText("25 Metros");
        textViewtr_4.setText("30 Metros");
        textViewtr_5.setText("35 Metros");
        textViewtr_6.setText("40 Metros");
        textViewtr_7.setText("45 Metros");
        textViewtr_8.setText("50 Metros");
        textViewtr_9.setText("60 Metros");
        textViewtr_10.setText("65 Metros");
        textViewtr_11.setText("70 Metros");
        textViewtr_12.setText("75 Metros");
        textViewtr_13.setText("80 Metros");
        textViewtr_14.setText("85 Metros");
        textViewtr_15.setText("90 Metros");
        textViewtr_16.setText("95 Metros");
        textViewtr_17.setText("100 Metros");

        if (position >= 1 )
        {
            aLongResult = (long) (aLongmilliseconds*0.1106);
            tableRow1.setVisibility(View.VISIBLE);
            textViewtr_1.setText("15 Metros");
            textViewr_1.setText(EscribirResultado(aLongResult));

            if (position >= 2 ){
                tableRow2.setVisibility(View.VISIBLE);
                aLongResult = (long) (aLongmilliseconds*0.1612);
                textViewr_2.setText(EscribirResultado(aLongResult));

                tableRow3.setVisibility(View.VISIBLE);
                aLongResult = (long) (aLongmilliseconds*0.2116);
                textViewr_3.setText(EscribirResultado(aLongResult));

                if (position >= 3 ){
                    tableRow4.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.2637);
                    textViewr_4.setText(EscribirResultado(aLongResult));

                    tableRow5.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.3157);
                    textViewr_5.setText(EscribirResultado(aLongResult));

                    tableRow6.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.3676);
                    textViewr_6.setText(EscribirResultado(aLongResult));

                    tableRow7.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.4196);
                    textViewr_7.setText(EscribirResultado(aLongResult));

                    tableRow8.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.4690);
                    textViewr_8.setText(EscribirResultado(aLongResult));
                    if (position >= 4 ){
                        tableRow9.setVisibility(View.VISIBLE);
                        aLongResult = (long) (aLongmilliseconds*0.5696);
                        textViewr_9.setText(EscribirResultado(aLongResult));

                        if (position >= 5 ){
                            tableRow10.setVisibility(View.VISIBLE);
                            aLongResult = (long) (aLongmilliseconds * 0.6224);
                            textViewr_10.setText(EscribirResultado(aLongResult));

                            tableRow11.setVisibility(View.VISIBLE);
                            aLongResult = (long) (aLongmilliseconds*0.6755);
                            textViewr_11.setText(EscribirResultado(aLongResult));

                            tableRow12.setVisibility(View.VISIBLE);
                            aLongResult = (long) (aLongmilliseconds*0.7284);
                            textViewr_12.setText(EscribirResultado(aLongResult));

                            if (position >= 6 ){
                                tableRow13.setVisibility(View.VISIBLE);
                                aLongResult = (long) (aLongmilliseconds*0.7831);
                                textViewr_13.setText(EscribirResultado(aLongResult));

                                tableRow14.setVisibility(View.VISIBLE);
                                aLongResult = (long) (aLongmilliseconds*0.8378);
                                textViewr_14.setText(EscribirResultado(aLongResult));

                                if (position >= 7 ){
                                    tableRow15.setVisibility(View.VISIBLE);
                                    aLongResult = (long) (aLongmilliseconds*0.8924);
                                    textViewr_15.setText(EscribirResultado(aLongResult));

                                    tableRow16.setVisibility(View.VISIBLE);
                                    aLongResult = (long) (aLongmilliseconds*0.9576);
                                    textViewr_16.setText(EscribirResultado(aLongResult));

                                    tableRow17.setVisibility(View.VISIBLE);
                                    aLongResult = (long) (aLongmilliseconds*1);
                                    textViewr_17.setText(EscribirResultado(aLongResult));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void generateTable100E (int position)
    {
        textViewtr_1.setText("15 Metros");
        textViewtr_2.setText("20 Metros");
        textViewtr_3.setText("25 Metros");
        textViewtr_4.setText("30 Metros");
        textViewtr_5.setText("35 Metros");
        textViewtr_6.setText("40 Metros");
        textViewtr_7.setText("45 Metros");
        textViewtr_8.setText("50 Metros");
        textViewtr_9.setText("60 Metros");
        textViewtr_10.setText("65 Metros");
        textViewtr_11.setText("70 Metros");
        textViewtr_12.setText("75 Metros");
        textViewtr_13.setText("80 Metros");
        textViewtr_14.setText("85 Metros");
        textViewtr_15.setText("90 Metros");
        textViewtr_16.setText("95 Metros");
        textViewtr_17.setText("100 Metros");

        if (position >= 1 ) {
            aLongResult = (long) (aLongmilliseconds*0.1182);
            tableRow1.setVisibility(View.VISIBLE);
            textViewtr_1.setText("15 Metros");
            textViewr_1.setText(EscribirResultado(aLongResult));

            if (position >= 2 ){
                tableRow2.setVisibility(View.VISIBLE);
                aLongResult = (long) (aLongmilliseconds*0.1692);
                textViewr_2.setText(EscribirResultado(aLongResult));

                tableRow3.setVisibility(View.VISIBLE);
                aLongResult = (long) (aLongmilliseconds*0.2196);
                textViewr_3.setText(EscribirResultado(aLongResult));

                if (position >= 3 ){
                    tableRow4.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.2720);
                    textViewr_4.setText(EscribirResultado(aLongResult));

                    tableRow5.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.3241);
                    textViewr_5.setText(EscribirResultado(aLongResult));

                    tableRow6.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.3765);
                    textViewr_6.setText(EscribirResultado(aLongResult));

                    tableRow7.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.4286);
                    textViewr_7.setText(EscribirResultado(aLongResult));

                    tableRow8.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.4863);
                    textViewr_8.setText(EscribirResultado(aLongResult));

                    if (position >= 4 ){
                        tableRow9.setVisibility(View.VISIBLE);
                        aLongResult = (long) (aLongmilliseconds*0.5663);
                        textViewr_9.setText(EscribirResultado(aLongResult));

                        if (position >= 5 ){
                            tableRow10.setVisibility(View.VISIBLE);
                            aLongResult = (long) (aLongmilliseconds * 0.6192);
                            textViewr_10.setText(EscribirResultado(aLongResult));

                            tableRow11.setVisibility(View.VISIBLE);
                            aLongResult = (long) (aLongmilliseconds*0.6731);
                            textViewr_11.setText(EscribirResultado(aLongResult));

                            tableRow12.setVisibility(View.VISIBLE);
                            aLongResult = (long) (aLongmilliseconds*0.7269);
                            textViewr_12.setText(EscribirResultado(aLongResult));

                            if (position >= 6 ){
                                tableRow13.setVisibility(View.VISIBLE);
                                aLongResult = (long) (aLongmilliseconds*0.7822);
                                textViewr_13.setText(EscribirResultado(aLongResult));

                                tableRow14.setVisibility(View.VISIBLE);
                                aLongResult = (long) (aLongmilliseconds*0.8375);
                                textViewr_14.setText(EscribirResultado(aLongResult));

                                if (position >= 7 ){
                                    tableRow15.setVisibility(View.VISIBLE);
                                    aLongResult = (long) (aLongmilliseconds*0.8927);
                                    textViewr_15.setText(EscribirResultado(aLongResult));

                                    tableRow16.setVisibility(View.VISIBLE);
                                    aLongResult = (long) (aLongmilliseconds*0.9482);
                                    textViewr_16.setText(EscribirResultado(aLongResult));

                                    tableRow17.setVisibility(View.VISIBLE);
                                    aLongResult = (long) (aLongmilliseconds*1);
                                    textViewr_17.setText(EscribirResultado(aLongResult));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void generateTable100L (int position)
    {
        textViewtr_1.setText("15 Metros");
        textViewtr_2.setText("20 Metros");
        textViewtr_3.setText("25 Metros");
        textViewtr_4.setText("30 Metros");
        textViewtr_5.setText("35 Metros");
        textViewtr_6.setText("40 Metros");
        textViewtr_7.setText("45 Metros");
        textViewtr_8.setText("50 Metros");
        textViewtr_9.setText("60 Metros");
        textViewtr_10.setText("65 Metros");
        textViewtr_11.setText("70 Metros");
        textViewtr_12.setText("75 Metros");
        textViewtr_13.setText("80 Metros");
        textViewtr_14.setText("85 Metros");
        textViewtr_15.setText("90 Metros");
        textViewtr_16.setText("95 Metros");
        textViewtr_17.setText("100 Metros");

        if (position >= 1 ) {
            aLongResult = (long) (aLongmilliseconds*0.1200);
            tableRow1.setVisibility(View.VISIBLE);
            textViewr_1.setText(EscribirResultado(aLongResult));

            if (position >= 2 ){
                tableRow2.setVisibility(View.VISIBLE);
                aLongResult = (long) (aLongmilliseconds*0.1698);
                textViewr_2.setText(EscribirResultado(aLongResult));

                tableRow3.setVisibility(View.VISIBLE);
                aLongResult = (long) (aLongmilliseconds*0.2196);
                textViewr_3.setText(EscribirResultado(aLongResult));

                if (position >= 3 ){
                    tableRow4.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.2711);
                    textViewr_4.setText(EscribirResultado(aLongResult));

                    tableRow5.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.3227);
                    textViewr_5.setText(EscribirResultado(aLongResult));

                    tableRow6.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.3742);
                    textViewr_6.setText(EscribirResultado(aLongResult));

                    tableRow7.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.4258);
                    textViewr_7.setText(EscribirResultado(aLongResult));

                    tableRow8.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.4822);
                    textViewr_8.setText(EscribirResultado(aLongResult));

                    if (position >= 4 ){
                        tableRow9.setVisibility(View.VISIBLE);
                        aLongResult = (long) (aLongmilliseconds*0.5713);
                        textViewr_9.setText(EscribirResultado(aLongResult));

                        if (position >= 5 ){
                            tableRow10.setVisibility(View.VISIBLE);
                            aLongResult = (long) (aLongmilliseconds * 0.6242);
                            textViewr_10.setText(EscribirResultado(aLongResult));

                            tableRow11.setVisibility(View.VISIBLE);
                            aLongResult = (long) (aLongmilliseconds*0.6769);
                            textViewr_11.setText(EscribirResultado(aLongResult));

                            tableRow12.setVisibility(View.VISIBLE);
                            aLongResult = (long) (aLongmilliseconds*0.7298);
                            textViewr_12.setText(EscribirResultado(aLongResult));

                            if (position >= 6 ){
                                tableRow13.setVisibility(View.VISIBLE);
                                aLongResult = (long) (aLongmilliseconds*0.7958);
                                textViewr_13.setText(EscribirResultado(aLongResult));

                                tableRow14.setVisibility(View.VISIBLE);
                                aLongResult = (long) (aLongmilliseconds*0.8393);
                                textViewr_14.setText(EscribirResultado(aLongResult));

                                if (position >= 7 ){
                                    tableRow15.setVisibility(View.VISIBLE);
                                    aLongResult = (long) (aLongmilliseconds*0.8942);
                                    textViewr_15.setText(EscribirResultado(aLongResult));

                                    tableRow16.setVisibility(View.VISIBLE);
                                    aLongResult = (long) (aLongmilliseconds*0.9491);
                                    textViewr_16.setText(EscribirResultado(aLongResult));

                                    tableRow17.setVisibility(View.VISIBLE);
                                    aLongResult = (long) (aLongmilliseconds*1);
                                    textViewr_17.setText(EscribirResultado(aLongResult));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public void generateTable200L (int position)
    {
        if (position >= 1 ) {
            aLongResult = (long) (aLongmilliseconds*0.0578);
            tableRow1.setVisibility(View.VISIBLE);
            textViewr_1.setText(EscribirResultado(aLongResult));

            if (position >= 2 ){
                tableRow2.setVisibility(View.VISIBLE);
                aLongResult = (long) (aLongmilliseconds*0.1078);
                textViewr_2.setText(EscribirResultado(aLongResult));

                if (position >= 3 ){
                    tableRow3.setVisibility(View.VISIBLE);
                    aLongResult = (long) (aLongmilliseconds*0.2376);
                    textViewr_3.setText(EscribirResultado(aLongResult));

                    if (position >= 4 ){
                        tableRow4.setVisibility(View.VISIBLE);
                        aLongResult = (long) (aLongmilliseconds*0.2803);
                        textViewr_4.setText(EscribirResultado(aLongResult));

                        if (position >= 5 ){
                            tableRow5.setVisibility(View.VISIBLE);
                            aLongResult = (long) (aLongmilliseconds*0.3585);
                            textViewr_5.setText(EscribirResultado(aLongResult));

                            if (position >= 6 ){
                                tableRow6.setVisibility(View.VISIBLE);
                                aLongResult = (long) (aLongmilliseconds*0.4108);
                                textViewr_6.setText(EscribirResultado(aLongResult));

                                if (position >= 7 ){
                                    tableRow7.setVisibility(View.VISIBLE);
                                    aLongResult = (long) (aLongmilliseconds*0.4904);
                                    textViewr_7.setText(EscribirResultado(aLongResult));

                                    if (position >= 8 ){
                                        tableRow8.setVisibility(View.VISIBLE);
                                        aLongResult = (long) (aLongmilliseconds*0.6130);
                                        textViewr_8.setText(EscribirResultado(aLongResult));

                                        if (position >= 9 ){
                                            tableRow9.setVisibility(View.VISIBLE);
                                            aLongResult = (long) (aLongmilliseconds*0.7480);
                                            textViewr_9.setText(EscribirResultado(aLongResult));

                                            if (position >= 10 ){
                                                tableRow10.setVisibility(View.VISIBLE);
                                                aLongResult = (long) (aLongmilliseconds*0.8700);
                                                textViewr_10.setText(EscribirResultado(aLongResult));

                                                if (position >= 11 ){
                                                    tableRow11.setVisibility(View.VISIBLE);
                                                    aLongResult = aLongmilliseconds*1;
                                                    textViewr_11.setText(EscribirResultado(aLongResult));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public String EscribirResultado(long resul){
       String Texto = String.format("%02d:%02d:%02d",
               TimeUnit.MILLISECONDS.toMinutes(resul) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(resul)),
               TimeUnit.MILLISECONDS.toSeconds(resul) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(resul)),
               TimeUnit.MILLISECONDS.toMillis(resul)- TimeUnit.SECONDS.toMillis(TimeUnit.MILLISECONDS.toSeconds(resul)));
       return Texto;
    }
}
