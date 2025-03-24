import interfaces.ConversaoFinaceira;

public class ConversorMoeda implements ConversaoFinaceira {
    private double dollar = 0;

    @Override
    public void getConverterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.73;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.printf("O valor em real é R$%.2f", valorReal);
    }
}
