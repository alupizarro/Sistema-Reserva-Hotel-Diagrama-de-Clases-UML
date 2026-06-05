 package Recepcionista;public class Recepcionista {

// ATRIBUTOS

private int idRecepcionista;
private String nombre;
private String apellido;
private String turno;

// CONSTRUCTOR

public Recepcionista(int idRecepcionista, String nombre,
String apellido, String turno) {

this.idRecepcionista = idRecepcionista;
this.nombre = nombre;
this.apellido = apellido;
this.turno = turno;
}

// GETTERS Y SETTERS

public int getIdRecepcionista() {
return idRecepcionista;
}

public void setIdRecepcionista(int idRecepcionista) {
this.idRecepcionista = idRecepcionista;
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

public String getTurno() {
return turno;
}

public void setTurno(String turno) {
this.turno = turno;
}

// METODOS

public void registrarCliente() {
System.out.println("Cliente registrado correctamente");
}

public void verReservas() {
System.out.println("Mostrando listado de reservas");
}

public void confirmarReserva() {
System.out.println("Reserva confirmada");
}

public void gestionarEstadoReserva() {
System.out.println("Estado de reserva actualizado");
}

public void registrarCheckIn() {
System.out.println("Check-in realizado");
}

public void registrarCheckOut() {
System.out.println("Check-out realizado");
}

}