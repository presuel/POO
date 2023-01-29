#include <iostream>
using namespace std;
#include "estudiante.h"

int main(){
        estudiante Amigo[3];
        Amigo[0].setNombres("Andres");
        Amigo[0].setApellidos("Bojorques");
        Amigo[0].setEdad(99);
        Amigo[1].setNombres("Julia");
        Amigo[1].setEdad(28);
        Amigo[2].setNombres("Maria");
        Amigo[2].setEdad(73);
        if( Amigo[0].getEdad() >  Amigo[1].getEdad() ){
            if ( Amigo[0].getEdad() > Amigo[2].getEdad() ){
                cout << Amigo[0].toString() << " es mayor que todos.\n";
            } else {
                cout << Amigo[2].toString() << " es mayor que todos.\n";
            }
        } else {
            if ( Amigo[1].getEdad() > Amigo[2].getEdad() ){
                cout << Amigo[1].toString() << " es mayor que todos.\n";
            } else {
                cout << Amigo[2].toString() << " es mayor que todos.\n";
            }
        }
    return 0;
}