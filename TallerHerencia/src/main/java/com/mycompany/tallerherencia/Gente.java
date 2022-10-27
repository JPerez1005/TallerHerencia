
package com.mycompany.tallerherencia;

import javax.swing.JOptionPane;


public class Gente {
    public static void main(String[] args) {
        ListaPersonas listap= new ListaPersonas();
        
        int id,edad,n_trofeos,Grado,op;
        float notas,sueldo;
        String Nombre,Apellido,materias,Escuela,cargo,tipo_deporte,name_team;
        
        do{
            op=Integer.parseInt(JOptionPane.showInputDialog("MENU DE ACCIONES"+
                                "\n 1. Agregar deportistas"+
                                "\n 2. Agregar empleados"+
                                "\n 3. Agregar estudiantes"+
                                "\n 4. Listado de deportistas por deporte"+
                                "\n 5. listado empleados por cargo"+
                                "\n 6. Listado estudiantes por escuela"+
                                "\n 7. Listado de personas por cedula"+
                                "\n 8. Listado Deportes"+
                                "\n 9.Listado Empleados"+
                                "\n 10.Listado Estudiante"+
                                "\n 11.Listado Personas"+
                                "\n 12.salir"+
                                "\n\n Ingrese su eleccion: "));
            
            switch(op){
                case 1:id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula de la persona: "));
                       Nombre=JOptionPane.showInputDialog("Ingrese el nombre de la persona: ");
                       Apellido=JOptionPane.showInputDialog("Ingrese el apellido de la persona: ");
                       edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona: "));
                       tipo_deporte=JOptionPane.showInputDialog("Ingrese el deporte de la persona: ");
                       name_team=JOptionPane.showInputDialog("Ingrese el nombre del equipo de la persona: ");
                       n_trofeos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese los trofeos de la persona: "));
                       Deportista D= new Deportista(tipo_deporte,name_team,n_trofeos,id,Nombre,edad,Apellido);
                       listap.agregarPersonas(D);
                       break;
                case 2:id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula de la persona: "));
                       Nombre=JOptionPane.showInputDialog("Ingrese el nombre de la persona: ");
                       Apellido=JOptionPane.showInputDialog("Ingrese el apellido de la persona: ");
                       edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona: "));
                       cargo=JOptionPane.showInputDialog("Ingrese el cargo de la persona: ");
                       sueldo=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo de la persona: "));
                       Empleado E= new Empleado(cargo,sueldo,id,Nombre,edad,Apellido);
                       listap.agregarPersonas(E);
                       break;
                case 3: id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula de la persona: "));
                       Nombre=JOptionPane.showInputDialog("Ingrese el nombre de la persona: ");
                       Apellido=JOptionPane.showInputDialog("Ingrese el apellido de la persona: ");
                       edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona: "));
                       notas=Float.parseFloat(JOptionPane.showInputDialog("Ingrese las notas de la persona: "));
                       materias=JOptionPane.showInputDialog("Ingrese Alguna materia de la persona: ");
                       Escuela=JOptionPane.showInputDialog("Ingrese la escuela de la persona: ");
                       Grado=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el grado de la persona: "));
                       Estudiante Es= new Estudiante(notas,materias,Escuela,Grado,id,Nombre,edad,Apellido);
                       listap.agregarPersonas(Es);
                       break;
                case 4: tipo_deporte=JOptionPane.showInputDialog("Ingrese tipo de deporte de la persona a consultar: ");
                        listap.listarDeportista(tipo_deporte);
                        break;
                case 5: cargo=JOptionPane.showInputDialog("Ingrese el cargo de la persona a consultar: ");
                        listap.listarEmpleado(cargo);
                        break;
                case 6: Escuela=JOptionPane.showInputDialog("Ingrese la escuela de la persona a consultar: ");
                        listap.listarEstudiante(Escuela);
                        break;
                case 7:id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cedula de la persona a consultar: "));
                        listap.listarPersonas(id);
                        break;
                case 8:listap.listadoDeportes();
                        break;
                case 9:listap.listadoEmpleados();
                        break;
                case 10:listap.listadoEstudiantes();
                        break;
                case 11:listap.listadoPersonas();
                break;
                case 12:JOptionPane.showMessageDialog(null, "Gracias por venir!!!!!");
            }
            
        }while(op!=12);
    }
    
}
