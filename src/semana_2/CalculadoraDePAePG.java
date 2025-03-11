package semana_2;

import java.util.Scanner;

public class CalculadoraDePAePG {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        boolean rodando = true;
        //print na tela
        System.out.println("digite um número inteiro: ");
        int valorinicial = calculator.nextInt();
        calculator.nextLine();
        System.out.println("digite o número da Raiz: ");
        int raiz = calculator.nextInt();
        calculator.nextLine();

        while (rodando) {
            System.out.println("deseja calcular os 10 primeiros valores em PA ou PG? ");

            String modo = calculator.nextLine().toUpperCase();

            switch (modo) {
                case "PA":
                    System.out.print("o valor da sua PA é: ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(valorinicial + " ");
                        valorinicial += raiz;
                    }
                    rodando = false;
                    break;

                case "PG":
                    System.out.print("o valor da sua PG é: ");
                    for (int i = 0; i < 10; i++) {
                        System.out.print(valorinicial + " ");
                        valorinicial *= raiz;

                    }
                    rodando = false;
                    break;
                default:
                    System.out.println("modo inválido");
                    break;
            }
        }
    }
}

