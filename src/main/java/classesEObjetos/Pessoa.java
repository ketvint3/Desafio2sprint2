package classesEObjetos;

public class Pessoa {

    private String  nome;
    private int idade;

    public Pessoa( String nomeDaPessoa) {
        this.nome = nomeDaPessoa;
    }

    public void fazAniversario() {
        int novaIdade = this.idade +1;
        this.idade = novaIdade;


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
