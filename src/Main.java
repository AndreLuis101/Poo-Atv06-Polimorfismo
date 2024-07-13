import java.util.Scanner;

public class Main {
    public static double sqrt(double n, double epsilon) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser positivo");
        }
        
        double x0 = n / 2.0;
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

    private static int getDecimalPlaces(double number) {
        String numberStr = Double.toString(number);
        int decimalPlaces = numberStr.length() - numberStr.indexOf('.') - 1;
        return decimalPlaces;
    }

    /////////////////////////////////////////////////////////////////////////////
    public static boolean isPerfectNumber(long number) {
        if (number <= 1) {
            return false; 
        }

        long sum = 0;

        for (long i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    /////////////////////////////////////////////////////////////////////////////

    public static String encrypt(String message, int key) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char character : message.toCharArray()) {
            char shiftedChar = (char) ((character - 'a' + key) % 26 + 'a');
            encryptedMessage.append(shiftedChar);
        }

        return encryptedMessage.toString();
    }

    public static String decrypt(String encryptedMessage, int key) {
        StringBuilder decryptedMessage = new StringBuilder();

        for (char character : encryptedMessage.toCharArray()) {
            char shiftedChar = (char) ((character - 'a' - key + 26) % 26 + 'a');
            decryptedMessage.append(shiftedChar);
        }

        return decryptedMessage.toString();
    }

    /////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n para calcular a raiz quadrada: ");
        double n = scanner.nextDouble();
        System.out.print("Digite o valor de epsilon: ");
        double epsilon = scanner.nextDouble();
        double sqrtResult = sqrt(n, epsilon);
        int decimalPlaces = getDecimalPlaces(epsilon);
        String formatString = "%." + decimalPlaces + "f";
        System.out.printf(formatString + "%n", sqrtResult);

        System.out.print("Digite um número para verificar se é perfeito: ");
        long number = scanner.nextLong();
        boolean isPerfect = isPerfectNumber(number);
        if (isPerfect) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        scanner.nextLine(); 

        System.out.print("Digite a mensagem para encriptar: ");
        String message = scanner.nextLine();
        System.out.print("Digite a chave: ");
        int key = scanner.nextInt();
        String encryptedMessage = encrypt(message, key);
        System.out.println("Mensagem encriptada: " + encryptedMessage);
        String decryptedMessage = decrypt(encryptedMessage, key);
        System.out.println("Mensagem desencriptada: " + decryptedMessage);

        scanner.close();
    }
}
