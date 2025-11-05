package pkLaboratorio.pkProtista.pkProtozoo;

import pkLaboratorio.pkAlimento.AlimentHeterotrofoI;

public class Flagelado extends ReinoProtista {
    public Flagelado(String nombre) {
        super(nombre, true, "heterótrofa", "flagelos");
    }

    public void alimentar(AlimentHeterotrofoI alimento) {
        System.out.println(nombre + " se alimenta mediante flagelos de "+ alimento.getNombre());
    }

    public void fotosintetizar() {
        System.out.println(nombre + " puede realizar fotosíntesis gracias a sus cloroplastos.");
    }

    public void nadar() {
        System.out.println(nombre + " nada impulsándose con uno o varios flagelos.");
    }
}