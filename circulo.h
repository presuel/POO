#include "figura.h"

class circulo : public figura {
    private:
    double radio;
    public:
    circulo() : figura (0) {
		this->radio= 0;
	}
    circulo(double radio) : figura (0) {
		this->radio= radio;
	}
    //------------------------------------------------------------------
    void setRadio(double radio){ 
        this->radio= radio; 
    }
    
    double getRadio(){ 
        return this->radio; 
    }

    double Area(){ 
        return 3.141592 * this->radio * this->radio; 
    }

    double Perimetro() { 
        return 2.0*3.141592*this->radio; 
    }
};