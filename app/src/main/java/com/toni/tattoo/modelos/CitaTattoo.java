package com.toni.tattoo.modelos;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

public class CitaTattoo implements Parcelable {

    private String nombre;
    private String apellidos;
    private Date nacimiento;
    private float fianza;
    private boolean color;
    private boolean autorizado;


    public CitaTattoo(String nombre, String apellidos, Date nacimiento, float fianza, boolean color, boolean autorizado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.fianza = fianza;
        this.color = color;
        this.autorizado = autorizado;
    }

    public CitaTattoo() {
    }

    public CitaTattoo(String nombre, String apellidos, Date nacimiento, float fianza, boolean color) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nacimiento = nacimiento;
        this.fianza = fianza;
        this.color = color;
    }

    protected CitaTattoo(Parcel in) {
        nombre = in.readString();
        apellidos = in.readString();
        fianza = in.readFloat();
        color = in.readByte() != 0;
        autorizado = in.readByte() != 0;
    }

    public static final Creator<CitaTattoo> CREATOR = new Creator<CitaTattoo>() {
        @Override
        public CitaTattoo createFromParcel(Parcel in) {
            return new CitaTattoo(in);
        }

        @Override
        public CitaTattoo[] newArray(int size) {
            return new CitaTattoo[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public float getFianza() {
        return fianza;
    }

    public void setFianza(float fianza) {
        this.fianza = fianza;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(apellidos);
        dest.writeFloat(fianza);
        dest.writeByte((byte) (color ? 1 : 0));
        dest.writeByte((byte) (autorizado ? 1 : 0));
    }
}
