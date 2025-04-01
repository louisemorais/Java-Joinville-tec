package semana_4;

public class EmissaoDeCarbono {
    public String atividades;
    public double quantidadeEmissao;

    public EmissaoDeCarbono(String atividade, double quantidadeEmissao){
        this.atividades=atividade;
        this.quantidadeEmissao=quantidadeEmissao;
    }

    public double calcularEmissaoCO2(double minutos){
        double horas = minutos / 60.0;
        return quantidadeEmissao * horas;
    }

    public void exibirEmissao(double minutos) {
        double emissaoTotal = calcularEmissaoCO2(minutos);
        System.out.printf("A atividade '%s' emitiu %.2f kg de CO2 em %.1f minutos.%n",
                atividades, emissaoTotal, minutos);
    }

    public String getAtividades(){
        return atividades;
    }

    public double getQuantidadeEmissao(){
        return quantidadeEmissao;
    }


    public static void main(String[] args){
        EmissaoDeCarbono carro= new EmissaoDeCarbono("andar de carro",4.0);
        EmissaoDeCarbono aviao= new EmissaoDeCarbono("andar de avião",10.0);
        EmissaoDeCarbono geradorAGasolina= new EmissaoDeCarbono("gerador a gasolina",12.0);
        carro.exibirEmissao(40);
        aviao.exibirEmissao(120);
        geradorAGasolina.exibirEmissao(60);
    }
}
