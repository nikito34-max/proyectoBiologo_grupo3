package pkLaboratorio.pkProtista.pkProtozoo;


public class Ameba extends Sarcodino {
    public Ameba(String nombre) {
        super(nombre);
    }
     public void moverHacia(ReinoProtista otro) {
        System.out.println(getNombre() + " se mueve lentamente hacia " + otro.getNombre() + ".");
    }
}

