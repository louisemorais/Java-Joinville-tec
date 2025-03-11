package semana_2;
import java.util.Scanner;

public class CalculoMediaFinal {
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        //print na tela
        System.out.println("digite a primeira nota: ");
        double n1 = calculator.nextDouble();
        System.out.println("digite a segunda nota: ");
        double n2 = calculator.nextDouble();
        System.out.println("digite a terceira nota: ");
        double n3 = calculator.nextDouble();
        System.out.println(" ");
        double mediacalculator = (n1 + n2 + n3) / 3;
        System.out.printf("Sua média final é: %.2f", mediacalculator);
    }
}