package com.mycompany.tallerherencia;

public class Persona {
    public int id;
    public String Nombre;
    public int edad;
    public String Apellido;

    public Persona(){
        
    }
    
    public Persona(int id, String Nombre, int edad, String Apellido) {
        this.id = id;
        this.Nombre = Nombre;
        this.edad = edad;
        this.Apellido = Apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    
    public String mostrarDatos() {
        return "Datos de la Persona\n\n" +  "Nombre: " + Nombre 
                + "\nApellido: " + Apellido +"\nIdentificación: " + id + "\nEdad: " + edad ;
    }
    
    
    
    
    
}
