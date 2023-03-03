package com.example.taller3_mendez_useche;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity {
    EditText edCodigo;
    EditText edCorreo;
    EditText edNota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        edCodigo = findViewById(R.id.edCodigo);
        edCorreo = findViewById(R.id.edCorreo);
        edNota = findViewById(R.id.edNota);

        edCodigo.setEnabled(false);
        edCorreo.setEnabled(false);
        edNota.setEnabled(false);
    }
}