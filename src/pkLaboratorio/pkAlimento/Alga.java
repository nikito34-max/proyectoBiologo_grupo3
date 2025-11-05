package pkLaboratorio.pkAlimento;

public class Alga implements AlimentHeterotrofoI {
    private String nombre;
    private String color;

    public Alga(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return color;
    }
    
}
