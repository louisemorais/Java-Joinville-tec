package semana_3;

import java.util.Scanner;

public class MediadeTemperatura {
    public static void main(String[] args) {
        int[] dados = new int[7];
        Scanner graus = new Scanner(System.in);
        System.out.println("Diga quantos graus teve na floresta ao longo da semana: ");

        System.out.println("segunda feira: ");
        dados[0] = graus.nextInt();

        System.out.println("terça feira: ");
        dados[1] = graus.nextInt();

        System.out.println("quarta feira: ");
        dados[2] = graus.nextInt();

        System.out.println("quinta feira: ");
        dados[3] = graus.nextInt();

        System.out.println("sexta feira: ");
        dados[4] = graus.nextInt();

        System.out.println("sábado feira: ");
        dados[5] = graus.nextInt();

        System.out.println("domingo feira: ");
        dados[6] = graus.nextInt();

        int formula = 0;
        for (int i = 0; i < dados.length; i++) {
            formula += (dados[i]);
        }
        formula = formula / dados.length;
        System.out.println(formula);
    }
}