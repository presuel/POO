#include "persona.h"
#include <iostream>
using namespace std;

class estudiante : public persona {
private:
    string matricula;
    string fecha;
    bool asistencia;
public:
    estudiante():persona() {
        //
    }
    estudiante(string nombres, string apellidos, string matricula):persona(nombres, apellidos) {
        this->matricula= matricula;
    }
    void setMatricula(string matricula){
        this->matricula= matricula;
    }
    string getMatricula(){
        return this->matricula;
    }
    void setFecha(string fecha){
        this->fecha= fecha;
    }
    string getFecha(){
        return this->fecha;
    }
    void setAsistencia(bool asistencia){
        this->asistencia= asistencia;
    }
    bool getAsistencia(){
        return this->asistencia;
    }

    string toString(){
        return this->getNombres() + " " + this->getApellidos() + ". " + to_string(this->getEdad()) + "años.";
    };
};