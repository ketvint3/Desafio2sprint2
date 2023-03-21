package classesEObjetos;

public class TestePessoa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(" ket queiroz");
        p1.setIdade(13);

        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();
        p1.fazAniversario();

        System.out.println("nome da pessoa: " + p1.getNome());
        System.out.println("idade da pessoa: " + p1.getIdade());


    }
}
