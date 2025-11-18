package pkBioAnalytics.pkReinoViviente.pkProtista;

public abstract class ReinoProtista {

    protected String nombre;
    protected boolean estaVivo;
    protected double tamanio;   

    public ReinoProtista() {
        this.nombre = "Organismo desconocido";
        this.estaVivo = true;
        this.tamanio = 1.0;    
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }


    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
}


