#ifndef _PRODUCTO_H_
#define _PRODUCTO_H_

#include <iostream>

class producto{
private:
    std::string codBar;
    std::string descripcion;
    std::string categoria;
    double precio;
    int cantidad;
public:
    producto() {

    }

    producto(std::string codBar, std::string descripcion) {
        this->codBar = codBar;
        this->descripcion = descripcion;
    }

    producto(std::string descripcion, double precio, int cantidad) {
        this->descripcion = descripcion;
        this->precio = precio;
        this->cantidad = cantidad;
    }

    std::string getCodBar() {
        return this->codBar;
    }

    void setCodBar(std::string codBar) {
        this->codBar = codBar;
    }

    std::string getDescripcion() {
        return this->descripcion;
    }

    void setDescripcion(std::string descripcion) {
        this->descripcion = descripcion;
    }

    std::string getCategoria() {
        return this->categoria;
    }

    void setCategoria(std::string categoria) {
        this->categoria = categoria;
    }

    double getPrecio() {
        return this->precio;
    }

    void setPrecio(double precio) {
        this->precio = precio;
    }

    int getCantidad() {
        return this->cantidad;
    }

    void setCantidad(int cantidad) {
        this->cantidad = cantidad;
    }

    int Compra(int cantidad){
        this->cantidad += cantidad;
        return this->cantidad;
    }

    int Venta(int cantidad){
        this->cantidad -= cantidad;
        return this->cantidad;
    }
};

#endif