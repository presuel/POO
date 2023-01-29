#include "persona.h"
#include <iostream>
using namespace std;

class paciente : public persona{
private:
    string fecha;
    string sintomas;
public: 
    paciente():persona(){
        //
    }
    paciente(string nombres, string apellidos):persona(nombres, apellidos){
        //
    }
    void setFecha(string fecha){
        this->fecha= fecha;
    }
    void setSintomas(string sintomas){
        this->sintomas= sintomas;
    }
    string getFecha(){
        return this->fecha;
    }
    string getSintomas(){
        return this->sintomas;
    }

    string toString(){
        return this->getApellidos() + ", " + this->getNombres() + "\n" + this->getFecha() + ") " 
             + this->getSintomas() + "\n";
    }
};