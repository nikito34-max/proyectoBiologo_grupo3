package pkLaboratorio.pkProtista.pkProtozoo;

public class Ciliado extends ReinoProtista {
    public Ciliado(String nombre) {
        super(nombre, true, "heterotrofa", "cilios");
    }
    @Override
    public void alimentar() {
        System.out.println(nombre + " se alimenta barriendo particulas con sus cilios.");
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
