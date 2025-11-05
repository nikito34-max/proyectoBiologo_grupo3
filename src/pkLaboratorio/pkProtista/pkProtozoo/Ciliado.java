package pkLaboratorio.pkProtista.pkProtozoo;

import pkLaboratorio.pkAlimento.AlimentHeterotrofoI;

public class Ciliado extends ReinoProtista {
    public Ciliado(String nombre) {
        super(nombre, true, "heterotrofa", "cilios");
    }
    public void alimentar(AlimentHeterotrofoI alimento) {
        System.out.println(nombre + " se alimenta de"+ getNombre() + "con sus cilios.");
    }
    @Override
    public void desplazar() {
        System.out.println(nombre + " se mueve rapidamente con cilios.");
    }

    public void generarCorriente() {
        System.out.println(nombre + " usa sus cilios para crear corrientes que llevan alimento a la boca celular.");
    }

    public void conjugacion() {
        System.out.println(nombre + " puede reproducirse sexualmente por conjugación con otro individuo.");
    }
}
