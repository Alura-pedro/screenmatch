import interfaces.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    @Override
    public void calcularArea(double base, double altura) {
        double area = base * altura;
        System.out.println("\nA área da sala é igual á: "+ area);
    }

    @Override
    public void calcularPerimetro(double base, double altura) {
        double perimetro = 2 * (base + altura);
        System.out.println("O perimetro da sala é igual á: "+ perimetro);
    }
}
