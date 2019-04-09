package com.example.tabuada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Button calcular;
EditText numero;
ListView tabuada;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcular = (Button)findViewById(R.id.calcular);
        numero = (EditText)findViewById(R.id.numero);
        tabuada = (ListView)findViewById(R.id.tabuada);

        calcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ArrayList<Integer>   lista = new ArrayList<Integer>();


              if(numero.getText().length()>0){
                  int numeroInt = Integer.parseInt(numero.getText().toString());

                  int tab=0;
                  for(int i = 0;i<10;i++){
                      tab = numeroInt * (i+1);
                      lista.add(tab);
                  }
              }


                         ArrayAdapter<Integer> arrayAdapter = new ArrayAdapter<>(
               MainActivity.this, R.layout.listtabuada, lista
           );
            tabuada.setAdapter(arrayAdapter);
            }
        });
    }
}
