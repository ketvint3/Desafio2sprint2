package Sting2Desafio;

public class BilheteEstudante extends Bilhete{

    //O Bilhete Único de Estudante possui cotas para serem utilizadas, com o método
    //recarregarBilhete automaticamente inserindo 48 cotas, e cada pagamento de
    //passagem retira uma cota.
    private int cota =0;

    public BilheteEstudante( Pessoa usuario) {
        super( usuario );

    }



    public void recarregarBilhete() {
        cota = cota + 48;


    }


    public void pagarPassagem() {
        cota = cota - 1;


    }

    @Override
    public String toString() {
        String dados = "";
        dados += "nome do usuario : " + this.usuario.getNome() + ("  ");
        dados += " codigo do bilhete: " + this.codigoDoBilhete + ("  ");
        dados += " cota: " + this.cota + ("  ");


        return dados;
    }
}
