package pkBioAnalytics.pkReinoViviente.pkProtista;

public class Euglenoide extends Flagelado {

    private String pigmentacion;

    public Euglenoide() {
        super();
        this.pigmentacion = "";
    }

    public Euglenoide(String nombre, Double tamanio, Integer numeroFlagelos, String pigmentacion) {
        super(nombre, tamanio, numeroFlagelos);
        this.pigmentacion = pigmentacion;
    }

    @Override
    public void mover() {
        if (!super.getEstaVivo()) {
            System.out.println(super.getNombre() + " no puede moverse porque está muerto.");
            return;
        }
        System.out.println(super.getNombre() + " nada usando su flagelo en busca de luz.");
    }

    @Override
    public void descansar(int horas) {
        if (!super.getEstaVivo()) {
            System.out.println(super.getNombre() + " no puede descansar porque está muerto.");
            return;
        }
        System.out.println(super.getNombre() + " flota tranquila durante " + horas + " horas.");
    }

    public void fotosintetizar() {
        if (!super.getEstaVivo()) {
            System.out.println(super.getNombre() + " no puede fotosintetizar porque está muerto.");
            return;
        }
        System.out.println(super.getNombre() + " realiza fotosíntesis usando su pigmentación " + pigmentacion + ".");
    }

    public String getPigmentacion() {
        return pigmentacion;
    }

    public void setPigmentacion(String pigmentacion) {
        this.pigmentacion = pigmentacion;
    }
}

