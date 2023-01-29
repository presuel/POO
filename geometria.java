public class geometria {
    public static void main(String[] args) {
        triangulo triangulo1 = new triangulo();
        triangulo1.setBase(3);
        triangulo1.setAltura(4);
        System.out.println("El area del triangulo de " + triangulo1.getBase() + "x" +
                triangulo1.getAltura() + " es de " + triangulo1.getBase() * triangulo1.getAltura() / 2 + "\n");
        triangulo triangulo2 = new triangulo();
        triangulo2.setBase(2);
        triangulo2.setAltura(5.5);
        System.out.println("El area del triangulo de " + triangulo2.getBase() + "x" +
                triangulo2.getAltura() + " es de " + triangulo2.getBase() * triangulo2.getAltura() / 2 + "\n");
    }
}