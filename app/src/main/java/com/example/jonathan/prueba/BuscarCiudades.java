package com.example.jonathan.prueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.TextView;

public class BuscarCiudades extends AppCompatActivity implements View.OnClickListener {
    Button boton;
    AutoCompleteTextView auto;
    TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscar_ciudades);
        boton=(Button)findViewById(R.id.boton);
        auto=(AutoCompleteTextView)findViewById(R.id.auto);
        texto=(TextView)findViewById(R.id.texto);
        String[] ciudades = getResources().getStringArray(R.array.ciudades);
        boton.setOnClickListener(this);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ciudades);
        auto.setThreshold(3);
        auto.setAdapter(adapter);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton:
                String cambio= auto.getText().toString();
                texto.setText(cambio);
            break;
        }
    }
}
