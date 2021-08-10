package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private Button enviar;
    private EditText correo,pass;
    public static EditText nombre;
    private String corre_electronico="vendedor@emproy.com";
    //private String corre_electronico="1234";
    private String password="Vendedor20203mproy";
    //private String password="1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        enviar = (Button) findViewById(R.id.logbtn);
        correo = (EditText) findViewById(R.id.loginp1);
        pass = (EditText) findViewById(R.id.loginp2);
        nombre = (EditText) findViewById(R.id.loginp3);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (nombre.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Campo Nombre Vacio",Toast.LENGTH_LONG).show();
                    return;
                }
                if (correo.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Campo Correo Vacio",Toast.LENGTH_LONG).show();
                    return;
                }
                if (pass.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"Campo Contraseña Vacio",Toast.LENGTH_LONG).show();
                    return;
                }
                if (correo.getText().toString().equals(corre_electronico) && pass.getText().toString().equals(password)){
                    //Toast.makeText(getApplicationContext(),"Credenciales Validas",Toast.LENGTH_LONG).show();
                    Intent intlog = new Intent(Login.this,Menu.class);
                    startActivity(intlog);
                    return;
                }

                Toast.makeText(getApplicationContext(),"Credenciales Invalidas",Toast.LENGTH_LONG).show();
                return;
            }
        });
    }

}