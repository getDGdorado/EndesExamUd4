package com.figuraslopeta.objects;
import com.figuraslopeta.model.*;

public class Circulo implements Calculable, Dibujable {

    private double radio;

    public Circulo(double radio) {
        this.setRadio(radio);
    }

    @Override
    public double calcularArea() {
        return 3.1416 * getRadio() * getRadio();
    }

    @Override
    public double calcularPerimetro() {
        return 2 * 3.1416 * getRadio();
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando circulo de radio " + getRadio());
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}