package com.example.taller3_mendez_useche;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2 extends AppCompatActivity {
    EditText txtCodigo, txtCorreo;
    Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);



        txtCodigo = findViewById(R.id.txtCodigo);
        txtCorreo = findViewById(R.id.txtCorreo);
        btnVerificar = findViewById(R.id.btnVerificar);
    }

    public void Verificar(View view){
        Estudiante estudiante = new Estudiante();
        estudiante.setCodigo(txtCodigo.getText().toString());
        estudiante.setCorreo(txtCorreo.getText().toString());

        Intent intent= new Intent(this, Activity3.class);
        intent.putExtra("Estudiante", estudiante);

        startActivity(intent);
    }

}