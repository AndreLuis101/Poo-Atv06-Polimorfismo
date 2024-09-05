public class ParallelCircuit extends CompositeCircuit {

    // Construtor que inicializa os sub-circuitos
    public ParallelCircuit(Circuit[] circuits) {
        super(circuits);
    }

    // Implementação do método getResistance para calcular a resistência total em paralelo
    @Override
    public double getResistance() {
        double inverseTotalResistance = 0.0;

        // Soma o inverso da resistência de todos os sub-circuitos
        for (Circuit circuit : circuits) {
            inverseTotalResistance += 1.0 / circuit.getResistance();
        }

        // A resistência total é o inverso da soma dos inversos
        return 1.0 / inverseTotalResistance;
    }
}
