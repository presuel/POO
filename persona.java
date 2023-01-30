public abstract class persona implements id {
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
        if (edad > 0 && edad < 130) {
            this.edad = edad;
        } else
            throw new FueraDeRangoException("Edad ingresada irreal, corregir el dato.");
    }

    public double getEstatura() {
        return this.estatura;
    }

    public void setEstatura(double estatura) {
        if (estatura > 0.0 && estatura < 2.5) {
            this.estatura = estatura;
        } else
            throw new FueraDeRangoException("Altura ingresada irreal, corregir el dato.");
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        if (peso > 0 && peso < 300) {
            this.peso = peso;
        } else
            throw new IllegalArgumentException("Peso ingresado es irreal, corregir el dato.");
    }

    public double IMC() {
        return this.peso / (this.estatura * this.estatura);
    }

    public abstract String toString();
    /*
     * public String toString() {
     * String datos = this.nombres + " " + this.apellidos + "\nedad: ";
     * datos += this.edad;
     * datos += " , altura: ";
     * datos += this.estatura;
     * datos += " m. , peso: ";
     * datos += this.peso;
     * datos += " kg.\n";
     * return datos;
     * }
     */
}

/*
 * 
 * class errorDatos : public std::exception {
 * public: const char* what() const throw(){
 * return "Datos Incorrectos.\n\n";
 * }
 * };
 * 
 * class errorVacio : public errorDatos {
 * public: const char* what() const throw(){
 * return "No se ingreso ningun valor.\n\n";
 * }
 * };
 * 
 * class errorRango : public errorDatos {
 * public: const char* what() const throw(){
 * return "Dato fuera del rango de valores permitidos.\n\n";
 * }
 * };
 * 
 * class errorNoMetodo : public std::exception {
 * public: const char* what() const throw(){
 * return "Metodo invocado aun no implementado.\n\n";
 * }
 * };
 * 
 * 
 */