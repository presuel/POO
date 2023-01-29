#include <iostream>

class id{
    public:
    virtual void setNombres(std::string nombres)=0;
    virtual std::string getNombres()=0;
    virtual void setApellidos(std::string apellidos)=0;
    virtual std::string getApellidos()=0;
};