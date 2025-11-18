package pkBioAnalytics.pkReinoViviente.pkProtista;

public abstract class Rizopodo extends Protozoo {

    public Rizopodo() {
        super();
    }

    public Rizopodo(String nombre, double tamanio) {
        super(nombre, tamanio);
    }

    @Override
    public double getTamanio() {    
        return this.tamanio;
    }

    @Override
    public void setTamanio(double tamanio) {   
        this.tamanio = tamanio;
    }
}
