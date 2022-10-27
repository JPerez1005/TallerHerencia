
package com.mycompany.tallerherencia;

public class Empleado extends Persona {
    public String cargo;
    public float sueldo;

    public Empleado(String cargo, float sueldo) {
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public Empleado(String cargo, float sueldo, int id, String Nombre, int edad, String Apellido) {
        super(id, Nombre, edad, Apellido);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    
    

   

    

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    
    @Override
    public String mostrarDatos() {
        return super.mostrarDatos()+ "\nEmpleado:si\n" + "Cargo: " + cargo + "\nSueldo: " + sueldo;
    }
    
    
    
    
}
