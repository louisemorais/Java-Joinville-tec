package semana_2;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner calculator= new Scanner(System.in);
        //print na tela
        System.out.println("digite sua altura: ");
        double high= calculator.nextDouble();
        System.out.println("digite seu peso: ");
        double wight= calculator.nextDouble();
        System.out.println(" ");
        double IMCcalculator =  wight/(high*high);
        System.out.printf("O resultado do seu IMC é: %.2f", IMCcalculator);
    }
}
