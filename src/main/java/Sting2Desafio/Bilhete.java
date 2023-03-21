package Sting2Desafio;

import java.util.Random;

public class Bilhete {

    // BILHETE UNICO
    protected String codigoDoBilhete;



    protected Pessoa usuario;


    public Bilhete(Pessoa usuario) {
        this.codigoDoBilhete = gerarCodigo();
        this.usuario = usuario;
    }

    public Pessoa getUsuario() {
        return usuario;
    }

    public String getCodigoDoBilhete() {
        return codigoDoBilhete;
    }

    public void pagarPassagem() {

    }
    public void recarregarBilhete(){

    }
    public void pesquisarBilhetePorCpf(){


    }
    public void recarregarBilhete(double valor){

    }
    public String gerarCodigo() {
        double bilhete;
        Random random = new Random();
        bilhete = (int)(random.nextDouble() * 1000 );
        return String.valueOf(bilhete);
    }



}
