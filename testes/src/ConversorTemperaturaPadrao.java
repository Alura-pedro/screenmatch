import interfaces.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double conversaoFahrenheit = (celsius * 1.8) + 32;
        System.out.printf("\n%.2f °C = %.2f °F",celsius, conversaoFahrenheit);
    }

    @Override
    public void fahrenheitParCelsius(double fahrenheit) {
        double conversaoCelsius = (fahrenheit - 32) / 1.8;
        System.out.printf("\n%.2f °F = %.2f °C", fahrenheit, conversaoCelsius);

    }
}
