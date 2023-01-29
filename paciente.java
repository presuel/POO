public class paciente extends persona {
    private String fecha;
    private String sintomas;

    public paciente() {
        super();
    }

    public paciente(String nombres, String apellidos) {
        super(nombres, apellidos);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String toString() {
        return "\n-------------------------\nDatos del Paciente:\n" + this.getApellidos() + ", "
                + this.getNombres() + "\nIMC: " + this.IMC() + ".\nSintomas: " + this.getSintomas()
                + "\n-------------------------\nConsulta el " + this.getFecha() + "\n-------------------------\n";
    }

}