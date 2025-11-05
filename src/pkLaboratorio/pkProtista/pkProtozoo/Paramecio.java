package pkLaboratorio.pkProtista.pkProtozoo;

public class Paramecio extends Ciliado {
    public Paramecio(String nombre) {
        super(nombre);
    }
    public void interactuarCon(ReinoProtista otro) {
        System.out.println(getNombre() + " comparte nutrientes con " + otro.getNombre() + ".");
    }
}
