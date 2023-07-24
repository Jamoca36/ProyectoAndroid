package com.example.prueba11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {


    EditText Val,Cant, Iva;
    TextView Most,Most2,Most3;
    Button btnSumar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Val = (EditText) findViewById(R.id.Valor);
        Iva= (EditText) findViewById(R.id.ValorIva);
        Cant  = (EditText) findViewById(R.id.Cantidad);
        Most = (TextView) findViewById(R.id.Mostrar);
        Most2 = (TextView) findViewById(R.id.Mostrar2);
        Most3 = (TextView) findViewById(R.id.Mostrar3);
        btnSumar =(Button) findViewById(R.id.Sumar);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
                double valorProducto = Double.parseDouble(Val.getText().toString());
                double cantidad = Double.parseDouble(Cant.getText().toString());
                double porcentajeIVA = Double.parseDouble(Iva.getText().toString());

                double subtotal = valorProducto * cantidad ;
                double iva =( (valorProducto * cantidad) * (porcentajeIVA/100));
                double total = valorProducto + iva;

                Most.setText(String.valueOf(subtotal));
                Most2.setText(String.valueOf(iva));
                Most3.setText(String.valueOf(total));

            }
    });

}}