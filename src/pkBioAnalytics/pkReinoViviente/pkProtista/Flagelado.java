package pkBioAnalytics.pkReinoViviente.pkProtista;

public abstract class Flagelado extends Protozoo {

    private Integer numeroFlagelos;

    public Flagelado() {
        super();
        this.numeroFlagelos = 1;
    }

    public Flagelado(String nombre, Double tamanio, Integer numeroFlagelos) {
        super();
        super.setNombre(nombre);
        super.setTamanio(tamanio);
        this.numeroFlagelos = numeroFlagelos;
    }

    @Override
    public abstract void mover();

    @Override
    public abstract void descansar(int horas);

    public Integer getNumeroFlagelos() {
        return numeroFlagelos;
    }

    public void setNumeroFlagelos(Integer numeroFlagelos) {
        this.numeroFlagelos = numeroFlagelos;
    }
}

