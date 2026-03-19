package com.figuraslopeta.objects;


public class Circulo extends Figura {

    /**
     * Hemos encapsulado radio y añadido su get y set
     */
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

    /**
     * @return radioo
     */
    public double getRadio() {
        return radio;
    }

    /**
     *
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}