#ifndef _PERSONA_H_
#define _PERSONA_H_

#include <iostream>
#include "id.h"

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
        this->nombres= nombres;
        this->apellidos= apellidos;
        this->edad= 0;
        this->estatura= 0;
        this->peso= 0;
    }
    persona(std::string nombres, std::string apellidos, int edad){
        this->nombres= nombres;
        this->apellidos= apellidos;
        this->edad= edad;
        this->estatura= 0;
        this->peso= 0;
    }
    persona(std::string nombres, std::string apellidos, int edad, double estatura, double peso){
        this->nombres= nombres;
        this->apellidos= apellidos;
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
        this->edad= edad;
    }

    void setEstatura(double estatura){
        this->estatura= estatura;
    }

    void setPeso(double peso){
        this->peso= peso;
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