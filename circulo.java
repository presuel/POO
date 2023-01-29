public class circulo extends figura {
    private double radio;

    public circulo() {
        super(0);
        this.radio = 0;
    }

    public circulo(double radio) {
        super(0);
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return this.radio;
    }

    public double Area() {
        return 3.141592 * this.radio * this.radio;
    }

    public double Perimetro() {
        return 2.0 * 3.141592 * this.radio;
    }
}
