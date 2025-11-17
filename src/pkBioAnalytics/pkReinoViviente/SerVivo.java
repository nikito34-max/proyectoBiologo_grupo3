package pkBioAnalytics.pkReinoViviente;

public abstract class SerVivo {
    private Boolean estaVivo;
    private String nombre;
    
    public SerVivo(){
        this.setEstaVivo(true);
        this.setNombre("Sin nombre");
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Boolean getEstaVivo() {
        return estaVivo;
    }
    public void setEstaVivo(Boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
}
