import java.util.Scanner;

public class sqrt {

    public static double sqrt(double n, double epsilon) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser positivo");
        }
        
        double x0 = n / 2.0; // Chute inicial
        double x1 = (x0 + n / x0) / 2.0;

        while (absoluteDifference(x1, x0) >= epsilon) {
            x0 = x1;
            x1 = (x0 + n / x0) / 2.0;
        }

        return x1;
    }

    private static double absoluteDifference(double a, double b) {
        return a > b ? a - b : b - a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        double n = scanner.nextDouble();

        System.out.print("Digite o valor de epsilon: ");
        double epsilon = scanner.nextDouble();

        double result = sqrt(n, epsilon);
        System.out.printf("A raiz quadrada de %.1f com precisão de %.3f é: %.3f%n", n, epsilon, result);

        scanner.close();
    }
}
