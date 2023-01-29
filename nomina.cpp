#include <iostream>
using namespace std;
#include "docente.h"

int main(){
    string nombres, apellidos, clave;
    int horas;
    double pagoHora;
    //-------------
    cout << "Ingrese el nombre del docente: ";
    getline(cin, nombres);
    cout << "Ingrese los apellidos del docente: ";
    getline(cin, apellidos);
    cout << "Ingrese la clave del empleado: ";
    getline(cin, clave);

    docente Empleado1(nombres, apellidos, clave);

    cout << "Cantidad de horas contratadas: ";
    cin >> horas;
    cin.ignore();
    Empleado1.setHorasContrato(horas);
    
    cout << "Monto a pagar por hora: ";
    cin >> pagoHora;
    cin.ignore();
    Empleado1.setPagoHora(pagoHora);

    cout << "\nEmpleado: " << Empleado1.getNombres() << " " << Empleado1.getApellidos() << ".\n";
    cout << "Monto a pagar esta quincena: $" << Empleado1.getHorasContrato()*Empleado1.getPagoHora()*2 << "\n";
    return 0;
}