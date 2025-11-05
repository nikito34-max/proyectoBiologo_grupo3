package pkLaboratorio.pkProtista.pkProtozoo;

public class Esporozoo extends ReinoProtista {
    public Esporozoo(String nombre) {
        super(nombre, true, "parásita", "sin estructuras locomotoras");
    }

    @Override
    public void alimentar() {
        System.out.println(nombre + " se alimenta como parásito de otros organismos.");
    }

    public void parasitar() {
        System.out.println(nombre + " depende de un huésped para vivir.");
    }

    public void infectar() {
        System.out.println(nombre + " invade células del huésped para reproducirse.");
    }

    public void formarEsporas() {
        System.out.println(nombre + " forma esporas resistentes para sobrevivir fuera del huésped.");
    }
}
