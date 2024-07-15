import java.util.Scanner;

public class PerfectNumberChecker {

    public static boolean isPerfectNumber(int number) {
        if (number <= 1) {
            return false; // Números menores ou iguais a 1 não são perfeitos
        }

        int sum = 0;

        // Encontrar todos os divisores de 'number' e somá-los
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Verificar se a soma dos divisores é igual ao 'number'
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se é perfeito: ");
        int number = scanner.nextInt();

        boolean result = isPerfectNumber(number);
        if (result) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        scanner.close();
    }
}
