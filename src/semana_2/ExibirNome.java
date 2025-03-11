package semana_2;

import java.util.Scanner;

public class ExibirNome {
    public static void main(String[] args) {
        Scanner nameCount = new Scanner(System.in);
        //print na tela
        System.out.println("escreva seu sobrenome: ");
        String sobrenome = nameCount.nextLine();
        System.out.println("escreva seu nome: ");
        String nome = nameCount.nextLine();


        System.out.println("seu nome e sobrenome  é: " + nome + " " + sobrenome);
        System.out.println();
        System.out.println(" ");
        int wordnumber = nome.length();
        int lstnamenumber = sobrenome.length();
        int together = wordnumber + lstnamenumber;
        System.out.println("seu nome possui: " + together+ " letras" );
    }
}
