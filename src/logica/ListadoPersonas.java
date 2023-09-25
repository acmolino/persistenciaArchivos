/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class ListadoPersonas implements Serializable {
    private ArrayList<Persona> listado;

    public ListadoPersonas() {
        listado = new ArrayList();
    }
    
    public void insertarPersona(Persona p){
        listado.add(p);
    }

    @Override
    public String toString() {
        return listado.toString();
    }
    
    
}
