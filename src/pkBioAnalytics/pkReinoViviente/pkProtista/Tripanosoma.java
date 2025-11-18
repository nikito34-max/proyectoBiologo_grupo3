package pkBioAnalytics.pkReinoViviente.pkProtista;

public class Tripanosoma extends Flagelado {

    private String tipoInfeccion;

    public Tripanosoma() {
        super();
        this.tipoInfeccion = "";
    }

    public Tripanosoma(String nombre, Double tamanio, Integer numeroFlagelos, String tipoInfeccion) {
        super(nombre, tamanio, numeroFlagelos);
        this.tipoInfeccion = tipoInfeccion;
    }

    @Override
    public void mover() {
        if (!super.getEstaVivo()) {
            System.out.println(super.getNombre() + " no puede moverse porque está muerto.");
            return;
        }
        System.out.println(super.getNombre() + " se desplaza mediante ondulaciones rápidas.");
    }

    @Override
    public void descansar(int horas) {
        if (!super.getEstaVivo()) {
            System.out.println(super.getNombre() + " no puede descansar porque está muerto.");
            return;
        }
        System.out.println(super.getNombre() + " permanece adherido al huésped durante " + horas + " horas.");
    }

    public void parasitar(Euglenoide presa) {
        if (!super.getEstaVivo()) {
            System.out.println(super.getNombre() + " no puede parasitar porque está muerto.");
            return;
        }
        if (!presa.getEstaVivo()) {
            System.out.println(presa.getNombre() + " ya está muerta. " + super.getNombre() + " no puede parasitarla.");
            return;
        }
        System.out.println(super.getNombre() + " infecta a " + presa.getNombre() + " con infección " + tipoInfeccion + ".");
        presa.setEstaVivo(false);
        System.out.println(presa.getNombre() + " ha sido parasitada y muere.");
    }

    public String getTipoInfeccion() {
        return tipoInfeccion;
    }

    public void setTipoInfeccion(String tipoInfeccion) {
        this.tipoInfeccion = tipoInfeccion;
    }
}

