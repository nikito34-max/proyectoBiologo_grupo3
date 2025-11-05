package pkLaboratorio.pkProtista.pkProtozoo;


public class Euglena extends Flagelado {
    public Euglena(String nombre) {
        super(nombre);
    }
     public void interactuarCon(ReinoProtista otro) {
        System.out.println(getNombre() + " se desplaza hacia " + otro.getNombre() + " por fototaxis.");
    }
}

