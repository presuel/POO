import java.util.Scanner;

public class geometria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // -------------------------------------------------------
        circulo Circulo1 = new circulo(); // (5);
        rectangulo Rectangulo1 = new rectangulo(); // (3, 5);
        equilatero Equilatero1 = new equilatero(); // (3, 5);
        isosceles Isosceles1 = new isosceles(3, 4.5, 6);
        escaleno Escaleno1 = new escaleno(); // (3, 2, 2, 4);
        // -------------------------------------------------------
        triangulo Triangulo1 = new triangulo(3, 5);
        // Triangulo1.setBase(3);
        // Triangulo1.setAltura(4);
        // ---------------------------------------------------
        System.out.println("Triangulo 1");
        System.out.println(Triangulo1.getBase() + "x" + Triangulo1.getAltura());
        System.out.println("Lados= " + Triangulo1.getLados());
        System.out.println("Area= " + Triangulo1.Area());
        System.out.println("----------------------------------");
        // ---------------------------------------------------
        Circulo1.setRadio(3);
        // ---------------------------------------------------
        System.out.println("Circulo 1");
        System.out.println("Radio= " + Circulo1.getRadio());
        System.out.println("Lados= " + Circulo1.getLados());
        System.out.println("Area= " + Circulo1.Area());
        System.out.println("----------------------------------");
        // ---------------------------------------------------
        Rectangulo1.setBase(3);
        Rectangulo1.setAltura(4);
        // ---------------------------------------------------
        System.out.println("Rectangulo 1");
        System.out.println(Rectangulo1.getBase() + "x" + Rectangulo1.getAltura());
        System.out.println("Lados= " + Rectangulo1.getLados());
        System.out.println("Area= " + Rectangulo1.Area());
        System.out.println("----------------------------------");
        // ---------------------------------------------------
        Equilatero1.setBase(3);
        Equilatero1.setAltura(4);
        // -----------------------------------------------
        System.out.println("Equilatero 1.");
        System.out.println(Equilatero1.getBase() + "x" + Equilatero1.getAltura());
        System.out.println("Lados= " + Equilatero1.getBase() + ", " + Equilatero1.getBase()
                + ", " + Equilatero1.getBase());
        System.out.println("Lados= " + Equilatero1.getLados());
        System.out.println("Area= " + Equilatero1.Area());
        System.out.println("Perimetro= " + Equilatero1.Perimetro());
        System.out.println("---------------------------------");
        // ---------------------------------------------------
        // Isosceles1.setBase(3);
        // Isosceles1.setAltura(4);
        // Isosceles1.setLadosIguales(5);
        // -----------------------------------------------
        System.out.println("Isosceles 1.");
        System.out.println(Isosceles1.getBase() + "x" + Isosceles1.getAltura());
        System.out.println("Lados= " + Isosceles1.getBase() + ", " +
                Isosceles1.getLadosIguales() + ", " + Isosceles1.getLadosIguales());
        System.out.println("Lados= " + Isosceles1.getLados());
        System.out.println("Area= " + Isosceles1.Area());
        System.out.println("Perimetro= " + Isosceles1.Perimetro());
        System.out.println("----------------------------------");
        // ---------------------------------------------------
        Escaleno1.setBase(3);
        Escaleno1.setAltura(1.5);
        Escaleno1.setLadoMenor(1);
        Escaleno1.setLadoMayor(4);
        // -----------------------------------------------
        System.out.println("Escaleno 1.");
        System.out.println(Escaleno1.getBase() + "x" + Escaleno1.getAltura());
        System.out.println("Lados= " + Escaleno1.getBase() + ", " +
                Escaleno1.getLadoMenor() + ", " + Escaleno1.getLadoMayor());
        System.out.println("Lados= " + Escaleno1.getLados());
        System.out.println("Area= " + Escaleno1.Area());
        System.out.println("Perimetro= " + Escaleno1.Perimetro());
        System.out.println("---------------------------------");
        // -----------------------------------------------
        entrada.close();
    }
}