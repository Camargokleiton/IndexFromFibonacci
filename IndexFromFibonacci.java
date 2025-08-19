package IndexFromFibonacci;

import java.util.Scanner;

public class IndexFromFibonacci {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.print("Digite um número para encontrar seu índice na sequência de Fibonacci: ");
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("O número deve ser não negativo.");
                return;
            } else {
                int index = findFibonacciIndex(n);
                if (index == -1) {
                    System.out.println("O número " + n + " não está na sequência de Fibonacci.");
                } else {
                    System.out.println("O índice do número " + n + " na sequência de Fibonacci é: " + index);
                }
            }

            System.out.println("Digite um indice para encontrar o valor correspondente na sequência de Fibonacci: ");
            int index = scanner.nextInt();
            if (index < 0) {
                System.out.println("O índice deve ser não negativo.");
                return;
            } else {
                int value = findFibonacciValue(index);
                if (value == -1) {
                    System.out.println("O índice " + index + " não é válido na sequência de Fibonacci.");
                } else {
                    System.out.println("O valor no índice " + index + " da sequência de Fibonacci é: " + value);
                }
            }
            System.out.print("Deseja continuar? (s/n): ");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }
    }

    public static int findFibonacciIndex(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int index = 1;

        while (b < n) {
            int temp = b;
            b = a + b;
            a = temp;
            index++;
        }

        return b == n ? index : -1;
    }

    public static int findFibonacciValue(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("O número deve ser não negativo.");
        }
        if (index == 0) {
            return 0;
        }
        if (index == 1) {
            return 1;
        }

        int a = 0;
        int b = 1;
        int i = 0;
        while (i < index) {
            int temp = b;
            b = a + b;
            a = temp;
            i++;
        }

        return i == index ? a : -1;
    }

}