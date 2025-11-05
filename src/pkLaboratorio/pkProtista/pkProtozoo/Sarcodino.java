package pkLaboratorio.pkProtista.pkProtozoo;

import pkLaboratorio.pkAlimento.AlimentHeterotrofoI;

public class Sarcodino extends ReinoProtista {
    public Sarcodino(String nombre) {
        super(nombre, true, "heterótrofa", "pseudópodos");
    }
    public void alimentar(AlimentHeterotrofoI alimento) {
        System.out.println(nombre + " se alimenta de"+ alimento.getNombre() + "envolviendo su alimento con pseudópodos.");
    }

    public void fagocitar() {
        System.out.println(nombre + " extiende sus pseudópodos para rodear y digerir su alimento (fagocitosis).");
    }

    @Override
    public void desplazar() {
        System.out.println(nombre + " se mueve extendiendo pseudópodos.");
    }
}
