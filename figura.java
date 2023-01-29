public abstract class figura {
    private int lados;

    public figura() {
        this.lados = -1;
    }

    public figura(int lados) {
        this.lados = lados;
    }

    public void setLados(int lados) {
        if (this.lados < 0)
            this.lados = lados;
    }

    public int getLados() {
        return this.lados;
    }

    public abstract double Area();

}