public class Administrador {

    // ATRIBUTOS

    private int idAdministrador;
    private String nombre;
    private String apellido;
    private String usuario;
    private String contraseña;

    // CONSTRUCTOR

    public Administrador(int idAdministrador, String nombre,
                         String apellido, String usuario,
                         String contraseña) {

        this.idAdministrador = idAdministrador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    // GETTERS Y SETTERS

    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        this.idAdministrador = idAdministrador;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // METODOS

    public void gestionarHabitaciones() {
        System.out.println("Gestionando habitaciones");
    }

    public void agregarHabitacion() {
        System.out.println("Habitacion agregada");
    }

    public void eliminarHabitacion() {
        System.out.println("Habitacion eliminada");
    }

    public void generarReportes() {
        System.out.println("Generando reportes");
    }

}