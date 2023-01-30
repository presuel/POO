
// MTI Antonio Armando Presuel Rosado
//
// NOMINA POR MEDIO DE ARCHIVO DE ACCESO DIRECTO.
//

#include <iostream>
#include <fstream>
#include <cstdlib> // system()
#include <iomanip> // para setw() y system()
#include "docente.h"
using namespace std;

int main(){
    // ------- Constantes empleadas
    const int sizeCampo1= 30;
    const int sizeCampo2= 30;
    const int sizeCampo3= 6; 
    const int posCampo2= sizeCampo1;
    const int posCampo3= posCampo2+sizeCampo2;
    const int posCampo4= posCampo3+sizeCampo3;
    const int posCampo5= posCampo4+sizeof(int);
    const int sizeReg= sizeCampo1+sizeCampo2+sizeCampo3+sizeof(int)+sizeof(double);
    const int base= 71;
    // ------- Archivos
    string nombreArchivo= "a_plantilla.txt";
    string ArchivoNomina= "b_nomina.txt";
    fstream archivo;    
    archivo.open(nombreArchivo, ios::in);
    if(!archivo){
        archivo.open(nombreArchivo, ios::out);
        archivo << "AAPR20220516ITS1412101NATECNOLOGICO NACIONAL DE MEXICO CAMPUS HOPELCHEN";
    }
    archivo.close();
    // ------- Iteración del menú
    int opcion;
    do{
        system("cls");
        // ------- Menú
        cout << "Que accion desea realizar?\n";
        cout << "  1- Generar nomina.\n";
        cout << "  2- Ver lista de empleados.\n";
        cout << "  3- Agregar empleado.\n";
        cout << "  4- Consultar empleado.\n";
        cout << "  0- Salir del programa.\n";
        cout << "Opcion: ";
        cin >> opcion;
        cin.ignore();
        //
        switch(opcion){
            case 1:{ /////////////////////////////////////////////////////////// GENERAR NOMINA
                // ------- Datos para la actividad
                int registros;
                string autor= "", rfc= "", empresa= "";
                double montoTotal= 0;
                string cadena;
                // ------- Abriendo el archivo
                fstream nomina;
                nomina.open(ArchivoNomina, ios::out);
                archivo.open(nombreArchivo, ios::in);
                archivo.seekg (0, ios::beg);
                // ------- Encabezado
                for(int i=0; i<base; i++){
                    char x= archivo.get();
                    (i<12)? autor += x : (i<24)? rfc += x : empresa += x;
                }
                system("cls");
                cadena= "\n"+empresa+" ("+rfc+")\n\n";
                nomina.write(cadena.c_str(), cadena.length());
                cadena= "Nomina de la plantilla docente.\n";
                nomina.write(cadena.c_str(), cadena.length());
                nomina << setw( 76 ) << setfill( '-' ) << '\n' << setfill( ' ' );
                nomina << "| " << right << setw( 8 ) << "Clave  " << "|"
                       << left << setw( 50 ) << " Empleado" << " | "
                       << right << setw( 10 ) << "Sueldo  " << "|\n";
                nomina << setw( 76 ) << setfill( '-' ) << '\n' << setfill( ' ' );
                // ------- Calculando registros en plantilla
                archivo.seekg (0, archivo.end);
                registros = archivo.tellg();
                registros= (registros-base)/sizeReg;
                // ------- Recuperando y presentando los datos
                for(int i=0; i<registros; i++){
                    // ------- Datos para la actividad
                    string nombres, apellidos, clave;
                    double pagoHora;
                    int horasAsignadas;
                    int baseRegistro= base+(sizeReg*i);
                    char x;
                    // ---
                    archivo.seekg (baseRegistro, archivo.beg);                    
                    while( (x= archivo.get()) && x != 30 ){ nombres += x; }
                    archivo.seekg (baseRegistro+posCampo2, archivo.beg);
                    while( (x= archivo.get()) && x != 30 ){ apellidos += x; } 
                    archivo.seekg (baseRegistro+posCampo3, archivo.beg);
                    while( (x= archivo.get()) && x != 30 ){ clave += x; } 
                    archivo.seekg (baseRegistro+posCampo4, archivo.beg);                    
                    archivo.read((char *) &horasAsignadas, sizeof(int));
                    archivo.seekg (baseRegistro+posCampo5, archivo.beg);
                    archivo.read((char *) &pagoHora, sizeof(double));
                    // ---
                    double subMonto= int(horasAsignadas)*double(pagoHora)*2;
                    montoTotal+= subMonto;
                    nomina << "| " << right << setw( 7 ) << clave << " | "
                           << left << setw( 49 ) << (apellidos + ", " + nombres) << " | "
                           << right << setw( 9 ) << fixed << setprecision(2) << subMonto << " |" << endl;
                }
                nomina << setw( 76 ) << setfill( '-' ) << '\n' << setfill( ' ' );
                nomina << "Monto de la nomina: $";
                nomina << fixed << setprecision(2) << montoTotal << " pesos.\n";
                nomina.close();
                archivo.close();
                cout << "El monto de la nomina es de $" << montoTotal << " pesos.\n";
                cout << "Se ha generado la nomina en el archivo correspondiente.\n";
                system("pause");
            }
            break;
            case 2:{ ////////////////////////////////////////////////////////// LISTAR PLANTILLA
                // ------- Datos para la actividad
                int registros;
                string autor= "", rfc= "", empresa= "";
                // ------- Abriendo el archivo
                archivo.open(nombreArchivo, ios::in);                
                archivo.seekg (0, ios::beg);
                // Encabezado
                for(int i=0; i<base; i++){
                    char x= archivo.get();
                    (i<12)? autor += x : (i<24)? rfc += x : empresa += x;
                }
                system("cls");
                cout << "\n" << empresa << " (" << rfc << ")\n" << ".:. " << autor << " .:.\n\n";
                cout << "Plantilla docente.\n------------------------------------------------\n";
                // ------- Calculando registros en plantilla
                archivo.seekg (0, archivo.end);
                registros = archivo.tellg();
                registros= (registros-base)/sizeReg;
                // ------- Recuperando y presentando los datos
                for(int i=0; i<registros; i++){
                    // ------- Datos para la actividad
                    string nombres, apellidos, clave;
                    double pagoHora;
                    int horasAsignadas;
                    int baseRegistro= base+(sizeReg*i);
                    char x;
                    // ---
                    archivo.seekg (baseRegistro, archivo.beg);                    
                    while( (x= archivo.get()) && x != 30 ){ nombres += x; }
                    archivo.seekg (baseRegistro+posCampo2, archivo.beg);
                    while( (x= archivo.get()) && x != 30 ){ apellidos += x; } 
                    archivo.seekg (baseRegistro+posCampo3, archivo.beg);
                    while( (x= archivo.get()) && x != 30 ){ clave += x; } 
                    archivo.seekg (baseRegistro+posCampo4, archivo.beg);                    
                    archivo.read((char *) &horasAsignadas, sizeof(int));
                    archivo.seekg (baseRegistro+posCampo5, archivo.beg);
                    archivo.read((char *) &pagoHora, sizeof(double));
                    // ---
                    cout << i+1 << ") " << clave << " - " 
                         << apellidos << ", " << nombres << ". Horas: " 
                         << horasAsignadas << ", $" << pagoHora << " pesos.\n";
                }
                archivo.close();
                cout << "\n";
                system("pause");
            }
            break;
            case 3:{ /////////////////////////////////////////////////////// AGREGAR EMPLEADO                
                // ------- Datos para la actividad
                docente empleado;
                string cadena;
                int entero;
                double real;
                // ------- Solicitando datos al usuario
                cout << "Nombres: ";
                getline(cin, cadena);
                empleado.setNombres(cadena);
                cout << "Apellidos: ";
                getline(cin, cadena);
                empleado.setApellidos(cadena);
                cout << "Clave: ";
                getline(cin, cadena);
                empleado.setClave(cadena);
                cout << "Pago por hora: ";
                cin >> real; 
                empleado.setPagoHora(real);
                cout << "Horas asignadas: ";
                cin >> entero;
                empleado.setHorasContrato(entero);
                cin.ignore();
                // --------- Apertura de archivo, apuntando al final.
                archivo.open(nombreArchivo, ios::app);
                archivo.seekp (0, ios::end);
                // --------- Almacenamiento en archivo
                cadena= empleado.getNombres() + (char)30;
                archivo.write(cadena.c_str(), sizeCampo1);
                cadena= empleado.getApellidos() + (char)30;
                archivo.write(cadena.c_str(), sizeCampo2);
                cadena= empleado.getClave()+(char)30;
                archivo.write(cadena.c_str(), sizeCampo3);                
                entero= empleado.getHorasContrato();
                archivo.write((char *)&entero, sizeof(int));
                real= empleado.getPagoHora();
                archivo.write((char *)&real, sizeof(double));
                // --------- Finalizando         
                archivo.close();
                cout << "Registro agregado!\n";
                system("pause");
                system("cls"); 
            }
            break;
            case 4:{ //////////////////////////////////////////////////////////// CONSULTAR EMPLEADO                
                // ------- Datos para la actividad
                int registros, baseRegistro, registroBuscado, horasAsignadas;                
                string nombres, apellidos, clave;
                double pagoHora;                
                char x;
                // ------- Calculando registros en plantilla
                archivo.open(nombreArchivo, ios::in);
                archivo.seekg (0, archivo.end);
                registros = archivo.tellg();
                registros= (registros-base)/sizeReg;
                cout << "\n-------\nSe encontraron " << registros << " registros.\n"; 
                cout << "Ingrese el numero de registro a consultar: ";                
                cin >> registroBuscado; // pendiente validar con if | try.
                (registroBuscado>0)? registroBuscado-- : registroBuscado= 0;
                baseRegistro= base+(sizeReg*registroBuscado);
                // ------- Recuperando y presentan el registro deseado         
                archivo.seekg (baseRegistro, archivo.beg);
                while( (x= archivo.get()) && x != 30 ){ nombres += x; }
                archivo.seekg (baseRegistro+posCampo2, archivo.beg);
                while( (x= archivo.get()) && x != 30 ){ apellidos += x; } 
                archivo.seekg (baseRegistro+posCampo3, archivo.beg);
                while( (x= archivo.get()) && x != 30 ){ clave += x; } 
                archivo.seekg (baseRegistro+posCampo4, archivo.beg);                    
                archivo.read((char *) &horasAsignadas, sizeof(int));
                archivo.seekg (baseRegistro+posCampo5, archivo.beg);
                archivo.read((char *) &pagoHora, sizeof(double));       
                // ------- Presentación del dato recuperado
                cout << clave << " - " << apellidos << ", " << nombres << ". Horas: " 
                        << horasAsignadas << ", $" << pagoHora << " pesos.\n";
                archivo.close();
                cout << "\n";
                system("pause");
                system("cls");
            }
            break;
            case 0:{ // FINALIZA EL PROGRAMA
                cout << "Finalizando el programa!\n";
            }
            break;
        }
    }while(opcion != 0);
    //
    system("pause");
    return 0;
}