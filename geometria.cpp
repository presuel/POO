#include <iostream>
using namespace std;
#include "triangulo.h"

int main(){
    triangulo triangulo1;
    triangulo1.setBase(3);
    triangulo1.setAltura(4);
    cout << "El area del triangulo de " << triangulo1.getBase() << "x" <<
         triangulo1.getAltura() << " es de " << triangulo1.Area() << "\n";
    triangulo triangulo2 (2, 5.5);
    cout << "El area del triangulo de " << triangulo2.getBase() << "x" <<
         triangulo2.getAltura() << " es de " << triangulo2.Area() << "\n";
}