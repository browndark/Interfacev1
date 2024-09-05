package Dados;

public interface ICrud {
    void salvar(Aluno aluno);
    Aluno consultarById(long id);

}

