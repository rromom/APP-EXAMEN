package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    Button productos,cotizador,cerrar;
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        productos = (Button) findViewById(R.id.maibtn1);
        cerrar = (Button) findViewById(R.id.maibtn3);
        cotizador = (Button) findViewById(R.id.maibtn2);
        name = (TextView) findViewById(R.id.maibie);
        //Toast.makeText(this,Login.nombre.getText().toString(),Toast.LENGTH_LONG).show();
        name.setText("BIENVENIDO "+Login.nombre.getText().toString());
        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intcerr= new Intent(Menu.this,MainActivity.class);
                startActivity(intcerr);

            }
        });

        productos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intpro = new Intent(Menu.this,Productos.class);
                startActivity(intpro);
            }
        });



    }
}