public class persona {
    private String nombres;
    private String apellidos;
    private int edad;
    private double estatura;
    private double peso;

    // Constructores
    public persona() {
        this.nombres = "";
        this.apellidos = "";
        this.edad = 0;
        this.estatura = 0;
        this.peso = 0;
    }

    public persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = 0;
        this.estatura = 0;
        this.peso = 0;
    }

    public persona(String nombres, String apellidos, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = 0;
        this.peso = 0;
    }

    public persona(String nombres, String apellidos, int edad, double altura, double peso) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = altura;
        this.peso = peso;
    }

    // Setters & Getters

    public String getNombres() {
        return this.nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return this.estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
