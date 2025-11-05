package pkLaboratorio.pkProtista.pkProtozoo;

import pkLaboratorio.pkAlimento.AlimentoParasitarioI;

public class Esporozoo extends ReinoProtista {
    public Esporozoo(String nombre) {
        super(nombre, true, "parásita", "sin estructuras locomotoras");
    }

    public void alimentar(AlimentoParasitarioI alimento) {
        System.out.println(nombre + " se alimenta como parásito de "+ alimento.getNombre());
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
