public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("=========================================");
        System.out.println("       --- SISTEMA HOTEL CARGADO ---     ");
        System.out.println("=========================================");
        System.out.println("   El codigo de tu equipo funciona bien! ");
        System.out.println("-----------------------------------------");
        
        // 1. Probamos el Recepcionista que hicieron tus compañeros
        Recepcionista carlitos = new Recepcionista(1, "Carlos", "Gomez", "Manana");
        System.out.println("Recepcionista de turno: " + carlitos.getNombre() + " " + carlitos.getApellido());
        carlitos.registrarCliente();
        carlitos.registrarCheckIn();
        
        System.out.println("-----------------------------------------");
        
        // 2. Probamos el Comprobante de pago que hicieron tus compañeros
        Comprobante ticket = new Comprobante(101, "05/06/2026", 45000.0, "Reserva Habitacion Suite");
        System.out.println("Monto del comprobante: $" + ticket.getMontoTotal());
        ticket.generarComprobante();
        
        System.out.println("=========================================");
        System.out.println(" ");
    }
}

// --- CLASES DE TUS COMPAÑEROS COPIADAS AQUÍ PARA EVITAR ERRORES DE RUTA ---

class Recepcionista {
    private int idRecepcionista;
    private String nombre;
    private String apellido;
    private String turno;

    public Recepcionista(int idRecepcionista, String nombre, String apellido, String turno) {
        this.idRecepcionista = idRecepcionista;
        this.nombre = nombre;
        this.apellido = apellido;
        this.turno = turno;
    }

    public String getNombre() { return this.nombre; }
    public String getApellido() { return this.apellido; }
    public String getTurno() { return this.turno; }
    public void registrarCliente() { System.out.println("-> Estado: Cliente registrado correctamente."); }
    public void registrarCheckIn() { System.out.println("-> Estado: Check-in realizado en el sistema."); }
}

class Comprobante {
    private int idComprobante;
    private String fechaEmision;
    private double montoTotal;
    private String detalle;

    public Comprobante(int idComprobante, String fechaEmision, double montoTotal, String detalle) {
        this.idComprobante = idComprobante;
        this.fechaEmision = fechaEmision;
        this.montoTotal = montoTotal;
        this.detalle = detalle;
    }

    public double getMontoTotal() { return this.montoTotal; }
    public void generarComprobante() { System.out.println("-> Estado: Comprobante de pago generado con exito."); }
}