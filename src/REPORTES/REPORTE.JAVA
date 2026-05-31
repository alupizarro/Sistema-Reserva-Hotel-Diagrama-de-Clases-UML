public class Reporte {

    // ATRIBUTOS

    private int idReporte;
    private String tipoReporte;
    private String fechaGeneracion;
    private String descripcion;

    // CONSTRUCTOR

    public Reporte(int idReporte, String tipoReporte,
                   String fechaGeneracion, String descripcion) {

        this.idReporte = idReporte;
        this.tipoReporte = tipoReporte;
        this.fechaGeneracion = fechaGeneracion;
        this.descripcion = descripcion;
    }

    // GETTERS Y SETTERS

    public int getIdReporte() {
        return idReporte;
    }

    public void setIdReporte(int idReporte) {
        this.idReporte = idReporte;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public String getFechaGeneracion() {
        return fechaGeneracion;
    }

    public void setFechaGeneracion(String fechaGeneracion) {
        this.fechaGeneracion = fechaGeneracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // METODOS

    public void generarReporte() {
        System.out.println("Reporte generado");
    }

    public void exportarReporte() {
        System.out.println("Reporte exportado");
    }

    public void visualizarReporte() {
        System.out.println("Visualizando reporte");
    }

}