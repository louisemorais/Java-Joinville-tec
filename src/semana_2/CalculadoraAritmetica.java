package semana_2;

import java.util.Scanner;

public class CalculadoraAritmetica {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        //print na tela
        System.out.println("digite um número: ");
        int n1 = calculator.nextInt();
        calculator.nextLine();
        System.out.println("digite mais um número: ");
        int n2 = calculator.nextInt();
        calculator.nextLine();
        System.out.println("digite uma operação: ");
        String operation = calculator.nextLine();

        if (operation.equals("+")) {
            int somar = n1 + n2;
            System.out.println("resultado final: " + somar);
        } else if (operation.equals("-")) {
            int subtrair = n1 - n2;
            System.out.println("resultado final: " + subtrair);
        } else if (operation.equals("x")) {
            int multiplicar = n1 * n2;
            System.out.println("resultado final: " + multiplicar);
        } else if (operation.equals("/")) {
            int dividir = n1 / n2;
            System.out.println("resultado final: " + dividir);
        } else {
            System.out.println("operação inválida");
        }
    }
}
