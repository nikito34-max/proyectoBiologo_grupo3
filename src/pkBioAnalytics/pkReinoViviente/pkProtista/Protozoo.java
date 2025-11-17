package pkBioAnalytics.pkReinoViviente.pkProtista;

public abstract class Protozoo extends ReinoProtista { 
    public Protozoo(){
        super();
    }
    public void mover(){
        System.out.println("El protozoo se está moviendo.");
    }

    public void descansar(int horas){
        System.out.println("El protozoo está descansando por " + horas + " horas.");    
    }
}