package pkLaboratorio.pkProtista.pkProtozoo;
public class ReinoProtista {
    protected String nombre;
    protected boolean unicelular;
    protected String tipoNutricion;
    protected String tipoMovimiento;

    public ReinoProtista(String nombre, boolean unicelular, String tipoNutricion, String tipoMovimiento) {
        this.nombre = nombre;
        this.unicelular = unicelular;
        this.tipoNutricion = tipoNutricion;
        this.tipoMovimiento = tipoMovimiento;
    }

    public void alimentar() {
        System.out.println(nombre + " obtiene nutrientes del medio.");
    }

    public void reproducir() {
        System.out.println(nombre + " se reproduce principalmente por división binaria.");
    }

    public void desplazar() {
        System.out.println(nombre + " se desplaza usando " + tipoMovimiento + ".");
    }

    public void respirar() {
        System.out.println(nombre + " realiza intercambio gaseoso por difusión.");
    }

    public void excretar() {
        System.out.println(nombre + " elimina desechos metabólicos a través de su membrana.");
    }

    public String toString() {
        return "Nombre: " + nombre + ", Unicelular: " + unicelular + ", Tipo de Nutricion: " + tipoNutricion + ", Tipo de Movimiento: " + tipoMovimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isUnicelular() {
        return unicelular;
    }

    public void setUnicelular(boolean unicelular) {
        this.unicelular = unicelular;
    }

    public String getTipoNutricion() {
        return tipoNutricion;
    }

    public void setTipoNutricion(String tipoNutricion) {
        this.tipoNutricion = tipoNutricion;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
}
