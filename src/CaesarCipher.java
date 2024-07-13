import java.util.Scanner;

public class CaesarCipher {

    public static String encrypt(String message, int key) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (char character : message.toCharArray()) {
            // Desloca o caractere pela chave
            char shiftedChar = (char) ((character - 'a' + key) % 26 + 'a');
            encryptedMessage.append(shiftedChar);
        }

        return encryptedMessage.toString();
    }

    public static String decrypt(String message, int key) {
        StringBuilder decryptedMessage = new StringBuilder();

        for (char character : message.toCharArray()) {
            // Desloca o caractere pela chave para trás
            char shiftedChar = (char) ((character - 'a' - key + 26) % 26 + 'a');
            decryptedMessage.append(shiftedChar);
        }

        return decryptedMessage.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("mensagem: ");
        String message = scanner.nextLine();

        System.out.print("chave: ");
        int key = scanner.nextInt();

        String encryptedMessage = encrypt(message, key);
        System.out.println(encryptedMessage);

        String decryptedMessage = decrypt(encryptedMessage, key);
        System.out.println(decryptedMessage);

        scanner.close();
    }
}
