package Local;

public class Local {
    // Criaçao das Variaveis Privadas
    private String rua,bairro;

    // Construtores 1ª para receber os valores Direto 2ª sem receber nada;
    public Local(String rua,String bairro){
        this.rua = rua;
        this.bairro = bairro;
    }
    public Local(){

    }

    //imprimir Os Detalhes do Local
    public void imprimir(){
        System.out.println("Rua: "+this.rua);
        System.out.println("Bairro: "+this.bairro);
    }

    //Set e Get das Variaveis Privadas
    public void setRua(String rua){
        this.rua = rua;
    }
    public String getRua(){
        return this.rua;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public String getbairro(){
        return this.bairro;
    }
}
