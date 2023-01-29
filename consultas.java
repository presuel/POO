import java.util.Scanner;

public class consultas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        paciente Paciente1 = new paciente();
        // --------------------------------------------
        System.out.println("Ingrese los nombres del paciente: ");
        Paciente1.setNombres(entrada.nextLine());
        System.out.println("Ingrese los apellidos del paciente: ");
        Paciente1.setApellidos(entrada.nextLine());
        System.out.println("Ingrese el peso: ");
        // --------------------------------------------
        Paciente1.setPeso(entrada.nextDouble());
        entrada.nextLine();
        System.out.println("Ingrese la estatura: ");
        Paciente1.setEstatura(entrada.nextDouble());
        entrada.nextLine();
        // ----------------------------------------------
        System.out.println("Ingrese la fecha de la consulta: ");
        Paciente1.setFecha(entrada.nextLine());
        System.out.println("Ingrese los síntomas: ");
        Paciente1.setSintomas(entrada.nextLine());
        System.out.println(Paciente1.toString());
        // ----------------------------------------------
        entrada.close();
    }
}
