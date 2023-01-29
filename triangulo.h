#ifndef TRIANGULO_H_
#define TRIANGULO_H_

#include "figura.h"

class triangulo : public figura{
    // Atributos 
protected:    
    double base;
    double altura;
    bool esRectangulo;
    // Constructores
public:
    triangulo() : figura (3) {
        this->base= 0;
        this->altura= 0;
    }
    triangulo(double base, double altura) : figura (3){
        this->base= base;
        this->altura= altura;
    }
    triangulo(double base, double altura, bool esRectangulo) : figura (3){
        this->base= base;
        this->altura= altura;
        this->esRectangulo= esRectangulo;
    }
    // Setters & Getters
    double getBase(){
        return this->base;
    }
    double getAltura(){
        return this->altura;
    }
    bool isRectangulo(){
        return this->esRectangulo;
    }
    void setBase(double base){
        this->base= base;
    }
    void setAltura(double altura){
        this->altura= altura;
    }
    void setEsRectangulo(bool esRectangulo){
        this->esRectangulo= esRectangulo;
    }
    double Area(){
        return this->base*this->altura/2;
    }
};

#endif