import java.util.Random;

public class Professor implements IOperações{
    
    //atributos
    private String curso;
    private String matricula;
    private Aluno[] turma;

    //construtor
    public Professor(String curso, String matricula, Aluno[] turma) {
        this.curso = curso;
        this.matricula = matricula;
        this.turma = new Aluno[10];
    }

    //metodos
    public double media(){
        double mediaTurma = Arrays.stream(turma)
                .filter(aluno -> Arrays.stream(aluno.getNotas()).noneMatch(nota -> nota == 0))
                .mapToDouble(Aluno::media)
                .average()
                .orElse(0);
        System.out.println("média da turma: " + mediaTurma);
        return mediaTurma;
    }

    public void presenca(){
        Random random = new Random();
        for (Aluno aluno : turma) {
            if (random.nextDouble() > 0.8) {
                aluno.setPresenca(false);
            } else {
                aluno.setPresenca(true);
            }
        }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Aluno[] getTurma() {
        return turma;
    }

    public void setTurma(Aluno[] turma) {
        this.turma = turma;
    }
    
    }
}
        

