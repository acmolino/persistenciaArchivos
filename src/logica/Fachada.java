/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;
import persistencia.Registro;

/**
 *
 * @author Usuario
 */
public class Fachada {
    private static Fachada instancia;
    private ListadoPersonas list;
    private Fachada(){
        list = new ListadoPersonas();
    };
    
    public static Fachada getInstancia() {
        if (instancia == null) {
            instancia = new Fachada();
        }
        return instancia;
    }
    
    public void ingresarPersona(String nombre, String apellido, String edad){
        int edadNum = Integer.parseInt(edad);
        Persona p = new Persona(nombre, apellido, edadNum);
        list.insertarPersona(p);
        Registro.getInstancia().setArchivo(list);       
    }
    
    public String listadoPersonas(){
        list = Registro.getInstancia().getArchivo();
        return list.toString();
    }
}
