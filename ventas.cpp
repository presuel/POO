#include <iostream>
using namespace std;
#include "producto.h"

int main(){
    producto producto1( "Agua Bonafont 1.2 lt", 13.50, 12);
    producto producto2("Agua Bonafont 1.5 lt", 15.00, 12);
    producto producto3("CocaCola Light 1.35 lt", 20.80, 12);
    cout << "\nProductos existentes \t\t Precio venta \t Cantidad\n";
    cout << "----------------------------------------------------------------------------\n";
    cout << producto1.getDescripcion() << "\t\t $ " << producto1.getPrecio() << "\t\t " << producto1.getCantidad() << "\n";
    cout << producto2.getDescripcion() << "\t\t $ " << producto2.getPrecio() << "\t\t " << producto2.getCantidad() << "\n";
    cout << producto3.getDescripcion() << "\t\t $ " << producto3.getPrecio() << "\t\t " << producto3.getCantidad() << "\n";
    cout << "----------------------------------------------------------------------------\n\n\n";
    // Listado de productos
    cout << "\nProductos vendidos \t\t Precio venta \t Cantidad \t Submonto\n";
    cout << "----------------------------------------------------------------------------\n";
    int cantidadVendida;
    double montoTotal= 0;
    cantidadVendida= 3; // Se venden 3 piezas de producto1
    producto1.Venta(cantidadVendida);
    double submonto= producto1.getPrecio()*cantidadVendida;
    montoTotal += submonto;
    cout << producto1.getDescripcion() << "\t\t $ " << producto1.getPrecio() << "\t\t " << cantidadVendida << "\t\t $ " << submonto << "\n";
    cantidadVendida= 1; // Se vende 1 pieza de producto2
    producto2.Venta(cantidadVendida);
    submonto= producto2.getPrecio()*cantidadVendida;
    montoTotal += submonto;
    cout << producto2.getDescripcion() << "\t\t $ " << producto2.getPrecio() << "\t\t " << cantidadVendida << "\t\t $ " << submonto << "\n";
    cantidadVendida= 5; // Se venden 5 piezas de producto3
    producto3.Venta(cantidadVendida);
    submonto= producto3.getPrecio()*cantidadVendida;
    montoTotal += submonto;
    cout << producto3.getDescripcion() << "\t\t $ " << producto3.getPrecio() << "\t\t " << cantidadVendida << "\t\t $ " << submonto << "\n";
    cout << "----------------------------------------------------------------------------\n";
    cout << "\t\t\t\t\t\t\t Total= $ " << montoTotal << "\n\n";
    cout << "\nProductos existentes \t\t Precio venta \t Cantidad\n";
    cout << "----------------------------------------------------------------------------\n";
    cout << producto1.getDescripcion() << "\t\t $ " << producto1.getPrecio() << "\t\t " << producto1.getCantidad() << "\n";
    cout << producto2.getDescripcion() << "\t\t $ " << producto2.getPrecio() << "\t\t " << producto2.getCantidad() << "\n";
    cout << producto3.getDescripcion() << "\t\t $ " << producto3.getPrecio() << "\t\t " << producto3.getCantidad() << "\n";
    cout << "----------------------------------------------------------------------------\n\n\n";
    return 0;
}