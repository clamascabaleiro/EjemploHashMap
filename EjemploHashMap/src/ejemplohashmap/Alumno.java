package ejemplohashmap;

import Utilidad.PedirDatos;

/**
 *
 * @author clamascabaleiro
 */
public class Alumno {

    private String nome;
    private int ref;
    private int nota;

    public Alumno() {

    }

    public Alumno(String nome, int nota) {
        this.nome = nome;
        ref = Secretaria.ref;
        this.nota = nota;
        Secretaria.ref++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getRef() {
        return ref;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return  " nome = " + nome + " ref = " + ref + " nota = " + nota;
    }

}
