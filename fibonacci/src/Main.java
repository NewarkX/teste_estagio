import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Número informado pelo usuário ou definido previamente
        int numero = informarNumero(); // Função para informar o número

        // Verifica se o número pertence à sequência de Fibonacci
        if (verificarFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
    }

    // Função para informar o número (pode ser alterada para outra forma de entrada)
    public static int informarNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();
        scanner.close();
        return numero;
    }

    // Função para verificar se o número pertence à sequência de Fibonacci
    public static boolean verificarFibonacci(int numero) {
        int anterior = 0;
        int atual = 1;

        while (atual < numero) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        return atual == numero;
    }
}
