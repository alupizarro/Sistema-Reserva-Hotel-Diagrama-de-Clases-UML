public class Pago {

    // ATRIBUTOS

    private int idPago;
    private double monto;
    private String metodoPago;
    private String fechaPago;
    private String estadoPago;


    // CONSTRUCTOR

    public Pago(int idPago, double monto, String metodoPago,
                String fechaPago, String estadoPago) {

        this.idPago = idPago;
        this.monto = monto;
        this.metodoPago = metodoPago;
        this.fechaPago = fechaPago;
        this.estadoPago = estadoPago;
    }


    // GETTERS Y SETTERS

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }


    // METODOS

    public void procesarPago() {
        System.out.println("Pago procesado");
    }

    public void cancelarPago() {
        System.out.println("Pago cancelado");
    }

    public void verificarPago() {
        System.out.println("Verificando pago");
    }

}
