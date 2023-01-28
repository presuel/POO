#include <iostream>
using namespace std;
#include "triangulo.h"

int main(){
    triangulo triangulo1;
    triangulo1.base= 3;
    triangulo1.altura= 4;
    cout << "El area del triangulo de " << triangulo1.base << "x" <<
         triangulo1.altura << " es de " << triangulo1.base*triangulo1.altura/2 << "\n";
    triangulo triangulo2;
    triangulo2.base= 2;
    triangulo2.altura= 5.5;
    cout << "El area del triangulo de " << triangulo2.base << "x" <<
         triangulo2.altura << " es de " << triangulo2.base*triangulo2.altura/2 << "\n";
}