package pkBioAnalytics.pkHumano;

public abstract class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String username;
    private String password;

    public Persona(String nombre, String apellido, String cedula, String username, String password ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.username = username;
        this.password = password;
    }


    public void login(String username, String password) {
        if (validarLogin(username, password)) {
            System.out.println("Acceso permitido");
            showInfo();
        } else {
            System.out.println("Acceso denegado");
        }
    }


    public Boolean validarLogin(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public abstract void showInfo();

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
