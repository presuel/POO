#include "figura.h"

class rectangulo : public figura {
    private:
    double base;
    double altura;
    public:
    rectangulo() : figura (4) {
		this->base= 0;
		this->altura= 0;
	}
    rectangulo(double base, double altura) : figura (4) {
		this->base= base;
		this->altura= altura;
	}
    //------------------------------------------------------------------
    void setBase(double base){ this->base= base; }
    void setAltura(double altura){ this->altura= altura; }
    double getBase(){ return this->base; }
    double getAltura(){ return this->altura; }
    double Area(){ return this->base * this->altura; }
    double Perimetro() { return 2.0 * ( this->base + this->altura ); }
};