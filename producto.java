public class producto {
    private String codBar;
    private String descripcion;
    private String categoria;
    private double precio;
    private int cantidad;

    //
    public producto() {

    }

    public producto(String codBar, String descripcion) {
        this.codBar = codBar;
        this.descripcion = descripcion;
    }

    public producto(String descripcion, double precio, int cantidad) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodBar() {
        return this.codBar;
    }

    public void setCodBar(String codBar) {
        this.codBar = codBar;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int Compra(int cantidad) {
        this.cantidad += cantidad;
        return this.cantidad;
    }

    public int Venta(int cantidad) {
        this.cantidad -= cantidad;
        return this.cantidad;
    }

}
