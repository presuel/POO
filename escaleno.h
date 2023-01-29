#include "triangulo.h"

class escaleno : public triangulo {
    private:
    double ladoMenor;
    double ladoMayor;
    public:
    escaleno() : triangulo () {
		this->ladoMenor= 0;
		this->ladoMayor= 0;
	}
    escaleno(double base, double altura, double ladoMenor, double ladoMayor) 
	    : triangulo (base, altura) {
		this->ladoMenor= ladoMenor;
		this->ladoMayor= ladoMayor;
	}
    // -------------------------------------------------------------------
    void setLadoMenor(double ladoMenor){ this->ladoMenor= ladoMenor; }
	void setLadoMayor(double ladoMayor){ this->ladoMayor= ladoMayor; }
    double getLadoMenor(){ return this->ladoMenor; }
	double getLadoMayor(){ return this->ladoMayor; }
    double Perimetro(){ return this->ladoMenor + this->ladoMayor + this->base; }
};