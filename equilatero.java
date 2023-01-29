public class equilatero extends triangulo {
    public equilatero() {
        super();
    }

    public equilatero(double base, double altura) {
        super(base, altura);
    }

    public double Perimetro() {
        return 3.0 * this.base;
    }
}