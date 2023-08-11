package Geometrica;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return 0.5 * base * altura;
    }

    @Override
    public double calcularPerimetro() {
        // No se puede calcular el perímetro solo con la base y altura, se necesita más información
        return -1;
    }

    @Override
    public String obtenerNombre() {
        return "Triángulo";
    }
}
