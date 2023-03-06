package com.example.taller3_mendez_useche;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Activity2 extends AppCompatActivity{
    EditText txtCodigo, txtCorreo;
    Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txtCodigo = findViewById(R.id.txtCodigo);
        txtCorreo = findViewById(R.id.txtCorreo);
        btnVerificar = findViewById(R.id.btnVerificar);

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Estudiante estudiante = new Estudiante();
                estudiante.setCodigo(txtCodigo.getText().toString());
                estudiante.setCorreo(txtCorreo.getText().toString());

                try {
                    if(txtCorreo.getText().toString().contains("@gmail.com") || txtCorreo.getText().toString().contains("@hotmail.com") || txtCorreo.getText().toString().contains("@uniagustiniana.edu.co")) {
                        if (txtCodigo.getText().toString().isEmpty() || txtCorreo.getText().toString().isEmpty()) {
                            txtCodigo.setText("");
                            txtCorreo.setText("");
                            Toast.makeText(Activity2.this, "Todos los campos son requeridos", Toast.LENGTH_SHORT).show();
                        } else {
                            FileOutputStream file = openFileOutput("estudiante.txt", Context.MODE_PRIVATE);
                            ObjectOutputStream serializacion = new ObjectOutputStream(file);
                            serializacion.writeObject(estudiante);
                            serializacion.close();

                            Intent intent = new Intent(Activity2.this, Activity3.class);
                            startActivity(intent);
                        }
                    }
                    else
                    {
                        txtCodigo.setText("");
                        txtCorreo.setText("");
                        Toast.makeText(Activity2.this, "El correo no es válido", Toast.LENGTH_SHORT).show();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
        });
    }
}