package Aluno;

import Seminario.Seminario;

public class Aluno {
    // Criaçao das Variaveis Privadas
    private String nome;
    private int idade;
    private Seminario seminario;

    // Construtores 1ª para receber os valores Direto 2ª sem receber nada;
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Aluno(){

    }
    //imprimir Os Detalhes do Aluno
    public void inprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        if(this.seminario != null){
            System.out.println("Seminario "+ this.seminario.gettitulo());
        }else{
            System.out.println("Nao Possui Seminario.");
        }
        
    }
    
    //Set e Get das Variaveis Privadas
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }
    public void setSeminario(Seminario seminario){
        this.seminario = seminario;
    }
    public Seminario getSeminario(){
        return this.seminario;
    }

}
