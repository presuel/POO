//
// Calcula áreas de triangulos y los resultados los almacena como archivo de texto.
//
#include <iostream>
#include <fstream>
#include "triangulo.h"
using namespace std;

int main(){
    fstream archivo;
    string nombreArchivo;

    // --------------------------------------------------------- Apertura / Creación del archivo
    cout << "Ingrese nombre del archivo de trabajo: ";
    getline(cin, nombreArchivo);
    // se añade extensión propia de archivo de texto.
    nombreArchivo += ".txt";
    // open() usa por defecto ios::out que borra el contenido, se usará ios::in para lectura.
    archivo.open(nombreArchivo.c_str(), ios::in);
    // fail() devuelve un valor distinto a 0 si existe un error con el archivo.
    if( archivo.fail() ){
        cerr << ">>> No se encontro el archivo " << nombreArchivo << ", se creara al finalizar.\n";
    }
    archivo.close();
    cout << "---------------------------------------------------------------------\n";

    // --------------------------------------------------------- Acción que realiza el programa
    triangulo Triangulo1;
    try{
        double valorReal;
        cout << "Ingresa el valor de la base: ";
        cin >> valorReal;
        Triangulo1.setBase(valorReal);
        cout << "Ingresa el valor de la altura: ";
        cin >> valorReal;
        Triangulo1.setAltura(valorReal);
        cout << "Area= " << Triangulo1.Area() << "\n";
    }catch(int){
        cout << "Los valores de la base y altura no pueden ser menores o iguales a cero.";
        return 1;
    }    
    cout << "---------------------------------------------------------------------\n";

    // ------------------------------------------------- Escritura en el archivo (persistencia)
    // El modo ios::app permite crear un archivo o abrirlo y añadir datos al final (append).
    archivo.open(nombreArchivo.c_str(), ios::app);
    // Operador << Escritura a archivo
    archivo << "Base= " << Triangulo1.getBase() << "\n";
    archivo << "Altura= " << Triangulo1.getAltura() << "\n";
    archivo << "Area= " << Triangulo1.Area() << "\n";
    archivo << "---------------------------------\n";
    archivo.close();
    cout << "Se han almacenado en el archivo los resultados.\n";

    // ---------------------------------------------------------- Lectura desde el archivo
    char respuesta= 'n';
    cout << "Desea ver los resultados almacenados? [s|n]: ";
    cin >> respuesta;
    if( respuesta == 's' || respuesta == 'S'){
        // el modo ios::in permite la lectura desde el archivo.
        archivo.open(nombreArchivo.c_str(), ios::in);
        cout << "Contenido del archivo:\n";
        string cadena;
        // eof() devuelve un valor distinto a cero si el flujo ha alcanzado el final de archivo.
        while ( !archivo.eof() ){
            getline( archivo, cadena );
            cout << cadena << "\n";
        }
    }
    return 0;
}