//
// Se almacenan y recuperan datos de un archivo de texto (grupo de estudiantes)
// Se crea un archivo de texto con el pase de lista.
//
#include <iostream>
#include <fstream>
#include <iomanip> // para setw() y system()
#include "estudiante.h"
using namespace std;

int main(){
    // -------------------------------------------------------------------------------
    cout << "Bienvenido al sistema de pase de lista.\n";
	fstream fileGrupo;   
    string cadena;
    int contador= -1;	
    fileGrupo.open("grupo.txt", ios::in);
    if( !fileGrupo ){
        fileGrupo.open("grupo.txt", ios::app);
        contador= 0;
    }else{
        while ( !fileGrupo.eof() ){
            getline( fileGrupo, cadena ); // Matricula
            getline( fileGrupo, cadena ); // Nombres
            getline( fileGrupo, cadena ); // Apellidos
            contador++;
        }
    }    
    fileGrupo.close();
    if(contador){
        cout << "Registros de estudiantes encontrados: " << contador << "\n";
    }else{
        cout << "Archivo 'grupo.txt' vacio, favor de agregar estudiantes.\n";
    }    
    cout << "----------------------------------------------------------------\n";    
    // -------------------------------------------------------------------------------
    int opcion= 0;
    do
    {
        //system("cls");
        cout << "\nMenu:\n";
        cout << "1) Pase de lista.\n";
        cout << "2) agregar estudiante.\n";
        cout << "0) finalizar programa.\n";
        cout << "opcion: ";
        cin >> opcion;
        cin.ignore();

        switch (opcion)
        {
            case 1: // PASE DE LISTA
            {
                // ------------------------ Actualizando cantidad de estudiantes
                contador= -1;
                fileGrupo.open("grupo.txt", ios::in);
                while ( !fileGrupo.eof() ){
                    getline( fileGrupo, cadena ); // Matricula
                    getline( fileGrupo, cadena ); // Nombres
                    getline( fileGrupo, cadena ); // Apellidos
                    contador++;
                }
                fileGrupo.close();

                // ------------------------------------ Pase de lista
                if(contador > 0){
                    // --------------------- se crea arreglo Grupo y se rellena
                    estudiante grupo[contador];
                    fileGrupo.open("grupo.txt", ios::in);
                    for(int i=0; i<contador; i++){
                        getline( fileGrupo, cadena ); // Matricula
                        grupo[i].setMatricula( cadena );
                        getline( fileGrupo, cadena ); // Nombres
                        grupo[i].setNombres( cadena );
                        getline( fileGrupo, cadena ); // Apellidos
                        grupo[i].setApellidos( cadena );
                    }
                    fileGrupo.close();

                    // -------------------- Se crea archivo de pase de lista
                    fstream archivo;
                    string nombreArchivo;
                    cout << "Ingrese el nombre del archivo para el pase de lista (AAAAMMDD): ";
                    getline(cin, nombreArchivo);
                    nombreArchivo += ".txt";
                    archivo.open(nombreArchivo.c_str(), ios::out);
                    archivo.close();

                    // ------------------------------- pasando lista
                    cout << "Indicar p si esta PRESENTE o f si esta FALTANDO.\n";
                    cout << "Se aplica 'presente' por omision al presionar enter.\n";
                    for( int i= 0; i<contador; i++){                        
                        char estado;
                        cout << i+1 << ") ";
                        cout << grupo[i].getNombres() << " " << grupo[i].getApellidos() << ". ";
                        cout << "\t\tEstatus: ";
                        cin >> estado;
                        if( estado == 'p' || estado == 'P'){
                            grupo[i].setAsistencia(true);
                        }else if( estado == 'f' || estado == 'F'){
                            grupo[i].setAsistencia(false);
                        }else{ // Valor si se ingresa un valor distinto a P|p|F|f: true.
                            grupo[i].setAsistencia(true);
                        }

                        // --------------------------------- almacenando (persistencia)
                        archivo.open(nombreArchivo.c_str(), ios::out);
                        archivo << setw(6) << "Clave" << setw(40) << "Estudiante" << setw(10) << "Estado";
                        archivo << "\n";
                        archivo << setw(57) << setfill('-') << "-";
                        archivo << setfill(' ') << "\n";
                        for( int i= 0; i<contador; i++){
                            archivo << setw(6) << grupo[i].getMatricula();
                            archivo << setw(40) << ( grupo[i].getNombres() + " "
                                    + grupo[i].getApellidos() );
                            if( grupo[i].getAsistencia() == true ){
                                archivo << setw(10) << "Presente" << "\n";
                            }else{
                                archivo << setw(10) << "Falta" << "\n";
                            }
                        }
                        archivo.close();
                    }
                    cout << "Pase de lista finalizado!\n";
                }else{
                    cout << "No hay estudiantes registrados.\n";
                }
            }
            break;

            case 2: // AGREGAR ESTUDIANTE
            {
                // -------------------------------------- solicitando datos
                string valorCadena;
                estudiante Estudiante1;
                cout << "\nMatricula: ";
                getline(cin, valorCadena);
                Estudiante1.setMatricula(valorCadena);            
                cout << "Nombres: ";            
                getline(cin, valorCadena);
                Estudiante1.setNombres(valorCadena);
                cout << "Apellidos: ";
                getline(cin, valorCadena);
                Estudiante1.setApellidos(valorCadena);

                // --------------------- guardando al archivo (persistencia)
                fileGrupo.open("grupo.txt", ios::app);
                fileGrupo << Estudiante1.getMatricula() << "\n";
                fileGrupo << Estudiante1.getNombres() << "\n";
                fileGrupo << Estudiante1.getApellidos() << "\n";
                fileGrupo.close();
            }
            break;
        }
    } while (opcion != 0);
    system("pause");
    return 0;
}