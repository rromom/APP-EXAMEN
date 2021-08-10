package com.example.examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Productos extends AppCompatActivity {
    ArrayList<Items> products;
    Spinner spinner;
    ArrayList<String> lista;
    TextView detalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos);
        spinner = (Spinner) findViewById(R.id.prospi);
        products = new ArrayList<Items>();
        products.add(new Items(0,"1001","TECLADO","GENIUS",10,10,7));
        products.add(new Items(1,"1002","MOUSE","GENIUS\n",50,8,5.60));
        products.add(new Items(2,"1003","MONITOR","LG",12,120,84));
        products.add(new Items(3,"1004","LCD","LG",4,380,266));
        products.add(new Items(4,"1005","LÁPIZ ÓTICO","GENIUS",14,25,17.50));
        products.add(new Items(5,"1006","VIRTUAL GLASSES","SHINECON",20,20,14));
        products.add(new Items(6,"1007","AP","TPLINK",15,28.99,20.29));
        products.add(new Items(7,"1008","IMPRESORA","EPSON",14,350.5,245.35));
        products.add(new Items(8,"1009","SCANNER","EPSON",19,135,87.5));
        products.add(new Items(9,"1010","COPIADORA","XEROX",24,499.99,349.99));
        products.add(new Items(10,"1011","UPS","TPLINK",16,35,24.50));
        products.add(new Items(11,"1012","TINTA LASER","EPSON",25,15,10.50));
        products.add(new Items(12,"1013","HARD DISK","TOSHIBA",55,120.99,84.69));
        products.add(new Items(13,"1014","AUDIFONOS","GENIUS",26,29.99,20.99));
        lista = new ArrayList<String>();
        detalle = (TextView) findViewById(R.id.prodet);
        for (Items pro: products
             ) {
            lista.add(pro.descripcion);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,lista);
        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                for (Items det:products
                     ) {
                    if (position==det.num){
                        detalle.setText(det.codigo+"\n"+det.descripcion+"\n"+det.marca+"\n"+det.unidad);
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

}