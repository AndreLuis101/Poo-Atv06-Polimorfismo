public class SerialCircuit extends CompositeCircuit {

    // Construtor que inicializa os sub-circuitos
    public SerialCircuit(Circuit[] circuits) {
        super(circuits);
    }

    // Implementação do método getResistance para calcular a resistência total em série
    @Override
    public double getResistance() {
        double totalResistance = 0.0;
        // Soma a resistência de todos os sub-circuitos
        for (Circuit circuit : circuits) {
            totalResistance += circuit.getResistance();
        }
        return totalResistance;
    }
}
