import Aluno.Aluno;
import Local.Local;
import Seminario.Seminario;
import Professor.Professor;

// Algoritimo pra Gerenciar Seminario
public class SeminarioExecut {
    public static void main(String[] args) throws Exception {
        Seminario sem = new Seminario("Programador WEB");
        Seminario sem1 = new Seminario("Programador Java");
        Professor prof = new Professor("Antonio","Programaçao Web(HTML CSS JS)");
        Local local = new Local("Santa Rita","Centro");
        Aluno aluno = new Aluno("joao",19);
        Aluno aluno1 = new Aluno("Carlos",23);
        Aluno aluno2 = new Aluno("Antonio",21);

        sem.setLocal(local);
        sem.setProfessor(prof);
        sem1.setProfessor(prof);
        sem.setAluno(aluno,aluno1,aluno2);
        sem.imprimir();
        System.out.println("----------------");
        aluno.inprimir();
        aluno1.inprimir();
        aluno2.inprimir();
        System.out.println("----------------");
        prof.setSeminario(sem,sem1);
        prof.Imprimir();

    }
}
