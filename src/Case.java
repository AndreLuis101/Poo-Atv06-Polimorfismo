public class Case {
    public static void main(String[] args) {
        int dia = 4;
        String diaSemana = "a";

        switch (dia){
            case 1:
                diaSemana = "segunda";
                break;

            case 4:
                diaSemana = "quarta";
                break;

        
        }
        System.out.println(diaSemana);

    }
}
