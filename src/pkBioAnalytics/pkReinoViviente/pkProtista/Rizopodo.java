package pkBioAnalytics.pkReinoViviente.pkProtista;

public abstract class Rizopodo extends Protozoo {
    public Rizopodo() {
        super();
    }
    public Rizopodo(String nombre, Double tamanio) {
        super();
        super.setNombre(nombre);
        super.setTamanio(tamanio);
    }
    @Override
   public void mover() {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " ya no puede moverse porque está muerto.");
            return;
        }
        System.out.println(this.getNombre() + " se mueve deslizándose.");
    }
    @Override
    public void descansar(int horas) {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede descansar porque está muerto.");
            return;
        }
        System.out.println(this.getNombre() + " reposa en el fondo del agua durante " + horas + " horas.");
    }
    
    public void cazar() {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede cazar porque está muerto.");
            return;
        }
        System.out.println(this.getNombre() + " captura presas.");
    }
}
