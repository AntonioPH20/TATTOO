package com.toni.tattoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class AnyadirCitaActivity extends AppCompatActivity {
    private TextView txtNombre, txtApellidos, txtFechaCita, txtFechaNacimiento, txtFianza;
    private Button btnCrear;
    private Switch swColor, swAutorizado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anyadir_cita);

        txtNombre= findViewById(R.id.txtNombreAnyadir);
        txtApellidos=findViewById(R.id.txtApellidosAnyadir);
        txtFechaCita=findViewById(R.id.txtFechaCitaAnyadir);
        txtFechaNacimiento=findViewById(R.id.txtFechaNacimientoAnyadir);
        txtFianza=findViewById(R.id.txtFianzaAnyadir);
        btnCrear=findViewById(R.id.btnCrearAnyadir);
        swColor=findViewById(R.id.swColorAnyadir);
        swAutorizado=findViewById(R.id.swAutorizadoAnyadir);

btnCrear.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

    }
});

    }
}