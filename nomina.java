import java.util.Scanner;

public class nomina {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombres, apellidos, clave;
        // -----------------------------------------
        System.out.println("Ingrese el nombre del docente: ");
        nombres = entrada.nextLine();
        System.out.println("Ingrese los apellidos del docente: ");
        apellidos = entrada.nextLine();
        System.out.println("Ingrese la clave del empleado: ");
        clave = entrada.nextLine();
        docente Empleado1 = new docente(nombres, apellidos, clave);
        // -----------------------------------------
        System.out.println("Cantidad de horas contratadas: ");
        Empleado1.setHorasContrato(entrada.nextInt());
        entrada.nextLine();
        System.out.println("Monto a pagar por hora: ");
        Empleado1.setPagoHora(entrada.nextDouble());
        entrada.nextLine();
        // ------------------------------------------
        entrada.close();
        System.out.println(Empleado1.toString());
    }
}
