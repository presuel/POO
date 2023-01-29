public class triangulo extends figura {
    // Atributos
    protected double base;
    protected double altura;
    protected boolean esRectangulo;

    // Constructores
    public triangulo() {
        super(3);
        this.base = 0;
        this.altura = 0;
    }

    public triangulo(double base, double altura) {
        super(3);
        this.base = base;
        this.altura = altura;
    }

    public triangulo(double base, double altura, boolean esRectangulo) {
        super(3);
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

    public double Area() {
        return this.base * this.altura / 2;
    }

}