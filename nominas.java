
// MTI Antonio Armando Presuel Rosado
//
// NOMINA POR MEDIO DE ARCHIVO DE ACCESO DIRECTO.
//
// Long     8 bytes     -   Integer     4 bytes     -   Short       2 bytes
// Byte     1 byte      -   Double      8 bytes     -   Float       4 bytes
// Boolean  1 byte      -   Char        2 bytes     -   String      2 bytes por cada caracter.
// 
// Ojo: al posicionar, en el archivo se recorren los strings x2 y en el programa al contar se avanza x1.
//
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class nominas {

    public static String removerCaracteresEspeciales(String s) {
        if (s == null)
            return null;
        return s.replaceAll("[^\\sA-Za-z0-9]", "");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\nBienvenido al sistema de calculo de nomina.\n---");
        // constantes empleadas
        String encabezado = "AAPR20220611ITS1412101NATECNOLOGICO NACIONAL DE MEXICO CAMPUS HOPELCHEN";
        int base = encabezado.length() * 2;
        int sizeCampo1 = 30; // nombres
        int sizeCampo2 = 30; // apellidos
        int sizeCampo3 = 6; // clave
        int posCampo1 = 0;
        int posCampo2 = posCampo1 + sizeCampo1 * 2;
        int posCampo3 = posCampo2 + sizeCampo2 * 2;
        int posCampo4 = posCampo3 + sizeCampo3 * 2;
        int posCampo5 = posCampo4 + 4;
        int sizeRegFile = posCampo5 + 8;
        // archivos
        String nombreArchivo = "aJv_plantilla.txt";
        RandomAccessFile archivo;
        try {
            archivo = new RandomAccessFile(nombreArchivo, "rw");
            if (archivo.length() == 0) {
                archivo.seek(0);
                StringBuffer bufer;
                bufer = new StringBuffer(encabezado);
                bufer.setLength(encabezado.length());
                archivo.writeChars(bufer.toString());
            } else {
                archivo.seek(0);
                String firma = "", rfc = "", institucion = "";
                for (int i = 0; i < 71; i++) {
                    if (i < 12)
                        firma += archivo.readChar();
                    else if (i < 24)
                        rfc += archivo.readChar();
                    else
                        institucion += archivo.readChar();
                }
                System.out.println("Firma: " + firma + "\nRFC: " + rfc + "\nInstitucion: " + institucion + "\n---\n");
            }
            archivo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // iteracion del menú
        int opcion;
        do {
            System.out.println("Que accion desea realizar?");
            System.out.println("  1- Generar nomina.");
            System.out.println("  2- Ver lista de empleados.");
            System.out.println("  3- Agregar empleado.");
            System.out.println("  4- Consultar empleado.");
            System.out.println("  0- Salir del programa.");
            System.out.print("Opcion: ");
            opcion = scan.nextInt();
            scan.nextLine();
            switch (opcion) {
                case 1: {/////////////////////////////////////////////////////////// GENERAR NOMINA
                    // ------- Datos para la actividad
                    String ArchivoNomina = "bJv_nomina.txt";
                    FileWriter nomina;
                    int registros, baseRegistro;
                    String firma = "", rfc = "", institucion = "";
                    double montoTotal = 0;
                    String cadena;
                    docente empleado = new docente();
                    // -------
                    try {
                        // ------- Abriendo el archivo
                        archivo = new RandomAccessFile(nombreArchivo, "rw");
                        nomina = new FileWriter(ArchivoNomina, true);
                        // Encabezado
                        archivo.seek(0);
                        for (int i = 0; i < 71; i++) {
                            if (i < 12)
                                firma += archivo.readChar();
                            else if (i < 24)
                                rfc += archivo.readChar();
                            else
                                institucion += archivo.readChar();
                        }
                        // ------- Calculando registros en plantilla
                        registros = (int) archivo.length();
                        registros = (registros - base) / sizeRegFile;
                        // Impresion en pantalla
                        cadena = "\nSe genera nomina para " + registros + " empleados.";
                        System.out.print(cadena);
                        // Impresion en archivo de Texto
                        cadena = "\n" + institucion + " (" + rfc + ")\n\n";
                        nomina.write(cadena);
                        cadena = "Nomina de la plantilla docente.\n";
                        nomina.write(cadena);
                        cadena = "-";
                        for (int i = 0; i < 71; i++)
                            nomina.write(cadena);
                        cadena = String.format("\n%-8s| %-50s| %-10s|\n", "Clave", "Empleado", "Sueldo");
                        nomina.write(cadena);
                        cadena = "-";
                        for (int i = 0; i < 71; i++)
                            nomina.write(cadena);
                        // ------- Recuperando y presentando los datos
                        for (int r = 0; r < registros; r++) {
                            baseRegistro = base + (sizeRegFile * r);
                            // ------- Recuperando el registro
                            archivo.seek(baseRegistro + posCampo1);//
                            cadena = "";
                            for (int i = 0; i < sizeCampo1; i++)
                                cadena += archivo.readChar();
                            empleado.setNombres(removerCaracteresEspeciales(cadena));
                            archivo.seek(baseRegistro + posCampo2);//
                            cadena = "";
                            for (int i = 0; i < sizeCampo2; i++)
                                cadena += archivo.readChar();
                            empleado.setApellidos(removerCaracteresEspeciales(cadena));
                            archivo.seek(baseRegistro + posCampo3);//
                            cadena = "";
                            for (int i = 0; i < sizeCampo3; i++)
                                cadena += archivo.readChar();
                            empleado.setClave(removerCaracteresEspeciales(cadena));
                            archivo.seek(baseRegistro + posCampo4);//
                            empleado.setHorasContrato(archivo.readInt());
                            archivo.seek(baseRegistro + posCampo5);//
                            empleado.setPagoHora(archivo.readDouble());
                            // Presentando los datos recuperados
                            String nombreCompleto = empleado.getApellidos() + " " + empleado.getNombres();
                            double Sueldo = empleado.getHorasContrato() * empleado.getPagoHora() * 2;
                            montoTotal += Sueldo;
                            cadena = String.format("\n%-8s| %-50s| %-10s|\n", empleado.getClave(),
                                    nombreCompleto, Sueldo);
                            nomina.write(cadena);
                        }
                        cadena = "-";
                        for (int i = 0; i < 71; i++)
                            nomina.write(cadena);
                        cadena = "\nMonto de la nomina: " + montoTotal + "\n";
                        nomina.write(cadena);
                        System.out.println(cadena);
                        cadena = ("((( " + firma + " )))\n");
                        nomina.write(cadena);
                        // -------
                        nomina.close();
                        archivo.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                    break;
                case 2: {////////////////////////////////////////////////////////// LISTAR PLANTILLA
                    // ------- Datos para la actividad
                    String cadena;
                    docente empleado = new docente();
                    String firma = "", rfc = "", institucion = "";
                    int registros, baseRegistro;
                    // --------- Apertura de archivo para lectura/escritura
                    try {
                        // Encabezado
                        archivo = new RandomAccessFile(nombreArchivo, "rw");
                        archivo.seek(0);
                        for (int i = 0; i < 71; i++) {
                            if (i < 12)
                                firma += archivo.readChar();
                            else if (i < 24)
                                rfc += archivo.readChar();
                            else
                                institucion += archivo.readChar();
                        }
                        System.out.println(
                                "Firma: " + firma + "\nRFC: " + rfc + "\nInstitucion: " + institucion);
                        // ------- Calculando cantidad de registros
                        registros = (int) archivo.length();
                        registros = (registros - base) / sizeRegFile;
                        //
                        for (int r = 0; r < registros; r++) {
                            baseRegistro = base + (sizeRegFile * r);
                            // ------- Recuperando el registro
                            archivo.seek(baseRegistro + posCampo1);//
                            cadena = "";
                            for (int i = 0; i < sizeCampo1; i++)
                                cadena += archivo.readChar();
                            empleado.setNombres(cadena);
                            archivo.seek(baseRegistro + posCampo2);//
                            cadena = "";
                            for (int i = 0; i < sizeCampo2; i++)
                                cadena += archivo.readChar();
                            empleado.setApellidos(cadena);
                            archivo.seek(baseRegistro + posCampo3);//
                            cadena = "";
                            for (int i = 0; i < sizeCampo3; i++)
                                cadena += archivo.readChar();
                            empleado.setClave(cadena);
                            archivo.seek(baseRegistro + posCampo4);//
                            empleado.setHorasContrato(archivo.readInt());
                            archivo.seek(baseRegistro + posCampo5);//
                            empleado.setPagoHora(archivo.readDouble());
                            // Presentando los datos recuperados
                            System.out.print("------- -------\n" + empleado.getClave() + " | ");
                            System.out.println(empleado.getApellidos() + " | " + empleado.getNombres());
                            System.out.println(empleado.getHorasContrato() + " horas | $ " + empleado.getPagoHora());
                            System.out.println("------- -------");
                        }
                        // --- finalizando
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                    break;
                case 3: {/////////////////////////////////////////////////////// AGREGAR EMPLEADO
                    docente empleado = new docente();
                    // ------- Solicitando datos al usuario
                    System.out.println("Nombres: ");
                    empleado.setNombres(scan.nextLine());
                    System.out.println("Apellidos: ");
                    empleado.setApellidos(scan.nextLine());
                    System.out.println("Clave: ");
                    empleado.setClave(scan.nextLine());
                    System.out.println("Pago por hora: ");
                    empleado.setPagoHora(scan.nextDouble());
                    System.out.println("Horas asignadas: ");
                    empleado.setHorasContrato(scan.nextInt());
                    scan.nextLine();
                    // --------- Apertura de archivo para lectura/escritura
                    try {
                        // --------- Almacenamiento en archivo
                        archivo = new RandomAccessFile(nombreArchivo, "rw");
                        archivo.seek(archivo.length());
                        StringBuffer bufer;
                        bufer = new StringBuffer(empleado.getNombres()); //
                        bufer.setLength(sizeCampo1);
                        archivo.writeChars(bufer.toString());
                        bufer = new StringBuffer(empleado.getApellidos()); //
                        bufer.setLength(sizeCampo2);
                        archivo.writeChars(bufer.toString());
                        bufer = new StringBuffer(empleado.getClave()); //
                        bufer.setLength(sizeCampo3);
                        archivo.writeChars(bufer.toString());
                        archivo.writeInt(empleado.getHorasContrato()); //
                        archivo.writeDouble(empleado.getPagoHora()); //
                        // --------- Finalizando
                        archivo.close();
                        System.out.println("Registro agregado.");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                    break;
                case 4: {//////////////////////////////////////////////////////////// CONSULTAR EMPLEADO
                    // ------- Datos para la actividad
                    docente empleado = new docente();
                    int registros, baseRegistro, registroBuscado;
                    String cadena;
                    // --------- Apertura de archivo para lectura
                    try {
                        archivo = new RandomAccessFile(nombreArchivo, "r");
                        // ------- Calculando registros en plantilla
                        registros = (int) archivo.length();
                        registros = (registros - base) / sizeRegFile;
                        System.out.println("Se encontraron " + registros + " registros.");
                        // ------- Ubicando el registro buscado
                        System.out.println("Ingrese el numero de registro a consultar: ");
                        registroBuscado = scan.nextInt();
                        registroBuscado = (registroBuscado > 0) ? registroBuscado - 1 : 0;
                        baseRegistro = base + (sizeRegFile * registroBuscado);
                        // ------- Recuperando el registro deseado
                        archivo.seek(baseRegistro + posCampo1);//
                        cadena = "";
                        for (int i = 0; i < sizeCampo1; i++) {
                            cadena += archivo.readChar();
                        }
                        empleado.setNombres(cadena);
                        archivo.seek(baseRegistro + posCampo2);//
                        cadena = "";
                        for (int i = 0; i < sizeCampo2; i++) {
                            cadena += archivo.readChar();
                        }
                        empleado.setApellidos(cadena);
                        archivo.seek(baseRegistro + posCampo3);//
                        cadena = "";
                        for (int i = 0; i < sizeCampo3; i++) {
                            cadena += archivo.readChar();
                        }
                        empleado.setClave(cadena);
                        archivo.seek(baseRegistro + posCampo4);//
                        empleado.setHorasContrato(archivo.readInt());
                        archivo.seek(baseRegistro + posCampo5);//
                        empleado.setPagoHora(archivo.readDouble());
                        // Finalizando
                        archivo.close();
                        System.out.print("------- -------\n" + empleado.getClave() + " | ");
                        System.out.println(empleado.getApellidos() + " | " + empleado.getNombres());
                        System.out.println(empleado.getHorasContrato() + " horas | $ " + empleado.getPagoHora());
                        System.out.println("------- -------");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                    break;
                case 0:
                    System.out.println("Finalizando el programa.");
                    break;
            }
        } while (opcion != 0);
        // Finalización
        scan.close();
    }
}