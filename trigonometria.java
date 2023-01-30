import java.io.*; // FileReader, FileWriter
import java.util.Scanner;

public class trigonometria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nombreArchivo;

        // --------------------------------------------------------- Apertura / Creación
        // del archivo
        System.out.println("Ingrese nombre del archivo de trabajo: ");
        nombreArchivo = scan.nextLine();
        nombreArchivo += ".txt";
        try {
            FileWriter fw = new FileWriter(nombreArchivo, true); // append = true
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // --------------------------------------------------------- Acción que realiza
        // el programa
        triangulo Triangulo1 = new triangulo();
        try {
            System.out.println("Ingresa el valor de la base: ");
            Triangulo1.setBase(scan.nextDouble());
            System.out.println("Ingresa el valor de la altura: ");
            Triangulo1.setAltura(scan.nextDouble());
            System.out.println("Area= " + Triangulo1.Area());
            scan.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ------------------------------------------------- Escritura en el archivo
        // (persistencia)
        try {
            FileWriter fw = new FileWriter(nombreArchivo, true); // append = true
            fw.write("Base= " + Triangulo1.getBase() + "\n");
            fw.write("Altura= " + Triangulo1.getAltura() + "\n");
            fw.write("Area= " + Triangulo1.Area() + "\n");
            fw.write("------------------------------------------\n");
            fw.close();
            System.out.println("Se han almacenado en el archivo los resultados.");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // ---------------------------------------------------------- Lectura desde el
        // archivo
        String respuesta = "n";
        System.out.println("Desea ver los resultados almacenados? [s|n]: ");
        respuesta = scan.nextLine();
        if (respuesta.equals("s") || respuesta.equals("S")) {
            BufferedReader bfr;
            try {
                bfr = new BufferedReader(new FileReader(nombreArchivo));
                System.out.println("Contenido del archivo: ");
                String texto = bfr.readLine();
                while (texto != null) {
                    System.out.println(texto);
                    texto = bfr.readLine();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        scan.close();
    }
}