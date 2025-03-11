package semana_3;

import java.util.Scanner;



public class VerificadorDeEspeciesEmPerigo {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        String[] animais = {"mico leão dourado", "onça pintada", "arara azul", "peixe Boi", "lobo guará"};

        System.out.print("Diga o nome de um animal em extinção: ");
        String Nome = dados.nextLine();

        boolean risco = false;
        for (String i : animais) {
            if (i.equals(Nome)) {
                risco = true;
                break;
            }
        }

        if (risco) {
            System.out.println("a espécie " + Nome + " está na lista de extinção");
        } else {
            System.out.println("a espécie " + Nome + " não está na lista de extinção");
        }
    }
}

