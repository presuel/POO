#include <iostream>
using namespace std;
#include "persona.h"

int main(){
    persona persona1;
    persona1.nombres= "Andrea";
    persona1.apellidos= "Presuel";
    persona1.altura= 1.75;
    persona1.peso= 57;
    persona1.edad= 18;
    cout << "Persona 1\n";
    cout << persona1.nombres << " " << persona1.apellidos << "\n";
    cout << "edad: " << persona1.edad << " , altura: " << persona1.altura << " m. , peso: " << persona1.peso << " kg.\n";
    persona persona2;
    persona2.nombres= "Aurora";
    persona2.apellidos= "Presuel";
    persona2.altura= 1.77;
    persona2.peso= 60;
    persona2.edad= 18;
    cout << "\nPersona 2\n";
    cout << persona2.nombres << " " << persona2.apellidos << "\n";
    cout << "edad: " << persona2.edad << " , altura: " << persona2.altura << " m. , peso: " << persona2.peso << " kg.\n";
    cout << "\n";
    return 0;
}