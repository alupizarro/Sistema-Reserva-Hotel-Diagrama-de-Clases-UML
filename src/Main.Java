import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("=========================================");
        System.out.println("     --- SISTEMA DE RESERVAS HOTEL ---   ");
        System.out.println("=========================================");
        
        // 1. Instanciamos al recepcionista de turno
        Recepcionista recepcionista = new Recepcionista(1, "Carlos", "Gomez", "Mañana");
        System.out.println("Atendido por: " + recepcionista.getNombre() + " (Turno " + recepcionista.getTurno() + ")");
        System.out.println("-----------------------------------------");

        // 2. Simulamos la carga de datos del Cliente mediante consola
        System.out.print("Ingrese Nombre del Cliente: ");
        String nomCliente = teclado.nextLine();
        System.out.print("Ingrese Apellido del Cliente: ");
        String apeCliente = teclado.nextLine();
        System.out.print("Ingrese DNI del Cliente: ");
        String dniCliente = teclado.nextLine();
        
        Cliente cliente = new Cliente(101, nomCliente, apeCliente, dniCliente);
        recepcionista.registrarCliente();
        
        // 3. Creamos una Habitación disponible
        System.out.println("-----------------------------------------");
        System.out.print("Ingrese Nro de Habitacion a asignar (ej: 204): ");
        int nroHab = teclado.nextInt();
        
        Habitacion habitacion = new Habitacion(nroHab, "Suite Ejecutiva", 45000.0, "Disponible");
        System.out.println("Asignando Habitacion Nro: " + habitacion.getNumero() + " (" + habitacion.getTipo() + ")");
        habitacion.setEstado("Ocupada");
        recepcionista.registrarCheckIn();

        // 4. Calculamos el Pago y generamos el Comprobante
        System.out.println("-----------------------------------------");
        System.out.print("Ingrese la cantidad de noches de estadia: ");
        int noches = teclado.nextInt();
        double totalAPagar = habitacion.getPrecioPorNoche() * noches;
        
        System.out.println("-----------------------------------------");
        System.out.println("Procesando pago total de: $" + totalAPagar);
        
        Comprobante comprobante = new Comprobante(5001, "05/06/2026", totalAPagar, "Estadia de " + noches + " noches - Hab " + habitacion.getNumero());
        comprobante.generarComprobante();
        comprobante.imprimirComprobante();
        
        recepcionista.registrarCheckOut();
        habitacion.setEstado("Disponible");
        
        System.out.println("=========================================");
        System.out.println("       --- PROCESO FINALIZADO ---        ");
        System.out.println("=========================================");
        teclado.close();
    }
}

// =========================================================================
//  CLASES DEL MODELO (SIMULADAS EN UN SOLO ARCHIVO PARA EVITAR ERRORES)
// =========================================================================

class Recepcionista {
    private int idRecepcionista; private String nombre; private String apellido; private String turno;
    public Recepcionista(int id, String nom, String ape, String tur) {
        this.idRecepcionista = id; this.nombre = nom; this.apellido = ape; this.turno = tur;
    }
    public String getNombre() { return nombre; }
    public String getTurno() { return turno; }
    public void registrarCliente() { System.out.println("-> [OK] Cliente cargado en el sistema."); }
    public void registrarCheckIn() { System.out.println("-> [OK] Check-in realizado. Llave entregada."); }
    public void registrarCheckOut() { System.out.println("-> [OK] Check-out registrado. Habitacion liberada."); }
}

class Cliente {
    private int idCliente; private String nombre; private String apellido; private String dni;
    public Cliente(int id, String nom, String ape, String dni) {
        this.idCliente = id; this.nombre = nom; this.apellido = ape; this.dni = dni;
    }
}

class Habitacion {
    private int numero; private String tipo; private double precioPorNoche; private String estado;
    public Habitacion(int num, String tipo, double precio, String est) {
        this.numero = num; this.tipo = tipo; this.precioPorNoche = precio; this.estado = est;
    }
    public int getNumero() { return numero; }
    public String getTipo() { return tipo; }
    public double getPrecioPorNoche() { return precioPorNoche; }
    public void setEstado(String est) { this.estado = est; }
}

class Comprobante {
    private int idComprobante; private String fecha; private double monto; private String detalle;
    public Comprobante(int id, String fec, double mon, String det) {
        this.idComprobante = id; this.fecha = fec; this.monto = mon; this.detalle = det;
    }
    public void generarComprobante() { System.out.println("-> [OK] Comprobante Nro " + idComprobante + " generado de forma digital."); }
    public void imprimirComprobante() { System.out.println("-> [OK] Ticket impreso fiscalmente por $" + monto); }
}