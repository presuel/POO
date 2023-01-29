public class escaleno extends triangulo {
    private double ladoMenor;
    private double ladoMayor;

    public escaleno() {
        super();
    }

    public escaleno(double base, double altura, double ladoMenor, double ladoMayor) {
        super(base, altura);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }

    public double getLadoMenor() {
        return this.ladoMenor;
    }

    public double getLadoMayor() {
        return this.ladoMayor;
    }

    @Override
    public double Perimetro() {
        return this.ladoMenor + this.ladoMayor + this.base;
    }
}
