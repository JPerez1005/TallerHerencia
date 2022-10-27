
package com.mycompany.tallerherencia;


public class Estudiante extends Persona{
    public float notas;
    public String materias;
    public String Escuela;
    public int Grado;

    public Estudiante(float notas, String materias, String Escuela, int Grado) {
        this.notas = notas;
        this.materias = materias;
        this.Escuela = Escuela;
        this.Grado = Grado;
    }

    public Estudiante(float notas, String materias, String Escuela, int Grado, int id, String Nombre, int edad, String Apellido) {
        super(id, Nombre, edad, Apellido);
        this.notas = notas;
        this.materias = materias;
        this.Escuela = Escuela;
        this.Grado = Grado;
    }

    public float getNotas() {
        return notas;
    }

    public void setNotas(float notas) {
        this.notas = notas;
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public String getEscuela() {
        return Escuela;
    }

    public void setEscuela(String Escuela) {
        this.Escuela = Escuela;
    }

    public int getGrado() {
        return Grado;
    }

    public void setGrado(int Grado) {
        this.Grado = Grado;
    }

    
    public String mostrarDatos() {
        return super.mostrarDatos()+"\nEstudiante:si\n" + "Notas: " + notas + 
                "\nMaterias: " + materias + "\nEscuela: " + Escuela + "\nGrado: " + Grado;
    }                

    
    
    
}
