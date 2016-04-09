package com.fjc.guedr;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivity";
    //private static final String TAG=MainActivity.class.getName(); --es lo mismo que la linea anterior;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.v(MainActivity.TAG, "Hola Mundio");

        //Se crea un button
        Button change_american_btn = (Button) findViewById(R.id.change_to_american_btn);

        change_american_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v (MainActivity.class.getName(), "Se ejecuta al pulsar el botón");

            }
        });

        //change_american_btn.setOnClickListener( new ChangeAmericanListener());
    }
}

//Clase que implementa la interfaz OnClickListener
/*class ChangeAmericanListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Log.v ("Listener", "Se ejecuta al pulsar el botón");
    }
}*/

