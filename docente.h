#include "persona.h"
#include <iostream>
using namespace std;

class docente : public persona{
private:
    string clave;
    int horasContrato;
    double pagoHora;
public:
    docente() : persona() {
        //
    }
    docente(string nombres, string apellidos, string clave) : persona (nombres, apellidos) {
        this->clave= clave;
    }
    void setClave( string clave ){
        this->clave= clave;
    }
    void setHorasContrato(int horasContrato){
        this->horasContrato= horasContrato;
    }
    void setPagoHora( double pagoHora ){
        this->pagoHora= pagoHora;
    }
    string getClave(){
        return this->clave;
    }
    int getHorasContrato(){
        return this->horasContrato;
    }
    double getPagoHora(){
        return this->pagoHora;
    }
    string toString(){
        return this->getNombres() + " " + this->getApellidos();
    };
};