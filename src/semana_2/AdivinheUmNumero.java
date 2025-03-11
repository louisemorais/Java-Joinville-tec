package semana_2;

import java.util.Scanner;

public class AdivinheUmNumero {
    public static void main(String[] args) {
        Scanner randomNumber = new Scanner(System.in);
        int limmits = 5;
        int aleatorio = (int) (Math.random() * limmits);

        System.out.print("Qual número de 1 a 5 eu estou pensando? ");
        System.out.println("insira: ");
        int number = randomNumber.nextInt();

        if (number != aleatorio) {
            System.out.println("você não acertou! o número aleatório era: " + aleatorio);
        } else if (number == aleatorio) {
            System.out.println("você acertou! o número era: " + aleatorio);
        }
    }
}
