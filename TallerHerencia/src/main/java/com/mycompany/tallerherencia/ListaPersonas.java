
package com.mycompany.tallerherencia;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ListaPersonas {
    private ArrayList <Persona> listaper;
    
    //Contructor
    public ListaPersonas(){
        listaper = new ArrayList <Persona> ();
    }
    
    //metodo para agregar personas
    public void agregarPersonas(Persona per){
        listaper.add(per);
    }
    
    //listar
    public void listarDeportista(String e) {
        String cadena = "Personas Deportistas "+e;
        for (Persona tmp: listaper) {       //Uso de for extendido
            if (tmp instanceof Deportista){
                if(((Deportista) tmp).getTipo_deporte().equalsIgnoreCase(e))
                   cadena+=("\n"+tmp.mostrarDatos()); 
                }
        }    
        JOptionPane.showMessageDialog(null,cadena);
    }
    
    public void listarEmpleado(String e) {
        String cadena = "Personas Empleadas "+e;
        for (Persona tmp: listaper) {       //Uso de for extendido
            if (tmp instanceof Empleado){
                if(((Empleado) tmp).getCargo().equalsIgnoreCase(e))
                   cadena+=("\n"+tmp.mostrarDatos()); 
                }
        }    
        JOptionPane.showMessageDialog(null,cadena);
    }
    
    public void listarEstudiante(String e) {
        String cadena = "Personas Empleadas "+e;
        for (Persona tmp: listaper) {       //Uso de for extendido
            if (tmp instanceof Estudiante){
                if(((Estudiante) tmp).getEscuela().equalsIgnoreCase(e))
                   cadena+=("\n"+tmp.mostrarDatos()); 
                }
        }    
        JOptionPane.showMessageDialog(null,cadena);
    }
    
    public void listarPersonas(int id) {
        for (Persona tmp: listaper) {       //Uso de for extendido
            if (tmp instanceof Persona){
                if(((Persona) tmp).getId()==id)
                   JOptionPane.showMessageDialog(null,tmp.mostrarDatos()); 
                }
        }    
       
    }
    
    public void listadoDeportes() {
        String cadena = "Deportistas Listado";
        for (Persona tmp: listaper) {       //Uso de for extendido
            if (tmp instanceof Deportista){
               cadena=cadena+("\n"+tmp.mostrarDatos()); }
        }
        JOptionPane.showMessageDialog(null,cadena);
    }
    
    public void listadoEmpleados() {
        String cadena = "Empleados Listado";
        for (Persona tmp: listaper) {       //Uso de for extendido
            if (tmp instanceof Empleado){
               cadena=cadena+("\n"+tmp.mostrarDatos()); }
        }
        JOptionPane.showMessageDialog(null,cadena);
    }
    
    public void listadoEstudiantes() {
        String cadena = "Estudiantes Listado";
        for (Persona tmp: listaper) {       //Uso de for extendido
            if (tmp instanceof Estudiante){
               cadena=cadena+("\n"+tmp.mostrarDatos()); }
        }
        JOptionPane.showMessageDialog(null,cadena);
    }
    
    public void listadoPersonas() {
        String cadena = "Personas Listado";
        for (Persona tmp: listaper) {       //Uso de for extendido
            if (tmp instanceof Persona){
               cadena=cadena+("\n"+tmp.mostrarDatos()); }
        }
        JOptionPane.showMessageDialog(null,cadena);
    }
}
