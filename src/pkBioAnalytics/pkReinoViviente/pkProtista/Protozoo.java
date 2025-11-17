package pkBioAnalytics.pkReinoViviente.pkProtista;

public abstract class Protozoo extends ReinoProtista { 
    public Protozoo(){
        super();
    }
        /**
     * Constructor con nombre
     * @param nombre El que gustes
     */
    public Protozoo(String nombre){
        super();
        super.setNombre(nombre);
    }
    public void mover(){
        System.out.println("El protozoo se está moviendo.");
    }

    public void descansar(int horas){
        System.out.println("El protozoo está descansando por " + horas + " horas.");    
    }
}