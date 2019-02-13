package ejemplohashmap;

import Utilidad.PedirDatos;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author clamascabaleiro
 */
public class EjemploHashMap {

    public static void main(String[] args) {
        HashMap<String, Alumno> Alumnos = new HashMap<>();
        ArrayList<Alumno> listAl = new ArrayList<>();
        Secretaria obx = new Secretaria();
        int op;
        String dni;
        do {
            System.out.println("*********************MENÚ**************\n 1-> Añadir\n " +  "2-> Mostrar\n " + "3-> Pasar a lista\n " + "4-> Borrar\n " + "5-> Modificar\n " + "6-> Mostrar Alumno\n");
            op = PedirDatos.entero("Dame una opcion ");
            switch (op) {

                case 1:
                    dni = PedirDatos.palabra("dni");
                    obx.crear(Alumnos, dni);
                    break;
                case 2 :
                    obx.mostrar(Alumnos);
                    break;
                case 3 :
                    obx.pasarArrayList(Alumnos, listAl);
                    break;
                case 4 :
                    dni = PedirDatos.palabra("dni");
                    obx.eliminar(Alumnos, dni);
                    break;
                case 5 :
                    dni = PedirDatos.palabra("dni");
                    obx.mudar(Alumnos, dni);
                case 6 :
                    dni = PedirDatos.palabra("dni");
                    obx.mostrarAlumno(Alumnos, dni);

            }

        } while (op != 0);

    }

}
