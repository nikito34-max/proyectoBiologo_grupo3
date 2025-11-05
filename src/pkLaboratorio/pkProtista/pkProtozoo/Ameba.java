package pkLaboratorio.pkProtista.pkProtozoo;
import pkLaboratorio.pkAlimento.*;

public class Ameba extends Sarcodino implements AlimentHeterotrofoI, AlimentoParasitarioI {
    public Ameba(String nombre) {
        super(nombre);
    }
     public void moverHacia(ReinoProtista otro) {
        System.out.println(getNombre() + " se mueve lentamente hacia " + otro.getNombre() + ".");
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}

