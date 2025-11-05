package pkLaboratorio.pkProtista.pkProtozoo;

public class Flagelado extends ReinoProtista {
    public Flagelado(String nombre) {
        super(nombre, true, "heterótrofa o mixta", "flagelos");
    }

    @Override
    public void alimentar() {
        System.out.println(nombre + " se alimenta mediante flagelos.");
    }

    public void fotosintetizar() {
        System.out.println(nombre + " puede realizar fotosíntesis gracias a sus cloroplastos.");
    }

    public void nadar() {
        System.out.println(nombre + " nada impulsándose con uno o varios flagelos.");
    }
}