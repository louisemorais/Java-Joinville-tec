package semana_3;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeResiduosReciclaveis {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int num = 5;
        System.out.println("Digite 5 itens recicláveis.");
        for (int cont = 0; cont < num; cont++) {
            System.out.println("Digite o nome do item: ");
            lista.add(scanner.nextLine());
        }

        System.out.println("você possui estes itens reciclados cadastrados: ");
        for (int i = 0; i < lista.size(); i++) {
            String total = lista.get(i);
            System.out.println(total);
        }
    }
}