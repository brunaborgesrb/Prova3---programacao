import java.util.Arrays;

public class Aluno {
    
    //atributos
    private String curso;
    private String matricula;
    private double[]notas;
    private boolean[]presenca;
    private boolean[]status;
    
    //construtor
    public Aluno(String curso, String matricula, double[] notas, boolean[] presenca, boolean[] status) {
        this.curso = curso;
        this.matricula = matricula;
        this.notas = new Notas[3];
        this.presenca = new Presenca[20];
        this.status = status;
    }

    //metodos
    public double media() {
        int faltas = (int) Arrays.stream(presenca).filter(p -> !p).count();
        int notas = (int) Arrays.stream(notas).filter(p -> !p).count();

        if (faltas > 5) {
            System.out.println("reprovado por falta");
            return -1;
        }

        else if (notas < 3){
            System.out.println("o aluno está com nota pendente");
        }

        else{
            double media = Arrays.stream(notas).average().orElse(0);
        if (media >= 7) {
            System.out.println("aprovado por média");
        } else if (media >= 5) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
        return media;
    }
        }

        public void presenca() {
            long faltas = Arrays.stream(presenca).filter(p -> !p).count();
            long presencas = Arrays.stream(this.presenca).filter(p -> p).count();
            System.out.println("faltas: " + faltas);
            System.out.println("presenças: " + presencas);

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

        public double[] getNotas() {
            return notas;
        }

        public void setNotas(double[] notas) {
            this.notas = notas;
        }

        public boolean[] getPresenca() {
            return presenca;
        }

        public void setPresenca(boolean[] presenca) {
            this.presenca = presenca;
        }

        public boolean[] getStatus() {
            return status;
        }

        public void setStatus(boolean[] status) {
            this.status = status;
        }
    }
