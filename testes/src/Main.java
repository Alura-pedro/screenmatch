import interfaces.CalculoGeometrico;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        CalculadoraSalaRetangular calculo = new CalculadoraSalaRetangular();

        conversor.getConverterDolarParaReal(5.86);

        calculo.calcularArea(20, 16);
        calculo.calcularPerimetro(20, 16);
    }
}