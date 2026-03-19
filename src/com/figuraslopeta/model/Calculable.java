package com.figuraslopeta.model;

/**
 * Creamos una interfa llamada calculable ya que se repetia mucho el mismo metodo en las figuras
 */
public interface Calculable {
    double calcularArea();

    double calcularPerimetro();
}
