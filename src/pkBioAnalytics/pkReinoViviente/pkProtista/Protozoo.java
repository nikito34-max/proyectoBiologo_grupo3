package pkBioAnalytics.pkReinoViviente.pkProtista;

// Es 'abstract' porque nunca crearás un "Protozoo" genérico,
// sino tipos específicos (Rizopodo, Esporozoo, etc.)
// Asumo que hereda de ReinoProtista, como en tu código anterior.
public abstract class Protozoo extends ReinoProtista { 
 
    // Atributos que TODOS los protozoos comparten
    private String nombre;
    private boolean estaVivo;

    // Constructor
    public Protozoo() {
        super(); // Llama al constructor de ReinoProtista
        this.nombre = "Protozoo Desconocido";
        this.estaVivo = true; // Asumimos que nace vivo
    }
    
    // --- MÉTODOS ABSTRACTOS ---
    // Al declararlos aquí, obligamos a TODAS las clases hijas
    // (Rizopodo, Esporozoo, Ciliado...) a tener estos métodos.
    // Esto también arregla los errores de @Override.
    
    public abstract void mover();

    public abstract void descansar(int horas);

    
    // --- Getters y Setters Comunes ---
    // Métodos que las clases hijas usan (ej. getEstaVivo(), setNombre())

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }
}