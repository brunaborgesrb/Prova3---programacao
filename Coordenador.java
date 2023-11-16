

public class Coordenador extends Professor{

    //atributos
    private String horarioDeAtendimento;

    //construtor
     public Coordenador(String curso, String matricula, String horarioDeAtendimento) {
        this.curso = curso;
        this.matricula = matricula;
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    //metodos
    public String getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }

    public void setHorarioDeAtendimento(String horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }


    public void solicitacaoAluno(Aluno aluno) {
        if (aluno.isStatus()) {
            aluno.setStatus(false);
        } else {
            aluno.setStatus(true);
        }
    }

    public void removerTurma(Aluno aluno, Professor professor) {
        if (Arrays.asList(professor.getTurma()).contains(aluno)) {
            Arrays.asList(professor.getTurma()).remove(aluno);
        } else {
            throw new RuntimeException("o aluno não está presente na turma.");
        }
    }
}
