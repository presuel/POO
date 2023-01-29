#include "triangulo.h"

class equilatero : public triangulo {
    private:
    //
    public:
    equilatero() : triangulo () {
		//
	}
    equilatero(double base, double altura) : triangulo (base, altura) {
		//
	}
    //--------------------------------------
    double Perimetro(){ 
        return 3.0 * this->base;
    }
};