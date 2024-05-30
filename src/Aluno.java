public class Aluno {
    // Atributos da classe Aluno
    private String nome;
    private int idade;
    private String matricula;

    // Construtor da classe Aluno
    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    // Getters e Setters para os atributos
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Método para imprimir os detalhes do aluno
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Matricula: " + matricula;
    }
}
