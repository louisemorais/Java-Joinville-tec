package semana_4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PerfilDeSaude {
    private String nome;
    private String sobrenome;
    private String sexo;
    private LocalDate dataDeNascimento;
    private double altura;
    private double peso;

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("escreva seu nome: ");
        String nome = in.nextLine();
        System.out.println("escreva seu sobrenome: ");
        String sobrenome = in.nextLine();
        System.out.println("escreva seu sexo: ");
        String sexo = in.nextLine();
        System.out.println("escreva sua altura: ");
        double altura= in.nextDouble();
        in.nextLine();
        System.out.println("escreva seu peso: ");
        double peso= in.nextDouble();
        in.nextLine();
        System.out.println("escreva sua Data de Nascimento (yyyy-mm-dd): ");
        LocalDate idade = LocalDate.parse(in.nextLine());

        PerfilDeSaude pessoa = new PerfilDeSaude(nome,sobrenome,sexo,idade,altura,peso);

        System.out.printf("\n|Informações da Pessoa|"+
                "\nNome: " + pessoa.getNome() + " " + pessoa.getSobrenome()+"\nData de Nascimento: "
                + pessoa.getDataDeNascimento()+"\nIdade: " + pessoa.mediaIdade()
                + " anos"+"\nSexo:"+pessoa.getSexo()+"\nAltura:"+pessoa.getAltura()+"\nPeso: "+pessoa.getPeso()+
                "\nFrequência Cardíaca Máxima: " + pessoa.calcularFrequenciaMaxima() + " bpm"
                +"\nFrequência Cardíaca Alvo: " + pessoa.calcularFrequenciaAlvo() + " bpm" + "\nIMC : %.2f", pessoa.IMC());

        in.close();
    }

    public PerfilDeSaude(String nome,String sobrenome,String sexo,LocalDate dataDeNascimento,double altura,double peso){
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setSexo(sexo);
        this.setDataDeNascimento(dataDeNascimento);
        this.setAltura(altura);
        this.setPeso(peso);
    }

    public int mediaIdade(){
        LocalDate hoje = LocalDate.now();
        return Period.between(dataDeNascimento,hoje).getYears();
    }

    public int calcularFrequenciaMaxima() {
        return 220 - mediaIdade();
    }

    public String calcularFrequenciaAlvo(){
        int maxima = calcularFrequenciaMaxima();
        int minimoAlvo= (int) (maxima*0.5);
        int maximoAlvo = (int) (maxima *0.85);
        return minimoAlvo+ " - " + maximoAlvo;
    }

    public double IMC(){
        return peso/(altura*altura);
    }


    private String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private String getSobrenome() {
        return sobrenome;
    }

    private void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    private String getSexo() {
        return sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }

    private LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    private void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    private double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }

    private double getPeso() {
        return peso;
    }

    private void setPeso(double peso) {
        this.peso = peso;
    }
}
