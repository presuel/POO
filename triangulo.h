#ifndef TRIANGULO_H_
#define TRIANGULO_H_

class triangulo{
private:
    // Atributos 
    double base;
    double altura;
    bool esRectangulo;
public:
    // Constructores
    triangulo(){

    }
    triangulo(double base, double altura){
        this->base= base;
        this->altura= altura;
    }
    triangulo(double base, double altura, bool esRectangulo){
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