package exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteApp {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        
        ArrayList<ContaCorrente> listaDeContas = new ArrayList<>();

        ContaCorrente cc = null;


        do {
            System.out.println("1-Nova Conta Corrente");
            System.out.println("2-Nova Conta Especial");
            System.out.println("3-Nova Conta Poupança");
            System.out.println("4-Fazer depósito");
            System.out.println("5-Fazer saque");
            System.out.println("6-Exibir as contas");
            System.out.println("7-Sair");
            System.out.print("-->");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Criando uma conta corrente.");
                    System.out.println("Informe o número da conta:");
                    int numeroConta = teclado.nextInt();
                    cc = new ContaCorrente(numeroConta);
                    listaDeContas.add(cc);
                    break;
                case 2:
                    System.out.println("Criando uma conta especial.");
                
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:
                    for(int i =0; i < listaDeContas.size(); i++){
                        System.out.println(listaDeContas.get(i).exibir());
                    }
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 7);

        teclado.close();
    }
}
