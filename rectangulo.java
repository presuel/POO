public class rectangulo extends figura {
    private double base;
    private double altura;

    public rectangulo() {
        super(4);
        this.base = 0;
        this.altura = 0;
    }

    public rectangulo(double base, double altura) {
        super(4);
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return this.base;
    }

    public double getAltura() {
        return this.altura;
    }

    public double Area() {
        return this.base * this.altura;
    }

    public double Perimetro() {
        return 2.0 * (this.base + this.altura);
    }

}