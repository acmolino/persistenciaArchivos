/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import logica.ListadoPersonas;

/**
 *
 * @author Usuario
 */
public class Registro {

    private String path;
    private static Registro instancia;

    private Registro() {
        path = "personas.dat";
    }

    public static Registro getInstancia() {
        if (instancia == null) {
            instancia = new Registro();
        }
        return instancia;
    }

    public void setArchivo(ListadoPersonas list) {
        try {
            // Abro el archivo
            FileOutputStream f = new FileOutputStream(path);
            ObjectOutputStream o = new ObjectOutputStream(f);
            // Actualizo la información en el archivo
            o.writeObject(list);
            // Cierro el archivo
            o.close();
            f.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

    public ListadoPersonas getArchivo() {
        ListadoPersonas list = new ListadoPersonas();
        try {
            // Abro el archivo
            FileInputStream f = new FileInputStream(path);
            ObjectInputStream o = new ObjectInputStream(f);
            // Actualizo la información en el archivo
            list = (ListadoPersonas) o.readObject();
            // Cierro el archivo
            o.close();
            f.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Se genera el archivo estudiantes.dat");
        }
        return list;
    }

}
