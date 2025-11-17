package pkBioAnalytics.pkReinoViviente.pkProtista;

public class Heliozoo extends Rizopodo {
    private Integer numeroDeRayos;

    public Heliozoo() {
        super();
        this.setNumeroDeRayos(0);
    }

    public Heliozoo(String nombre, Double tamanio, Integer numeroDeRayos) {
        super();
        super.setNombre(nombre);
        super.setTamanio(tamanio);
        this.setNumeroDeRayos(numeroDeRayos);
    }

    @Override
    public void mover() {
        if (!super.getEstaVivo()) {
            System.out.println(super.getNombre() + " no puede moverse porque está muerto.");
            return;
        }
        System.out.println(super.getNombre() + " flota lentamente extendiendo sus pseudópodos radiales.");
    }

    @Override
    public void descansar(int horas) {
        if (!super.getEstaVivo()) {
            System.out.println(super.getNombre() + " no puede descansar porque está muerto.");
            return;
        }
        System.out.println(super.getNombre() + " reduce su movimiento y flota inmóvil por " + horas + " horas.");
    }

    public void cazar(Ameba presa) {
        if (!super.getEstaVivo()) {
            System.out.println(super.getNombre() + " no puede cazar porque está muerto.");
            return;
        }

        if (!presa.getEstaVivo()) {
            System.out.println(presa.getNombre() + " ya no está viva. " + super.getNombre() + " la ignora.");
            return;
        }

        if (super.getTamanio() > presa.getTamanio() || this.getNumeroDeRayos() > presa.getFuerzaPseudopodo()) {
            System.out.println(super.getNombre() + " atrapa a " + presa.getNombre() +  " con sus rayos y la consume.");
            presa.setEstaVivo(false);
            super.setTamanio(super.getTamanio() + presa.getTamanio() * 0.5);
            System.out.println(super.getNombre() + " ha crecido a un tamaño de " + super.getTamanio() + " micrometros.");
        } else {
            System.out.println(
                presa.getNombre() + " repele los rayos con sus pseudópodos. " + super.getNombre() + " no puede devorarla." );
        }
    }

    public Integer getNumeroDeRayos() {
        return numeroDeRayos;
    }

    public void setNumeroDeRayos(Integer numeroDeRayos) {
        this.numeroDeRayos = numeroDeRayos;
    }
}

