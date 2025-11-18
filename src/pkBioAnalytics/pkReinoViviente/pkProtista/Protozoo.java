package pkBioAnalytics.pkReinoViviente.pkProtista;

public abstract class Protozoo extends ReinoProtista { 
    private Double tamanio;
    public Protozoo(){
        super();
        this.setTamanio(0.0);
    }
    public Protozoo(String nombre, Double tamanio){
        super();
        super.setNombre(nombre);
        this.setTamanio(tamanio);
    }
    public void mover(){
        System.out.println("El protozoo" + super.getNombre() +"se está moviendo.");
    }

    public void descansar(int horas){
        System.out.println("El protozoo" + super.getNombre() + "está descansando por " + horas + " horas.");    
    }
    public Double getTamanio() {
        return tamanio;
    }
    public void setTamanio(Double tamanio) {
        this.tamanio = tamanio;
    }
}