#include <iostream>
using namespace std;
#include "paciente.h"

int main(){
    paciente Paciente1;
    string valorCadena;
    int valorEntero;
    double valorReal;
    // -----------------------------------
    cout << "Ingrese los nombres del paciente: ";
    getline(cin, valorCadena);
    Paciente1.setNombres(valorCadena);
    cout << "Ingrese los apellidos del paciente: ";
    getline(cin, valorCadena);
    Paciente1.setApellidos(valorCadena);
    // -----------------------------------
    cout << "Ingrese el peso: ";
    cin >> valorReal;
    cin.ignore();
    Paciente1.setPeso(valorReal);
    cout << "Ingrese la estatura: ";
    cin >> valorReal;
    cin.ignore();
    Paciente1.setEstatura(valorReal);
    cout << "Ingrese la fecha de la consulta: ";
    getline(cin, valorCadena);
    Paciente1.setFecha(valorCadena);
    cout << "Ingrese los síntomas: ";
    getline(cin, valorCadena);
    Paciente1.setSintomas(valorCadena);
    cout << "\n\n----------------------------\n";
    cout << "Datos del paciente:\n";
    cout << Paciente1.toString();
    cout << "IMC: " << Paciente1.IMC();
    return 0;
}