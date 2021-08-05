package Seminario;

import Local.Local;
import Professor.Professor;
import Aluno.Aluno;

public class Seminario {
    // Criaçao das Variaveis Privadas
    private String titulo;
    private Professor professor;
    private Local local;
    private Aluno[] aluno;

    // Construtores 1ª para receber os valores Direto 2ª sem receber nada;
    public Seminario(String titulo){
        this.titulo = titulo;
    }
    public Seminario(){

    }

    //imprimir Os Detalhes do Seminario
    public void imprimir(){
        System.out.println("Titulo: "+this.titulo);
        if(professor != null){
            System.out.println("Professor: "+this.professor.getNome());
        }
        else{
            System.out.println("Nenhum Professor Cadastrado");
        }
        if(local != null){
            this.local.imprimir();
        }
        else{
            System.out.println("Nnehum Local Definido.");
        }
        System.out.println("Lista De Alunos Do Seminario: ");
        if(aluno!=null && this.aluno.length != 0){
            for (Aluno aux : this.aluno) {
                System.out.println(aux.getNome());
            }
            return;
        }
        System.out.println("Nao Possui Aluno.");
    }

    //Set e Get das Variaveis Privadas
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String gettitulo(){
        return this.titulo;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public Professor getProfessor(){
        return this.professor;
    }
    public void setLocal(Local local){
        this.local = local;
    }
    public Local getLocal(){
        return this.local;
    }
    public void setAluno(Aluno... aluno){
        this.aluno = aluno;
        for (Aluno aux : aluno) {
            aux.setSeminario(this);
        }
    }
    public Aluno[] getAluno(){
        return this.aluno;
    }

}
