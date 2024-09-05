import Dados.Aluno;
import Dados.AlunoService;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Bruno");
        aluno.setId(7515151712L);
        aluno.setCpf(153115815);

        AlunoService alunoService = new AlunoService();
        alunoService.salvar(aluno);
    }
}
