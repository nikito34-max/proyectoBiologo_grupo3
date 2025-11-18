package pkBioAnalytics.pkHumano;

public abstract class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private String username;
    private String password;

    public Persona(String nombre, String apellido, String cedula, String username, String password ) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setCedula(cedula);
        this.setUsername(username);
        this.setPassword(password);
    }

    public Boolean login(String username, String password) {
        if (validarLogin(username, password)) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean validarLogin(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public void showInfo() {
        System.out.println(
            "Nombre: " + this.getNombre() +
            " | Apellido: " + this.getApellido() +
            " | Cédula: " + this.getCedula() +
            " | Usuario: " + this.getUsername()
        );
    }

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

