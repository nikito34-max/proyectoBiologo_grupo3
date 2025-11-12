package pkBioAnalytics.pkReinoViviente.pkProtista;

public class Esporozoo extends Protozoo {

    // Atributo específico basado en nuestra última conversación
    private Integer numEsporozoitos;

    /**
     * Constructor por defecto
     */
    public Esporozoo() {
        super(); // Llama al constructor de Protozoo
        this.setNumEsporozoitos(0); // Inicializa el conteo de esporozoítos
    }

    /**
     * Constructor parametrizado
     */
    public Esporozoo(String nombre, Integer numEsporozoitos) {
        super();
        this.setNombre(nombre); // Método heredado de Protozoo
        this.setNumEsporozoitos(numEsporozoitos);
    }

    // --- Métodos de Comportamiento ---


    public void mover() {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " ya no puede moverse porque está muerto.");
            return;
        }
        System.out.println(this.getNombre() + " no posee estructuras de locomoción; se desplaza pasivamente.");
    }

    
    public void descansar(int horas) {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede descansar porque está muerto.");
            return;
        }
        System.out.println(this.getNombre() + " entra en fase de latencia dentro de una célula huésped durante " + horas + " horas.");
    }

    /**
     * Método específico para Esporozoo, análogo a 'cazar' en Ameba
     */
    public void infectar() {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede infectar porque está muerto.");
            return;
        }
        System.out.println(this.getNombre() + " está buscando activamente una célula huésped para invadir.");
    }

    /**
     * Método específico para Esporozoo, análogo a 'dividirse' en Ameba.
     * En los esporozoos, esto se llama esporulación o esquizogonia.
     */
    public void dividirse() {
        if (!this.getEstaVivo()) {
            System.out.println(this.getNombre() + " no puede reproducirse porque está muerto.");
            return;
        }
        
        // Lógica de ejemplo: simula la reproducción masiva
        int nuevosGenerados = (this.numEsporozoitos > 0) ? this.numEsporozoitos * 10 : 1000;
        this.setNumEsporozoitos(this.numEsporozoitos + nuevosGenerados);
        
        System.out.println(this.getNombre() + " se ha dividido (esporulación) y ahora ha generado " + nuevosGenerados + " nuevos esporozoítos.");
    }

    // --- Getters y Setters ---
    
    /**
     * Obtiene la cantidad de esporozoítos que este organismo puede generar o porta.
     */
    public Integer getNumEsporozoitos() {
        return numEsporozoitos;
    }

    /**
     * Establece la cantidad de esporozoítos.
     */
    public void setNumEsporozoitos(Integer numEsporozoitos) {
        // Añadimos una validación simple
        if (numEsporozoitos >= 0) {
            this.numEsporozoitos = numEsporozoitos;
        } else {
            this.numEsporozoitos = 0;
        }
    }
}