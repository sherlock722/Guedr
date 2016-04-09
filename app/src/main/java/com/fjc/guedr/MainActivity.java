package com.fjc.guedr;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity";
    //private static final String TAG=MainActivity.class.getName(); --es lo mismo que la linea anterior;
    private ImageView forecast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(MainActivity.TAG, "Hola Mundio");

        //Se accede a la View
        forecast = (ImageView) findViewById(R.id.forecast);

        //Se crea un button
        Button change_american_btn = (Button) findViewById(R.id.change_to_american_btn);

        change_american_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toChangeAMerican(v);
            }
        });

        //change_american_btn.setOnClickListener( new ChangeAmericanListener());
    }

    //Metodo a ejecutar cuando se pulsa un boton
    public void toChangeAMerican (View v){
        Log.v(MainActivity.class.getName(), "Se ejecuta al pulsar el botón");
        forecast.setImageResource(R.drawable.offline_weather2);
    }
}

//Clase que implementa la interfaz OnClickListener
/*class ChangeAmericanListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Log.v ("Listener", "Se ejecuta al pulsar el botón");
    }
}*/



