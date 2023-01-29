#include <iostream>
using namespace std;
#include "producto.h"

int main(){
    producto producto1( "Agua Bonafont 1.2 lt", 13.50, 2);
    producto producto2("Agua Bonafont 1.5 lt", 15.00, 1);
    producto producto3("CocaCola Light 1.35 lt", 20.80, 2);
    // Listado de productos
    cout << "\nLista de productos  \t\t Precio venta \t Cantidad \t Submonto\n";
    cout << "----------------------------------------------------------------------------\n";
    double montoTotal= 0;
    double submonto= producto1.getPrecio()*producto1.getCantidad();
    montoTotal += submonto;
    cout << producto1.getDescripcion() << "\t\t $ " << producto1.getPrecio() << "\t\t " << producto1.getCantidad() << "\t\t $ " << submonto << "\n";
    submonto= producto2.getPrecio()*producto2.getCantidad();
    montoTotal += submonto;
    cout << producto2.getDescripcion() << "\t\t $ " << producto2.getPrecio() << "\t\t " << producto2.getCantidad() << "\t\t $ " << submonto << "\n";
    submonto= producto3.getPrecio()*producto3.getCantidad();
    montoTotal += submonto;
    cout << producto3.getDescripcion() << "\t\t $ " << producto3.getPrecio() << "\t\t " << producto3.getCantidad() << "\t\t $ " << submonto << "\n";
    cout << "----------------------------------------------------------------------------\n";
    cout << "\t\t\t\t\t\t\t Total= $ " << montoTotal << "\n";
    cout << "\n";
    return 0;
}