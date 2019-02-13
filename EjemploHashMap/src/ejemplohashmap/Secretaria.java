package ejemplohashmap;

import Utilidad.PedirDatos;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author clamascabaleiro
 */
public class Secretaria {

    public static int ref = 6000;
    Alumno al;

    public void crear(HashMap<String, Alumno> alum, String dni) {
        if (alum.containsKey(dni)) {
            JOptionPane.showMessageDialog(null, "Ya esta en el listado");
        } else {
            alum.put(dni, new Alumno(PedirDatos.palabra(" nombre "), PedirDatos.entero(" nota ")));
        }
    }

    public void mostrar(HashMap<String, Alumno> alum) {
        System.out.println(alum);

    }

    public void pasarArrayList(HashMap<String, Alumno> alum, ArrayList<Alumno> lista) {
        lista.addAll(alum.values());
        for (Alumno al : lista) {
            System.out.println(al);
        }

    }

    public void eliminar(HashMap<String, Alumno> alum, String dni) {
        if (!alum.containsKey(dni)) {
            JOptionPane.showMessageDialog(null, "No esta en la lista");
        } else {
            alum.remove(dni);
        }

    }

    public void mudar(HashMap<String, Alumno> alum, String dni) {
        if (!alum.containsKey(dni)) {
            JOptionPane.showMessageDialog(null, "No esta en la lista");
        } else {
            Alumno a = alum.get(dni);
            a.setNota(PedirDatos.entero("nueva nota"));
            alum.replace(dni, a);
        }

    }
    public void mostrarAlumno(HashMap<String, Alumno> alum, String dni){
        if (!alum.containsKey(dni)){
            JOptionPane.showMessageDialog(null, "No esta en la lista");
        } 
        
        else {
            Alumno a = alum.get(dni);
            System.out.println(a.toString());
        }
    }
}
