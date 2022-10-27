package com.mycompany.tallerherencia;


public class Deportista extends Persona{
    public String tipo_deporte;
    public String name_team;
    public int n_trofeos;

    public Deportista(String tipo_deporte, String name_team, int n_trofeos) {
        this.tipo_deporte = tipo_deporte;
        this.name_team = name_team;
        this.n_trofeos = n_trofeos;
    }

    public Deportista(String tipo_deporte, String name_team, int n_trofeos, int id, String Nombre, int edad, String Apellido) {
        super(id, Nombre, edad, Apellido);
        this.tipo_deporte = tipo_deporte;
        this.name_team = name_team;
        this.n_trofeos = n_trofeos;
    }

    

    public String getTipo_deporte() {
        return tipo_deporte;
    }

    public void setTipo_deporte(String tipo_deporte) {
        this.tipo_deporte = tipo_deporte;
    }

    public String getName_team() {
        return name_team;
    }

    public void setName_team(String name_team) {
        this.name_team = name_team;
    }

    public int getN_trofeos() {
        return n_trofeos;
    }

    public void setN_trofeos(int n_trofeos) {
        this.n_trofeos = n_trofeos;
    }

    
    public String mostrarDatos() {
        return super.mostrarDatos()+ "\nDeportista:si\n" + "Tipo de Deporte: " + tipo_deporte +
                "\nNombre del Equipo: " + name_team + "\nNúmeros de Trofeos: " + n_trofeos;
    }
    
    
    
}
