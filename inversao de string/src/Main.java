import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        // Solicitar ao usuário que insira a string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        // Chamar a função para inverter a string
        String reversedString = inverterString(inputString);

        // Imprimir a string invertida
        System.out.println("String invertida: " + reversedString);
    }

    // Função para inverter a string
    public static String inverterString(String str) {
        // Converter a string para um array de caracteres
        char[] charArray = str.toCharArray();

        // Inverter o array de caracteres
        int i = 0;
        int j = charArray.length - 1;
        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }

        // Converter o array de caracteres de volta para uma string
        return new String(charArray);
    }
}
