#ifndef _PERSONA_H_
#define _PERSONA_H_

#include <iostream>

class persona{
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
};

#endif