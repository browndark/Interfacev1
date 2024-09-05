package Dados;

public class AlunoService implements ICrud {

    @Override
    public void salvar(Aluno aluno) {
        System.out.println("Aluno salvo: " + aluno.getNome());
    }

    @Override
    public Aluno consultarById(long id) {
        Aluno aluno = new Aluno();
        aluno.setId(id);
        aluno.setNome("Aluno Exemplo");
        aluno.setCpf(123456789L);
        return aluno;
    }
}
