package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button suma, resta, multi, div;
    private TextView Result;
    private EditText Nume1, Nume2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Result = findViewById(R.id.Resultado);
        Nume1 = findViewById(R.id.Num1);
        Nume2 = findViewById(R.id.Num2);
        suma = findViewById(R.id.Btn_Suma);
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Result.setText(suma(Integer.parseInt(Nume1.getText().toString()), Integer.parseInt(Nume2.getText().toString()))+"");
            }
        });
        resta = findViewById(R.id.Btn_Resta);
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Result.setText(resta(Integer.parseInt(Nume1.getText().toString()), Integer.parseInt(Nume2.getText().toString()))+"");

            }
        });
        multi = findViewById(R.id.Btn_Multi);
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Result.setText(multi(Integer.parseInt(Nume1.getText().toString()), Integer.parseInt(Nume2.getText().toString()))+"");

            }
        });
        div = findViewById(R.id.Btn_Div);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Result.setText(div(Integer.parseInt(Nume1.getText().toString()), Integer.parseInt(Nume2.getText().toString()))+"");

            }
        });


    }

    public int suma (int a, int b){
        return a+b;
    }
    public int resta (int a, int b){
        return a-b;
    }public int multi (int a, int b){
        return a*b;
    }public int div (int a, int b){
        return a/b;
    }
}