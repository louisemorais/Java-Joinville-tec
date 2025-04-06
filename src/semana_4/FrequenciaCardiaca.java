package semana_4;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class FrequenciaCardiaca {
    private String nome;
    private String sobrenome;
    private LocalDate dataDeNascimento;


    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Diga seu nome: ");
        String nome= scanner.nextLine();
        System.out.println("Diga seu sobrenome: ");
        String sobrenome= scanner.nextLine();
        System.out.println("Diga sua Data de nascimento (yyyy-mm-dd): ");
        LocalDate dataNascimento= LocalDate.parse(scanner.nextLine());

        FrequenciaCardiaca coracao = new FrequenciaCardiaca(nome,sobrenome,dataNascimento);
        coracao.mediaIdade();
        coracao.calcularFrequenciaAlvo();

        System.out.println("\nInformações da Pessoa:"+
                "\nNome: " + coracao.getNome() + " " + coracao.getSobrenome()+"\nData de Nascimento: "
                + coracao.getDataDeNascimento()+"\nIdade: " + coracao.mediaIdade()
                + " anos"+"\nFrequência Cardíaca Máxima: " + coracao.calcularFrequenciaMaxima() + " bpm"
                +"\nFrequência Cardíaca Alvo: " + coracao.calcularFrequenciaAlvo() + " bpm");

        scanner.close();
    }

    public FrequenciaCardiaca(String nome,String sobrenome,LocalDate dataDeNascimento){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.dataDeNascimento=dataDeNascimento;
    }

    public int mediaIdade(){
        LocalDate hoje= LocalDate.now();
        return Period.between(dataDeNascimento,hoje).getYears();
    }

    public int calcularFrequenciaMaxima() {
        return 220 - mediaIdade();
    }

    public String calcularFrequenciaAlvo() {
        int maxima = calcularFrequenciaMaxima();
        int minimoAlvo = (int) (maxima * 0.5);
        int maximoAlvo = (int) (maxima * 0.85);
        return minimoAlvo+ " - " + maximoAlvo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}