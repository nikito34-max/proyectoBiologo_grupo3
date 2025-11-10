package pkBioAnalytics.pkHumano;

public class MicroBiologo extends Persona {
    private String especialidad;

    public MicroBiologo(String nombre, String apellido, String cedula, String username, String password, String especialidad) {
        super(nombre, apellido, cedula, username, password);
        this.especialidad = especialidad;
    }

    @Override
    public void showInfo() {
        System.out.println("Microbiólogo: " + getNombre() + " " + getApellido() + ", Especialidad: " + this.especialidad);
    }    
}

/*
public class MicroBiologo {
    private String id;
    private String nombre;
    private String especialidad;
    private String login;
    private String password;

    public MicroBiologo(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public boolean setClave(String log, String pass) {
        this.login = log;
        this.password = pass;
        return true;
    }

    public void observar(ReinoProtista protista) {
        System.out.println(nombre + " observa a " + protista.getNombre() + " bajo el microscopio.");
    }
    public void observarAlga(Alga alga) {
        System.out.println("El microbiólogo " + nombre + " está observando el alga:");
        alga.analizar();
    }
    
    public String getLogin() { return login; }
    public String getPassword() { return password; }
    public String getNombre() { return nombre; }
}

 
 */
