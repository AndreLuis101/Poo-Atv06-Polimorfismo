public class Main {
    public static void main(String[] args) {
        Circuit serialCircuit = new SerialCircuit(new Circuit[]{
            new Resistor(1000),
            new Resistor(2000),
            new Resistor(6000)
        });
        Circuit parallelCircuit = new ParallelCircuit(new Circuit[]{
            new Resistor(200),
            new Resistor(470),
            new Resistor(220),
            new Resistor(130)
        });
        Circuit parallelCircuit2 = new ParallelCircuit(new Circuit[]{
            serialCircuit,
            parallelCircuit
        });
        Circuit compositeCircuit = new SerialCircuit(new Circuit[]{
            serialCircuit,
            parallelCircuit,
            parallelCircuit2
        });

        System.out.println(serialCircuit.getResistance());
        System.out.println(parallelCircuit.getResistance());
        System.out.println(parallelCircuit2.getResistance());
        System.out.println(compositeCircuit.getResistance());
    }
}