package com.lenny.miappdeingles;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Calculadora extends AppCompatActivity {

    EditText editNum1, editNum2;
    TextView textResultadoCalcu;
    Button btnSuma, btnResta, btnMultiplica, btnDivide, btnSiguenteCalcu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_calculadora);

        editNum1 = findViewById(R.id.EditNumero1);
        editNum2 = findViewById(R.id.EditNumero2);

        textResultadoCalcu = findViewById(R.id.textResultadoCalcu);

        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMultiplica = findViewById(R.id.btnMultiplica);
        btnDivide = findViewById(R.id.btnDivi);
        btnSiguenteCalcu = findViewById(R.id.btnSiguienteCalcu);


        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editNum1.getText().toString());

                int num2 = Integer.parseInt(editNum2.getText().toString());
                int suma = num1 + num2;
                textResultadoCalcu.setText(" " + suma);

            }
        });

        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editNum1.getText().toString());

                int num2 = Integer.parseInt(editNum2.getText().toString());
                int resta = num1 - num2;
                textResultadoCalcu.setText(" " + resta);

            }
        });

        btnMultiplica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editNum1.getText().toString());

                int num2 = Integer.parseInt(editNum2.getText().toString());
                int multiplica = num1 * num2;
                textResultadoCalcu.setText(" " + multiplica);

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(editNum1.getText().toString());

                int num2 = Integer.parseInt(editNum2.getText().toString());
                int divide = num1 / num2;
                textResultadoCalcu.setText(" " + divide);

            }
        });
        btnSiguenteCalcu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irSiguiente = new Intent(Calculadora.this, VideoOperaciones.class);
                startActivity(irSiguiente);
            }
        });


    }

}