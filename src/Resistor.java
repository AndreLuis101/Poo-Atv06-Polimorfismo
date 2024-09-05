public class Resistor implements Circuit {
    private double resistance;

    // Construtor que inicializa a resistência do resistor
    public Resistor(double resistance) {
        this.resistance = resistance;
    }

    // Implementação do método getResistance, retornando o valor da resistência
    @Override
    public double getResistance() {
        return this.resistance;
    }
}
