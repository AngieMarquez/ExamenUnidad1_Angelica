package com.example.angelica.examenunidad1_angelica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerTipoAnimal, spinneranimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerTipoAnimal = (Spinner) findViewById(R.id.spinnerTipoAnimal);
        spinneranimal = (Spinner) findViewById(R.id.spinerAnimal);

        Adapter_Animales adapter_animales = new Adapter_Animales(
                this,R.layout.item_adapter,Animales.getAnimales());

        adapter_animales.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerTipoAnimal.setAdapter(adapter_animales);

        spinnerTipoAnimal.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
              //  Toast.makeText(getApplicationContext(),""+position,Toast.LENGTH_SHORT).show();
                if (position==0){
                    spinneranimal.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Animales.getMamiferos()));
                }else {
                    spinneranimal.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, Animales.getReptiles()));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
