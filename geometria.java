public class geometria {
    public static void main(String[] args) {
        triangulo triangulo1 = new triangulo();
        triangulo1.base = 3;
        triangulo1.altura = 4;
        System.out.println("El area del triangulo de " + triangulo1.base + "x" +
                triangulo1.altura + " es de " + triangulo1.base * triangulo1.altura / 2 + "\n");
        triangulo triangulo2 = new triangulo();
        triangulo2.base = 2;
        triangulo2.altura = 5.5;
        System.out.println("El area del triangulo de " + triangulo2.base + "x" +
                triangulo2.altura + " es de " + triangulo2.base * triangulo2.altura / 2 + "\n");
    }
}