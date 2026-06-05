package Clientes;

public class clientes {
    
        // ATRIBUTOS

    private int idCliente;
    private String nombre;
    private String apellido;
    private String dni;
    private String telefono;
    private String correo;


    // CONSTRUCTOR

    public void Cliente(int idCliente, String nombre, String apellido,
                   String dni, String telefono, String correo) {

        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.correo = correo;
    }


    // GETTERS Y SETTERS

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    // METODOS

    public void registrarCliente() {
        System.out.println("Cliente registrado");
    }

    public void modificarCliente() {
        System.out.println("Cliente modificado");
    }

    public void eliminarCliente() {
        System.out.println("Cliente eliminado");
    }


    
    
}
