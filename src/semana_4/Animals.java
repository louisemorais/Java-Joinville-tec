package semana_4;

public class Animals {
    private String nome;
    private String habitat;
    private String som;
    private String tipoDeAlimentacao;
    private String comida;

    public Animals(String nome,String habitat, String som,String comida ,String tipoDeAlimentacao){
        this.nome=nome;
        this.habitat=habitat;
        this.som=som;
        this.comida=comida;
        this.tipoDeAlimentacao=tipoDeAlimentacao.toLowerCase();
    }


    public void mover(){
        System.out.println(nome +" está caminhando entre "+ habitat);
    }

    public void emitirSom() {
        System.out.println(nome + " está " + som);
    }

    public void alimentar(){
        if (!tipoDeAlimentacao.equalsIgnoreCase("carnívoro")&&
        !tipoDeAlimentacao.equalsIgnoreCase("herbívoro")){
            throw new IllegalArgumentException("ERRO! você deve dizer se o animal é carnívoro ou herbívoro. Tente novamente");
        }else {
        System.out.println(nome +" está se alimentando de "+comida + " pois ele é " + tipoDeAlimentacao);
        }
    }

    public static void main(String[] args){
        Animals animals= new Animals("Onça pintada", "Floresta", "rugindo", "Carne","Carnívoro");
        animals.mover();
        animals.emitirSom();
        animals.alimentar();

        Animals animais= new Animals("capivara", "pantanal", "assoviando", "matinho","herbívoro");
        animais.mover();
        animais.emitirSom();
        animais.alimentar();
    }


    //getter
    public String getNome(){
        return nome;
    }

    public String getHabitat(){
        return  habitat;
    }
    public String getSom(){
        return som;
    }
    public String getTipoDeAlimentacao(){
        return tipoDeAlimentacao;
    }
}
