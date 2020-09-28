package com.example.kalkun;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button hitung;
    TextView hasil;
    EditText angka1;
    EditText angka2;
    EditText ops;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kalkulator(View view){
        hitung = findViewById(R.id.hitung);
        hasil = findViewById(R.id.hasil);
        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        ops = findViewById(R.id.operasi);

        Double a1 = Double.parseDouble(angka1.getText().toString());
        Double a2 = Double.parseDouble(angka2.getText().toString());
        String op = String.valueOf(ops.getText());
        Double hsl = null;
        String error = "";

        if (op.equals("+")) {
            hsl = a1 + a2;
        }else if(op.equals("-")){
            hsl = a1 - a2;
        }else if(op.equals("*")){
            hsl = a1 * a2;
        }else if(op.equals("/")){
            hsl = a1 / a2;
        }else{
            error = "\nOPERASI ARITMATIK TIDAK SESUAI";
        }

        hasil.setText("Hasilnya: "+ hsl + error);

    }
}