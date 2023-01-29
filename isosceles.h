#include "triangulo.h"

class isosceles : public triangulo {
    private:
    double ladosIguales;
    public:
    isosceles() : triangulo () {
		this->ladosIguales= 0;
	}
    isosceles(double base, double altura, double ladosIguales) : triangulo (base, altura) {
		this->ladosIguales= ladosIguales;
	}
    // -----------------------------------------------------------
    void setLadosIguales(double ladosIguales){ this->ladosIguales= ladosIguales; }
    double getLadosIguales(){ return this->ladosIguales; }
    double Perimetro(){ return (2.0 * this->ladosIguales) + this->base; }
};