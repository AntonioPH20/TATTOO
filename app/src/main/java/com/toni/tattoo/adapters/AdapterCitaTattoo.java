package com.toni.tattoo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.toni.tattoo.R;
import com.toni.tattoo.modelos.CitaTattoo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdapterCitaTattoo extends ArrayAdapter<CitaTattoo> {
    private Context context;
    private int resource;
    private ArrayList<CitaTattoo> objects;


    public AdapterCitaTattoo(@NonNull Context context, int resource, @NonNull ArrayList<CitaTattoo> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View fila = LayoutInflater.from(context).inflate(resource, null);
        ListView contenedor = fila.findViewById(R.id.contenedorCitaTattoo);
        TextView txtNombre = fila.findViewById(R.id.txtNombreFila);
        TextView txtApellido = fila.findViewById(R.id.txtApellidoFila);
        final CitaTattoo citatattoo = objects.get(position);

        txtNombre.setText(citatattoo.getNombre());
        txtApellido.setText(citatattoo.getApellidos());

        return fila;
    }
}
