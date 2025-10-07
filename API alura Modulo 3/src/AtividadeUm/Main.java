package AtividadeUm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int escolha1 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        int escolha2 = scanner.nextInt();





        try {
            int resultado = escolha1 / escolha2;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não permitida!");
        }
    }
}
