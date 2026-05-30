public class Comprobante {

    // ATRIBUTOS

    private int idComprobante;
    private String fechaEmision;
    private double montoTotal;
    private String detalle;


    // CONSTRUCTOR

    public Comprobante(int idComprobante, String fechaEmision,
                       double montoTotal, String detalle) {

        this.idComprobante = idComprobante;
        this.fechaEmision = fechaEmision;
        this.montoTotal = montoTotal;
        this.detalle = detalle;
    }


    // GETTERS Y SETTERS

    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }


    // METODOS

    public void generarComprobante() {
        System.out.println("Comprobante generado");
    }

    public void imprimirComprobante() {
        System.out.println("Comprobante impreso");
    }

    public void visualizarComprobante() {
        System.out.println("Visualizando comprobante");
    }

}