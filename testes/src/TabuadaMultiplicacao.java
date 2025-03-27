import interfaces.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int num) {
        int multi = 1;
        for (int i = 1; i <= 10; i++ ) {
            multi = i * num;
            System.out.printf("\n%d: %d", i, multi);
        }
    }
}
