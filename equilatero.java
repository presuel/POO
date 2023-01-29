public class equilatero extends triangulo {
    public equilatero() {
        super();
    }

    public equilatero(double base, double altura) {
        super(base, altura);
    }

    @Override
    public double Perimetro() {
        return 3.0 * this.base;
    }
}