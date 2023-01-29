public class triangulo {
    // Atributos
    private double base;
    private double altura;
    private boolean esRectangulo;

    // Constructores
    public triangulo() {

    }

    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public triangulo(double base, double altura, boolean esRectangulo) {
        this.base = base;
        this.altura = altura;
        this.esRectangulo = esRectangulo;
    }

    // Setters & Getters

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isRectangulo() {
        return this.esRectangulo;
    }

    public void setEsRectangulo(boolean esRectangulo) {
        this.esRectangulo = esRectangulo;
    }

}