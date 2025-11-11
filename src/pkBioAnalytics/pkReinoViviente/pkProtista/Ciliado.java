package pkBioAnalytics.pkReinoViviente.pkProtista;

public abstract class Ciliado extends Protozoo {
    private String nombre;
    private Double numCilios;             
    private Boolean tieneCitostoma;     
    private String tipoReproduccion;      
    private Double tamanioMicrom;        
    private Double velocidadDeMovimiento;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()){
            System.out.println( "Ingrese un nombre válido porfavor, este campo no puede estar vacío");
        }
       this.nombre = nombre.trim();
    }
    protected Double getNumCilios() {
        return numCilios;
    }
    protected void setNumCilios(Double numCilios) {
        this.numCilios = numCilios;
    }
    protected Boolean getTieneCitostoma() {
        return tieneCitostoma;
    }
    protected void setTieneCitostoma(Boolean tieneCitostoma) {
        this.tieneCitostoma = tieneCitostoma;
    }
    protected String getTipoReproduccion() {
        return tipoReproduccion;
    }
    protected void setTipoReproduccion(String tipoReproduccion) {
        this.tipoReproduccion = tipoReproduccion;
    }
    public Double getTamanioMicrom() {
        return tamanioMicrom;
    }
    public void setTamanioMicrom(Double tamanioMicrom) {
        this.tamanioMicrom = tamanioMicrom;
    }
    public Double getVelocidadDeMovimiento() {
        return velocidadDeMovimiento;
    }
    public void setVelocidadDeMovimiento(Double velocidadDeMovimiento) {
        this.velocidadDeMovimiento = velocidadDeMovimiento;
    } 

  
  
}
   