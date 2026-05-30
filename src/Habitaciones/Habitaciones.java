public class Habitacion {

    // ATRIBUTOS

    private int numeroHabitacion;
    private String tipoHabitacion;
    private double precio;
    private boolean disponible;


    // CONSTRUCTOR

    public Habitacion(int numeroHabitacion, String tipoHabitacion,
                      double precio, boolean disponible) {

        this.numeroHabitacion = numeroHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precio = precio;
        this.disponible = disponible;
    }


    // GETTERS Y SETTERS

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    // METODOS

    public void reservarHabitacion() {
        System.out.println("Habitacion reservada");
    }

    public void liberarHabitacion() {
        System.out.println("Habitacion liberada");
    }

    public void verificarDisponibilidad() {
        System.out.println("Verificando disponibilidad");
    }
}