public abstract class CompositeCircuit implements Circuit {
    protected Circuit[] circuits;

    // Construtor que inicializa os sub-circuitos com uma cópia defensiva
    public CompositeCircuit(Circuit[] circuits) {
        // Realizando uma cópia defensiva do array para evitar modificações externas
        this.circuits = circuits.clone();
    }

    // Método para obter todos os sub-circuitos
    public Circuit[] getCircuits() {
        return circuits.clone(); // Retorna uma cópia defensiva do array de sub-circuitos
    }
}
