package pkBioAnalytics.pkReinoViviente.pkProtista;

public class Ameba extends Rizopodo {
    private Integer fuerzaPseudopodo;

    public Ameba() {
        super();
        this.setFuerzaPseudopodo(10);
    }

    public Ameba(String nombre, Double tamanio, Integer fuerzaPseudopodo) {
        super();
        super.setNombre(nombre);
        super.setTamanio(tamanio);
        this.setFuerzaPseudopodo(fuerzaPseudopodo);
    }

    @Override
    public void mover() {
        if (!super.getEstaVivo()) {
            System.out.println(super.getNombre() + " no puede moverse porque está muerta.");
            return;
        }
        System.out.println(super.getNombre() + " se desliza lentamente extendiendo su cuerpo gelatinoso.");
    }

    @Override
    public void descansar(int horas) {
        if (!super.getEstaVivo()) {
            System.out.println(super.getNombre() + " no puede descansar porque está muerta.");
            return;
        }
        System.out.println(super.getNombre() + " se detiene brevemente para recuperar energía en un entorno fangoso durante " + horas + " horas.");
    }

    public void dividir() {
        if (!super.getEstaVivo()) {
            System.out.println(super.getNombre() + " ya no puede dividirse porque está muerta.");
            return;
        }
        System.out.println(super.getNombre() + " se divide en dos amebas más pequeñas.");
        super.setTamanio(super.getTamanio() / 2);
    }

    public void cazar(Heliozoo presa) {
        if (!super.getEstaVivo()) {
            System.out.println(super.getNombre() + " no puede cazar porque está muerta.");
            return;
        }

        if (!presa.getEstaVivo()) {
            System.out.println(presa.getNombre() + " ya no está vivo. " + super.getNombre() + " lo ignora.");
            return;
        }

        if (super.getTamanio() > presa.getTamanio() || this.getFuerzaPseudopodo() > presa.getNumeroDeRayos()) {
            System.out.println(super.getNombre() + " envuelve a " + presa.getNombre() + " con sus pseudópodos y lo consume.");
            presa.setEstaVivo(false);
            super.setTamanio(super.getTamanio()+ presa.getTamanio() * 0.5);
            System.out.println(super.getNombre() + " ha crecido a un tamaño de " + super.getTamanio() + " micrometr.");
        } else {
            System.out.println(super.getNombre() + " intenta atrapar a " + presa.getNombre() + ", pero este escapa flotando.");
        }
    }

    public Integer getFuerzaPseudopodo() {
        return fuerzaPseudopodo;
    }

    public void setFuerzaPseudopodo(Integer fuerzaPseudopodo) {
        this.fuerzaPseudopodo = fuerzaPseudopodo;
    }
}

