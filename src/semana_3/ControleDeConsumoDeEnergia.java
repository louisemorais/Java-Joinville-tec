package semana_3;

import java.util.ArrayList;

public class ControleDeConsumoDeEnergia {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<Double>();
        lista.add(150.0);
        lista.add(180.0);
        lista.add(220.0);
        lista.add(190.0);
        lista.add(210.0);
        lista.add(230.0);

        int limiteenergy = 200;
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            contador += (lista.get(i));
        }
        contador = contador / lista.size();
        System.out.println(contador);

        if (contador > limiteenergy) {
            System.out.println("a casa está consumindo muita energia");
        } else {
            System.out.println("ta no limite aceitavel");
        }
    }
}
