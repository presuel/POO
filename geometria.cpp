#include <iostream>
#include "circulo.h"
#include "rectangulo.h"
#include "triangulo.h"
#include "equilatero.h"
#include "isosceles.h"
#include "escaleno.h"
using namespace std;

int main(){
     // -----------------------------------------------  
    circulo Circulo1 (5);
    rectangulo Rectangulo1 (3, 5);
    equilatero Equilatero1 (3,5);
    isosceles Isosceles1 (3,4.5,6);
    escaleno Escaleno1 (3, 2, 2, 4);
    triangulo Triangulo1;
    Triangulo1.setBase(3);
    Triangulo1.setAltura(4);
    cout << "Triangulo 1.\n";
    cout << Triangulo1.getBase() << "x" << Triangulo1.getAltura() << "\n";
    cout << "Lados= " << Triangulo1.getLados() << "\n";
    cout << "Area= " << Triangulo1.Area() << "\n";
    cout << "-----------------------------\n";
    // -----------------------------------------------
    //Circulo1.setRadio(4);
    cout << "Circulo 1.\n";
    cout << "radio: " << Circulo1.getRadio() << "\n";
    cout << "Lados= " << Circulo1.getLados() << "\n";
    cout << "Area= " << Circulo1.Area() << "\n";
    cout << "-----------------------------\n";
    // -----------------------------------------------
    //Rectangulo1.setBase(3);
    //Rectangulo1.setAltura(4);
    cout << "Rectangulo 1.\n";
    cout << Rectangulo1.getBase() << "x" << Rectangulo1.getAltura() << "\n";
    cout << "Lados= " << Rectangulo1.getLados() << "\n";
    cout << "Area= " << Rectangulo1.Area() << "\n";
    cout << "-----------------------------\n";
    // -----------------------------------------------
    //Equilatero1.setBase(3);
    //Equilatero1.setAltura(4);
    cout << "Equilatero 1.\n";
    cout << Equilatero1.getBase() << "x" << Equilatero1.getAltura() << "\n";
    cout << "Lados= " << Equilatero1.getBase() << ", " << Equilatero1.getBase() << ", " 
         << Equilatero1.getBase() << ".\n";
    cout << "Lados= " << Equilatero1.getLados() << "\n";
    cout << "Area= " << Equilatero1.Area() << "\n";
    cout << "Perimetro= " << Equilatero1.Perimetro() << "\n";
    cout << "-----------------------------\n";
    // -----------------------------------------------
    //Isosceles1.setBase(3);
    //Isosceles1.setAltura(4);
    //Isosceles1.setLadosIguales(5);
    cout << "Isosceles 1.\n";
    cout << Isosceles1.getBase() << "x" << Isosceles1.getAltura() << "\n";
    cout << "Lados= " << Isosceles1.getBase() << ", " << Isosceles1.getLadosIguales() << ", " 
         << Isosceles1.getLadosIguales() << ".\n";
    cout << "Lados= " << Isosceles1.getLados() << "\n";    
    cout << "Area= " << Isosceles1.Area() << "\n";
    cout << "Perimetro= " << Isosceles1.Perimetro() << "\n";
    cout << "-----------------------------\n";
    // -----------------------------------------------
    //Escaleno1.setBase(3);
    //Escaleno1.setAltura(1.5);
    //Escaleno1.setLadoMenor(1);
    //Escaleno1.setLadoMayor(4);
    // -----------------------------------------------
    cout << "Escaleno 1.\n";
    cout << Escaleno1.getBase() << "x" << Escaleno1.getAltura() << "\n";
    cout << "Lados= " << Escaleno1.getBase() << ", " << Escaleno1.getLadoMenor() << ", " 
         << Escaleno1.getLadoMayor() << ".\n";
    cout << "Lados= " << Escaleno1.getLados() << "\n";    
    cout << "Area= " << Escaleno1.Area() << "\n";
    cout << "Perimetro= " << Escaleno1.Perimetro() << "\n";
    cout << "-----------------------------\n";
    // -----------------------------------------------
    return 0;
}