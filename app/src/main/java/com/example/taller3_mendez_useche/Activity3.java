package com.example.taller3_mendez_useche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Activity3 extends AppCompatActivity {
    EditText edCodigo,edCorreo, edNota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        edCodigo = findViewById(R.id.edCodigo);
        edCorreo = findViewById(R.id.edCorreo);
        edNota = findViewById(R.id.edNota);

        try {
            FileInputStream file = openFileInput("estudiante.txt");
            ObjectInputStream deserializacion = new ObjectInputStream(file);
            Estudiante info_estudiante = (Estudiante) deserializacion.readObject();
            deserializacion.close();

            edCodigo.setText(info_estudiante.getCodigo());
            edCorreo.setText(info_estudiante.getCorreo());
            edNota.setText(info_estudiante.getNota());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        edCodigo.setEnabled(false);
        edCorreo.setEnabled(false);
        edNota.setEnabled(false);
    }
}