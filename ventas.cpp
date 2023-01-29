#include <iostream>
using namespace std;
#include "producto.h"

int main(){
    producto producto1;
    producto1.descripcion= "Agua Bonafont 1.2 lt";
    producto1.precio= 13.50;
    producto1.cantidad= 2;
    producto producto2;
    producto2.descripcion= "Agua Bonafont 1.5 lt";
    producto2.precio= 15.00;
    producto2.cantidad= 1;
    producto producto3;
    producto3.descripcion= "CocaCola Light 1.35 lt";
    producto3.precio= 20.80;
    producto3.cantidad= 2;
    // Listado de productos
    cout << "\nLista de productos  \t\t Precio venta \t Cantidad \t Submonto\n";
    cout << "----------------------------------------------------------------------------\n";
    double montoTotal= 0;
    double submonto= producto1.precio*producto1.cantidad;
    montoTotal += submonto;
    cout << producto1.descripcion << "\t\t $ " << producto1.precio << "\t\t " << producto1.cantidad << "\t\t $ " << submonto << "\n";
    submonto= producto2.precio*producto2.cantidad;
    montoTotal += submonto;
    cout << producto2.descripcion << "\t\t $ " << producto2.precio << "\t\t " << producto2.cantidad << "\t\t $ " << submonto << "\n";
    submonto= producto3.precio*producto3.cantidad;
    montoTotal += submonto;
    cout << producto3.descripcion << "\t\t $ " << producto3.precio << "\t\t " << producto3.cantidad << "\t\t $ " << submonto << "\n";
    cout << "----------------------------------------------------------------------------\n";
    cout << "\t\t\t\t\t\t\t Total= $ " << montoTotal << "\n";
    cout << "\n";



    return 0;
}