package pkBioAnalytics.pkReinoViviente.pkProtista;

public abstract class Flagelado extends Protozoo {

    protected int numeroFlagelos;

    public Flagelado() {
        super();
    }

    public Flagelado(String nombre, double tamanio, int numeroFlagelos) {
        super(nombre, tamanio);
        this.numeroFlagelos = numeroFlagelos;
    }

    public int getNumeroFlagelos() {
        return numeroFlagelos;
    }

    public void setNumeroFlagelos(int numeroFlagelos) {
        this.numeroFlagelos = numeroFlagelos;
    }
}
