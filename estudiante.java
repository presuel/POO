public class estudiante extends persona {
    private String matricula;
    private String fecha;
    private boolean asistencia;

    public static final int sizeReg = 200;

    public estudiante() {
        super();
    }

    public estudiante(String nombres, String apellidos, String matricula) {
        super(nombres, apellidos);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public String toString() {
        return this.getNombres() + " - " + this.getEdad() + " años";
    }

}
