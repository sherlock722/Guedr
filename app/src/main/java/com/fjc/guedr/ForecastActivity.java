package com.fjc.guedr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class ForecastActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG="ForecastActivity";
    //private static final String TAG=ForecastActivity.class.getName(); --es lo mismo que la linea anterior;
    private ImageView forecast = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);
        Log.v(ForecastActivity.TAG, "Hola Mundio");

        //Se accede a la View
        forecast = (ImageView) findViewById(R.id.forecast);

        //Se crean referencias a los botones
        Button change_american_btn = (Button) findViewById(R.id.change_to_american_btn);
        Button change_european_btn = (Button) findViewById(R.id.change_to_european_btn);
        final ToggleButton forecastToggleButton = (ToggleButton) findViewById(R.id.forecastToggleButton);

        forecastToggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (forecastToggleButton.isChecked()) {

                    toChangeEuropean(v);

                }else{

                    toChangeAMerican(v);
                }

            }
        });

        //Formas de llamar al Listener
        /*change_american_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toChangeAMerican(v);
            }
        });*/

        change_american_btn.setOnClickListener(this);

        //Formas de llamar al Listener
        /*change_european_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                toChangeEuropean(v);

            }
        });*/

        change_european_btn.setOnClickListener(this);
        //

        //Otra Forma es creando la clase
        //change_american_btn.setOnClickListener( new ChangeAmericanListener());
    }

    //La clase activity implementa el metodo OnClick de la interfaz OnClickListener
    @Override
    public void onClick(View v) {

        /*if (v.getId() == R.id.change_to_american_btn){

            toChangeAMerican (v);

        }else{

            toChangeEuropean (v);
        }*/

        //Utilizando un switch
        switch (v.getId()){

            case R.id.change_to_american_btn:
                toChangeAMerican(v);
                break;
            case R.id.change_to_european_btn:
                toChangeEuropean(v);
                break;

        }


    }

    private void toChangeEuropean(View v) {
        Log.v(ForecastActivity.class.getName(), "Se ejecuta al pulsar el botón de europa");
        forecast.setImageResource(R.drawable.offline_weather2);
    }

    //Metodo a ejecutar cuando se pulsa un boton
    public void toChangeAMerican (View v){
        Log.v(ForecastActivity.class.getName(), "Se ejecuta al pulsar el botón de america");
        forecast.setImageResource(R.drawable.offline_weather);
    }


}

//Clase que implementa la interfaz OnClickListener
/*class ChangeAmericanListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Log.v ("Listener", "Se ejecuta al pulsar el botón");
    }
}*/



