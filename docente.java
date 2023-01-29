public class docente extends persona {
    private String clave;
    private int horasContrato;
    private double pagoHora;

    public docente() {
        super();
    }

    public docente(String nombres, String apellidos, String clave) {
        super(nombres, apellidos);
        this.clave = clave;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getHorasContrato() {
        return horasContrato;
    }

    public void setHorasContrato(int horasContrato) {
        this.horasContrato = horasContrato;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public String toString() {
        return "\nEmpleado: " + this.getNombres() + " " + this.getApellidos() +
                "\nMonto a pagar: $" + this.getHorasContrato() * this.getPagoHora() * 2;
    }

}