import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, maior, menor;

        maior = Integer.MIN_VALUE; // menor valor possível para um inteiro
        menor = Integer.MAX_VALUE; // maior valor possível para um inteiro

        // poderia pegar o primeiro valor digitado para inicializa a variável
        /*
         * System.out.println("Digite o número inteiro:"); 
         * maior = in.nextInt();
         * menor = maior;
         */

        // Ler 10 números inteiros
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número inteiro:");
            numero = in.nextInt();

            if (numero > maior) {
                maior = numero;
            } else {
                if (numero < menor) {
                    menor = numero;
                }
            }
        }
        // Exibir o maior e o menor
        System.out.println("Maior valor = " + maior);
        System.out.println("Menor valor = " + menor);

        in.close();
    }
}
