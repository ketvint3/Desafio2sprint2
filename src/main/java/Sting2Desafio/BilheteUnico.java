package Sting2Desafio;

import java.util.Random;

public class BilheteUnico extends Bilhete{

   //O Bilhete Único Comum que possui saldo, com o método recarregarBilhete recebendo
   //um valor para ser inserido no saldo do bilhete e o pagamento de passagem retirando 5
   //reais do valor.
    private double saldo;


    public BilheteUnico( Pessoa usuario) {
        super(usuario);
        this.saldo = saldo;


    }

    public void recarregarBilhete(double valor) {
        saldo = valor + saldo;
       // saldo recebe o valor mais o saldo anterior



    }
    public void pagarPassagem () {
        saldo = saldo - 5;


    }

    public void pesquisarBilhetePorCpf() {


    }


    @Override
    public String toString() {
        String dados = "";
        dados += "nome do usuario : " + this.usuario.getNome() + ("  ");
        dados += " codigo do bilhete : " + this.codigoDoBilhete + ("  ");
        dados += " saldo: " + this.saldo + ("  ");


        return dados;

    }
}
