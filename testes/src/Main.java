import interfaces.CalculoGeometrico;

public class Main {
    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        CalculadoraSalaRetangular calculo = new CalculadoraSalaRetangular();
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        ConversorTemperaturaPadrao converter = new ConversorTemperaturaPadrao();

        conversor.getConverterDolarParaReal(5.86);

        calculo.calcularArea(20, 16);
        calculo.calcularPerimetro(20, 16);

        tabuada.mostrarTabuada(2);

        converter.celsiusParaFahrenheit(33);
        converter.fahrenheitParCelsius(92);
    }
}