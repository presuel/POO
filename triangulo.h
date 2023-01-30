// ------------------------------------------------------
// EXCEPCIONES try-catch-throw
// throw() -> obsoleto en C++11 y eliminado en C++20.
// throw(typeId) -> obsoleto en C++11 y eliminado en C++17.
// ...
// Ver más:
// https://runebook.dev/es/docs/cpp/language/except_spec
// https://runebook.dev/es/docs/cpp/language/noexcept_spec
// ...
// noexcept(false)	La función podría lanzar un throw.
// noexcept			La función no va a lanzar throw.
// noexcept(true)	La función no va a lanzar throw.
// ------------------------------------------------------

#ifndef TRIANGULO_H_
#define TRIANGULO_H_

#include "figura.h"
#include "poligono.h"

class triangulo : public figura, public poligono {
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
        // Excepción: Base y Altura no pueden ser menor o igual a cero.
        this->base= this->altura= 0;
        if( base > 0 && altura > 0 ){
            this->base= base;
            this->altura= altura;
        } else throw -1;
        /*
        if( base > 0){
            this->base= base;
        } else throw -1;   // Para poder determinar si la base es incorrecta
        if( altura > 0 ){
            this->altura= altura;
        } else throw -1.0; // Para poder determinar si la altura es incorrecta
        */
    }
    triangulo(double base, double altura, bool esRectangulo) : figura (3){
        this->esRectangulo= esRectangulo;
        // Excepción: Base y Altura no pueden ser menor o igual a cero.
        this->base= this->altura= 0;
        if( base > 0 && altura > 0 ){
            this->base= base;
            this->altura= altura;
        } else throw -1;        
    }
    // Setters & Getters
    double getBase() noexcept(true) {
        return this->base;
    }
    double getAltura() noexcept {
        return this->altura;
    }
    bool isRectangulo(){
        return this->esRectangulo;
    }
    void setBase(double base){
        // Excepción: Base no puede ser menor o igual a cero.
        if( base > 0 ){
            this->base= base;
        } else throw -1;
    }
    void setAltura(double altura){
        // Excepción: Altura no puede ser menor o igual a cero.
        if( altura > 0 ){
            this->altura= altura;
        } else throw -1;
    }
    void setEsRectangulo(bool esRectangulo){
        this->esRectangulo= esRectangulo;
    }
    double Area(){
        return this->base*this->altura/2;
    }
    double Perimetro(){
        throw -1.0;
    }
};

#endif