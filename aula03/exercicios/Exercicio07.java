package exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int valor, maior, menor;
        final int QTDE_NUMEROS = 10;

        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE; 

        for (int i = 0; i < QTDE_NUMEROS; i++) {
            System.out.println("Digite o valor:");
            valor = in.nextInt();
            if(valor > maior){
                maior = valor;
            }
            if(valor < menor){
                menor = valor;
            }
        }

        System.out.println("O maior valor digitado foi " + maior);
        System.out.println("O menor valor digitado foi " + menor);
        
        in.close();
    }
}