package semana_3;

public class MonitoradorDeQualidadeDoAr {
    public static void main(String[] args) {
        int[] array = new int[5];
        String[] cidade = {" Rio de Janeiro", " Manaus", " Rio Branco", " Porto Alegre", " Acrelandia"};

        int rio_de_janeiro = array[0] = 1;
        int manaus = array[1] = 1000;
        int rio_branco = array[2] = 80;
        int porto_alegre = array[3] = 13;
        int acrelandia = array[4] = 800;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 100) {
                System.out.println("ta acima: " + array[i] + cidade[i]);
            }
        }
    }
}


