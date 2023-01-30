#ifndef _PERSONA_H_
#define _PERSONA_H_

#include <iostream>
#include "id.h"
#include <exception> // Permite heredar la clase Exception

class errorDatos : public std::exception {
    public: const char* what() const throw(){
        return "Datos Incorrectos.\n\n";
    }
};

class errorVacio : public errorDatos {
    public: const char* what() const throw(){
        return "No se ingreso ningun valor.\n\n";
    }
};

class errorRango : public errorDatos {
    public: const char* what() const throw(){
        return "Dato fuera del rango de valores permitidos.\n\n";
    }
};

class errorNoMetodo : public std::exception {
    public: const char* what() const throw(){
        return "Metodo invocado aun no implementado.\n\n";
    }
};

class persona : public id{
private:
    std::string nombres;
    std::string apellidos;
    int edad;
    double estatura;
    double peso;
public:
    // Constructores
    persona(){
        this->nombres= "";
        this->apellidos= "";
        this->edad= edad;
        this->estatura= 0;
        this->peso= 0;
    }
    persona(std::string nombres, std::string apellidos){
        if ( nombres.length() > 0 ){
            this->nombres= nombres;
        } else throw errorVacio();

        if ( apellidos.length() > 0 ){
            this->apellidos= apellidos;
        } else throw errorVacio();
        this->edad= 0;
        this->estatura= 0;
        this->peso= 0;
    }
    persona(std::string nombres, std::string apellidos, int edad){
        if ( nombres.length() > 0 ){
            this->nombres= nombres;
        } else throw errorVacio();

        if ( apellidos.length() > 0 ){
            this->apellidos= apellidos;
        } else throw errorVacio();
        this->edad= edad;
        this->estatura= 0;
        this->peso= 0;
    }
    persona(std::string nombres, std::string apellidos, int edad, double estatura, double peso){
        if ( nombres.length() > 0 ){
            this->nombres= nombres;
        } else throw errorVacio();

        if ( apellidos.length() > 0 ){
            this->apellidos= apellidos;
        } else throw errorVacio();
        this->edad= edad;
        this->estatura= estatura;
        this->peso= peso;
    }
    // Setters & Getters
    std::string getNombres(){
        return this->nombres;
    }

    std::string getApellidos(){
        return this->apellidos;
    }

    int getEdad(){
        return this->edad;
    }

    double getEstatura(){
        return this->estatura;
    }

    double getPeso(){
        return this->peso;
    }

    void setNombres(std::string nombres){
        this->nombres= nombres;
    }

    void setApellidos(std::string apellidos){
        this->apellidos= apellidos;
    }

    void setEdad(int edad){
        if( edad > 0 && edad < 130 ){
            this->edad= edad;
        } else throw errorRango();
    }

    void setEstatura(double estatura){
        if( estatura > 0.0 && estatura < 2.5 ){
            this->estatura= estatura;
        } else throw errorRango(); 
    }

    void setPeso(double peso){
        if( peso > 0 && peso < 300){
            this->peso= peso;
        } else throw errorRango(); 
    }

    double IMC(){
        return this->peso / (this->estatura * this->estatura);
    }

    virtual std::string toString() = 0;
    /*std::string toString(){
        std::string datos= this->nombres + " " + this->apellidos + "\nedad: ";
        datos += std::to_string(this->edad);
        datos += " , altura: ";
        datos += std::to_string(this->estatura);
        datos += " m. , peso: ";
        datos += std::to_string(this->peso);
        datos += " kg.\n";
        return datos;
    }*/

};

#endif

// Distintas formas de concatenar cadenas y números en C++
// https://stackoverflow.com/questions/191757/how-to-concatenate-a-stdstring-and-an-int