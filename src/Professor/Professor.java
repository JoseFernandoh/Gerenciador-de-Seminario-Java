package Professor;

import Seminario.Seminario;

public class Professor {
    // Criaçao das Variaveis Privadas
    private String nome,especialidade;
    private Seminario[] seminario;

    // Construtores 1ª para receber os valores Direto 2ª sem receber nada;
    public Professor(String nome,String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }
    public Professor(){

    }

    //imprimir Os Detalhes do Professor
    public void Imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Especialidade: "+this.especialidade);
        System.out.println("Seminairo Feitos");
        if(this.seminario!=null && this.seminario.length != 0 ){
            for (Seminario aux : this.seminario) {
                System.out.println(aux.gettitulo());
            }
            return;
        }
        System.out.println("Nao Possui Seminario.");
    }

    //Set e Get das Variaveis Privadas
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setEspecialidade(String especialidade){
        this.especialidade = especialidade;
    }
    public String getEspecialidade(){
        return this.especialidade;
    }
    public void setSeminario(Seminario... seminario){
        this.seminario = seminario;
    }
    public Seminario[] getSeminario(){
        return this.seminario;
    }
}
