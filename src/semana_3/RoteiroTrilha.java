package semana_3;

import java.util.ArrayList;
import java.util.Scanner;

public class RoteiroTrilha {
    public  static ArrayList<String> paradas = new ArrayList<>();

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nItinerário atual:");
                informacoes();
                System.out.print("\nDeseja adicionar uma nova parada? (S/N): ");
                String continuar = scanner.nextLine().toUpperCase();

            if (!continuar.equals("S")) {
                break;
            }

            System.out.print("Digite o nome da parada: ");
            String nomeParada = scanner.nextLine();

            if (paradas.isEmpty()) {
                paradas.add(nomeParada);
                System.out.println("Parada '" + nomeParada + "' adicionada como primeira parada.");
            } else {
                System.out.print("Em qual posição deseja inserir (1-" + (paradas.size() + 1) + ")? ");
                try {
                    int posicao = Integer.parseInt(scanner.nextLine());

                    if (posicao < 1 || posicao > paradas.size() + 1) {
                        System.out.println("Posição inválida.");
                    } else {
                        paradas.add(posicao - 1, nomeParada);
                    }
                    System.out.println("Parada '" + nomeParada + "' adicionada com sucesso!");
                } catch (NumberFormatException e) {
                    System.out.println("Número inválido. A parada será adicionada ao final.");
                    paradas.add(nomeParada);
                }
            }
        }

        System.out.println("\n=== ITINERÁRIO FINAL ===");
            informacoes();

}
    public static void informacoes() {
        if (paradas.isEmpty()) {
            System.out.println("(Nenhuma parada cadastrada ainda)");
        } else {
            for (int i = 0; i < paradas.size(); i++) {
                System.out.println((i + 1) + ". " + paradas.get(i));
            }
        }
    }
}

