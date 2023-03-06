package com.example.taller3_mendez_useche;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Activity3 extends AppCompatActivity {
    EditText txtCodigo,txtCorreo, edNota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        txtCodigo = findViewById(R.id.edCodigo);
        txtCorreo = findViewById(R.id.edCorreo);
        edNota = findViewById(R.id.edNota);

        Estudiante estudiante =(Estudiante) getIntent().getSerializableExtra("Estudiante");
        txtCodigo.setText(estudiante.getCodigo());
        txtCorreo.setText(estudiante.getCorreo());
        edNota.setText(estudiante.getNota());

        edNota.setEnabled(false);
    }
}