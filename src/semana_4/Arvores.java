package semana_4;

public class Arvores {
    private String nome;
    private String tipo;
    private double altura;

    public Arvores(String nome, String tipo, double altura) {
        this.nome = nome;
        this.tipo = tipo;
        this.altura = altura;
    }
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        System.out.println("Altura: " + altura + " metros");
    }
    public double calcularOxigenio() {
        return altura * 10;
    }
    public static void main(String[] args) {
        Arvores arvores=new Arvores("Conífera","Folhosa", 1.5);
        arvores.calcularOxigenio();
        arvores.exibirInformacoes();
    }
}

