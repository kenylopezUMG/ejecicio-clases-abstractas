package Geometrica;

import Geometrica.*;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica triangulo = new Triangulo(10, 5);
        FiguraGeometrica circulo = new Circulo(7);

        System.out.println("Figura: " + triangulo.obtenerNombre());
        System.out.println("Área: " + triangulo.calcularArea());

        System.out.println("Figura: " + circulo.obtenerNombre());
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
    }
}
