public class isosceles extends triangulo {
    private double ladosIguales;

    public isosceles() {
        super();
    }

    public isosceles(double base, double altura, double ladosIguales) {
        super(base, altura);
        this.ladosIguales = ladosIguales;
    }

    public void setLadosIguales(double ladosIguales) {
        this.ladosIguales = ladosIguales;
    }

    public double getLadosIguales() {
        return this.ladosIguales;
    }

    public double Perimetro() {
        return (2.0 * this.ladosIguales) + this.base;
    }
}
