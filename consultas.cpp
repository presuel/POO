#include <iostream>
using namespace std;
#include "persona.h"

int main(){
    persona persona1("Andrea", "Presuel", 18);
    persona1.setEstatura(1.75);
    persona1.setPeso(57);
    cout << "Persona 1\n";
    cout << persona1.toString();
    cout << "IMC: " << persona1.IMC();
    cout << "\n";
    persona persona2("Aurora", "Presuel", 18, 1.77, 60);
    cout << "\nPersona 2\n";
    cout << persona2.toString();
    cout << "IMC: " << persona2.IMC();
    cout << "\n";
    return 0;
}