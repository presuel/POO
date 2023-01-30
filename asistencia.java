
//
// Se almacenan y recuperan datos de un archivo de texto (grupo de estudiantes)
// Se crea un archivo de texto con el pase de lista.
//
import java.io.*;
import java.util.Scanner;

public class asistencia {
    public static void main(String[] args) {
        // -------------------------------------------------------------------------
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de pase de lista.\n");
        int contador = -1;

        // -------------------------------------------------------------------------
        try (FileWriter fw = new FileWriter("grupoJava.txt", true)) {
            fw.close();
            contador = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }

        // -------------------------------------------------------------------------
        try (BufferedReader bfr = new BufferedReader(new FileReader("grupoJava.txt"))) {
            String texto = bfr.readLine();
            contador++;
            while (texto != null) {
                texto = bfr.readLine();
                contador++;
            }
            contador /= 3;
        } catch (Exception e) {
            e.printStackTrace();
        }

        // -------------------------------------------------------------------------

        if (contador > 0) {
            System.out.println("Registros de estudiantes encontrados: " + contador);
        } else {
            System.out.println("Archivo de grupo esta vacio. Favor de agregar estudiantes.");
        }
        System.out.println("----------------------------------------------------------------");

        // -------------------------------------------------------------------------
        int opcion = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1) Pase de lista.");
            System.out.println("2) Agregar estudiante.");
            System.out.println("0) Finalizar programa.");
            System.out.println("opcion: ");
            opcion = scan.nextInt();
            scan.nextLine();

            switch (opcion) {
                case 1: // PASE DE LISTA
                {
                    // ---------------------------------- Actualizando cantidad de estudiantes
                    contador = -1;
                    try (BufferedReader bfr = new BufferedReader(new FileReader("grupoJava.txt"))) {
                        String texto = bfr.readLine();
                        contador++;
                        while (texto != null) {
                            texto = bfr.readLine();
                            contador++;
                        }
                        contador /= 3;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    // ------------------------------------------------------ Pase de lista
                    if (contador > 0) {
                        // ------------------------------- se crea arreglo Grupo y se rellena
                        estudiante grupo[] = new estudiante[contador];
                        for (int i = 0; i < contador; i++) {
                            grupo[i] = new estudiante();
                        }
                        try (BufferedReader bfr = new BufferedReader(new FileReader("grupoJava.txt"))) {
                            String texto;
                            for (int i = 0; i < contador; i++) {
                                texto = bfr.readLine();
                                grupo[i].setMatricula(texto);
                                texto = bfr.readLine();
                                grupo[i].setNombres(texto);
                                texto = bfr.readLine();
                                grupo[i].setApellidos(texto);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                        // --------------------------------- Se crea archivo de pase de lista
                        String nombreArchivo;
                        System.out.println("Ingrese el nombre del archivo para el pase de lista (AAAAMMDD): ");
                        nombreArchivo = scan.nextLine();
                        nombreArchivo += ".txt";

                        try (BufferedWriter archivo = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
                            // ------------------------------- pasando lista
                            System.out.println("Indicar p si esta PRESENTE o f si esta FALTANDO.");
                            System.out.println("Se aplica 'presente' por omisión al presionar enter.");
                            for (int i = 0; i < contador; i++) {
                                String estado;
                                System.out.print("(" + (i + 1) + ") " + grupo[i].getNombres() + " " +
                                        grupo[i].getApellidos() + ". \t\tEstatus: ");
                                estado = scan.nextLine();
                                if (estado.equals("p") || estado.equals("P")) {
                                    grupo[i].setAsistencia(true);
                                } else if (estado.equals("f") || estado.equals("F")) {
                                    grupo[i].setAsistencia(false);
                                } else { // Valor si se ingresa un valor distinto a P|p|F|f: true.
                                    grupo[i].setAsistencia(true);
                                }
                            }
                            System.out.println("Pase de lista finalizado!");

                            // --------------------------------- almacenando (persistencia)
                            String cadenaF = String.format("%-6s%-40s%-10s\n", "Clave", "Estudiante", "Estado");
                            archivo.write(cadenaF);
                            // setw(57) << setfill('-') << "-"
                            archivo.write("-----------------------------------------------------------------\n");
                            // archivo << setfill(' ') << "\n";
                            for (int i = 0; i < contador; i++) {
                                cadenaF = String.format("%-6s", grupo[i].getMatricula());
                                archivo.write(cadenaF);
                                String nombreCompleto = grupo[i].getNombres() + " " + grupo[i].getApellidos();
                                cadenaF = String.format("%-40s", nombreCompleto);
                                archivo.write(cadenaF);
                                if (grupo[i].getAsistencia()) {
                                    cadenaF = String.format("%-10s\n", "Presente");
                                } else {
                                    cadenaF = String.format("%-10s\n", "Falta");
                                }
                                archivo.write(cadenaF);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        System.out.println("No hay estudiantes registrados.");
                    }
                }
                    break;

                case 2: // AGREGA UN ESTUDIANTE
                {
                    // -------------------------------------- solicitando datos
                    String valorCadena;
                    estudiante Estudiante1 = new estudiante();
                    System.out.println("Matricula: ");
                    valorCadena = scan.nextLine();
                    Estudiante1.setMatricula(valorCadena);
                    System.out.println("Nombres: ");
                    valorCadena = scan.nextLine();
                    Estudiante1.setNombres(valorCadena);
                    System.out.println("Apellidos: ");
                    valorCadena = scan.nextLine();
                    Estudiante1.setApellidos(valorCadena);

                    // --------------------- guardando al archivo (persistencia)
                    try (BufferedWriter bfw = new BufferedWriter(
                            new FileWriter("grupoJava.txt", true))) {
                        bfw.write(Estudiante1.getMatricula() + "\n");
                        bfw.write(Estudiante1.getNombres() + "\n");
                        bfw.write(Estudiante1.getApellidos() + "\n");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                    break;
            }
        } while (opcion != 0);

        // -------------------------------------------------------------------------
        scan.close();
    }
}