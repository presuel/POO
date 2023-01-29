#include <iostream>
using namespace std;
#include "persona.h"

int main(){
    persona persona1("Andrea", "Presuel", 18);
    persona1.setEstatura(1.75);
    persona1.setPeso(57);
    cout << "Persona 1\n";
    cout << persona1.getNombres() << " " << persona1.getApellidos() << "\n";
    cout << "edad: " << persona1.getEdad() << " , altura: " << persona1.getEstatura() << " m. , peso: " << persona1.getPeso() << " kg.\n";    
    persona persona2("Aurora", "Presuel", 18, 1.77, 60);
    cout << "\nPersona 2\n";
    cout << persona2.getNombres() << " " << persona2.getApellidos() << "\n";
    cout << "edad: " << persona2.getEdad() << " , altura: " << persona2.getEstatura() << " m. , peso: " << persona2.getPeso() << " kg.\n";
    cout << "\n";
    return 0;
}