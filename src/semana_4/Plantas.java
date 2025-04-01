package semana_4;

public class Plantas {
    public String nome;
    public String tipo;
    public double necessidadeAgua;

    public Plantas(String nome, String tipo,double necessidadeagua){
        this.setNome(nome);
        this.setTipo(tipo.toLowerCase());
        this.setNecessidadeAgua(necessidadeagua);
    }

    public static void main(String[] args){
        Plantas plantinha= new Plantas("jabuticaba", "Frutífera", 4.00);
        plantinha.calcularNecessidadeDeAgua(2,40.0);
        plantinha.irrigar();
    }

    public void calcularNecessidadeDeAgua(int qtdSemanas, double areametroquadrado){
        double aguas = this.necessidadeAgua * qtdSemanas*areametroquadrado;
        System.out.println("A plantinha "+nome+" é do tipo "+ tipo+" e precisa de "
        + aguas+"l de água para " + areametroquadrado+ "m² por "+ qtdSemanas+ " semanas" );
    }
    public void irrigar(){
        System.out.println("irrigação realizada");
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setTipo(String tipo){
        if (tipo.equals("frutífera") || tipo.equals("hortaliça")) {
            this.tipo=tipo.toLowerCase();
        }else {
            throw  new RuntimeException("Deve dizer se ela é frutífera ou hortaliça");
        }
    }

    public void setNecessidadeAgua(double necessidadeAgua){
        this.necessidadeAgua= necessidadeAgua;
    }
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public double getNecessidadeAgua() {
        return necessidadeAgua;
    }
}
