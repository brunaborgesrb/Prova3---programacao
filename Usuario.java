public abstract class Usuario{

    //atributos
    private String nome;
    private int idade;

    //construtores
    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //metodo
    public abstract void atividade(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}


