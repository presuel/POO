#ifndef FIGURA_H_
#define FIGURA_H_

class figura{
private:
    int lados;
public:
    figura (){
        this->lados= -1;
    }
    figura (int lados){
        this->lados= lados;
    }
    //------------
    void setLados(int lados ){
        if( this->lados < 0 ) this->lados= lados;
    }
    int getLados (){
        return this->lados;
    }
    // Abstracto
    //virtual double Area() = 0;
};

#endif