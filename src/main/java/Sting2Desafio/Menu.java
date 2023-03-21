package Sting2Desafio;

import jdk.jshell.ImportSnippet;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);

    static List<Bilhete> bilhetes = new ArrayList<Bilhete>();
    static List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public void menu() {
        int opcoes = 0;
        String codigoDoBilhete;
        int guardarTipoDeBilhete;
        int saldo;
        String guardarCodigo;

        //Criar um menu Principal com as seguintes opções:

        // abri o do while e o shwitch case
        // while = caso n queria nenhuma das opçoes 99 para sair

        do {System.out.println("---MENU PRINCIPAL---");
            System.out.println(" 1= Cadastrar Usuário ");
            System.out.println(" 2= Cadastrar Bilhete ");
            System.out.println(" 3= Recarregar Bilhete ");
            System.out.println(" 4= Pagar Passagem");
            System.out.println(" 5= Listar Bilhetes");
            System.out.println(" 6= Pesquisar Bilhete Por CPF");
            System.out.println(" 99 Para Sair");

            try{
                opcoes = input.nextInt();

            }catch (InputMismatchException e){
                System.out.println("valor invalido, insira um numero");
                input.next();
            }



            switch (opcoes) {


                case 1: {
                    System.out.println(" 1= Cadastrar Usuário ");
                    input.nextLine();

                    System.out.println(" Digite o Nome : " );
                    String nome = input.nextLine();

                    System.out.println(" Digite o email : ");
                    String email = input.nextLine();

                    System.out.println(" Digite o Telefone : ");
                    String telefone = input.nextLine();

                    System.out.println(" Digite o CPF : ");
                    String cpf = input.nextLine();
                    System.out.println(" USUÁRIO CADASTRADO");
                    Pessoa p1 = new Pessoa(nome,email,cpf,telefone);
                    pessoas.add(p1);

                    break;

                } case 2:
                    System.out.println(" 2= Cadastrar Bilhete ");
                    input.nextLine();
                    System.out.println("Insira Seu CPF");
                    String cpf = input.nextLine();
                    Pessoa p1 = null;
                    boolean achou = false;
                    for (Pessoa p:pessoas){
                        if (cpf.equals(p.getCpf())){
                            p1 = p;
                            achou = true;

                        }
                    }
                    if (!achou) {
                        System.out.println("CPF Inálido. Tente Novamente");


                    }else {

                        System.out.println("Qual Tipo de Bilhete Voce Deseja Obter?");
                        System.out.println("1 = Bilhete Estudante");
                        System.out.println("2 = Bilhete Padrao");
                        guardarTipoDeBilhete = input.nextInt();
                        Bilhete b1;
                        if (guardarTipoDeBilhete == 1) {
                            b1 = new BilheteEstudante(p1);
                            System.out.println("BILHETE ESTUDANTE CADASTRADO");

                        }else {
                            b1 = new BilheteUnico(p1);
                            System.out.println("BILHETE ÚNICO CADASTRADO");
                        }
                        bilhetes.add(b1);

                    }

                    break;

                case 3:
                    System.out.println(" 3= Recarregar Bilhete ");
                    System.out.println(" Insira o Codigo Do Bilhete ");
                    input.nextLine();
                    guardarCodigo = input.nextLine();

                    Bilhete guardarBilhete = null;
                    boolean achouBilhete = false;
                    for (Bilhete b : bilhetes) {


                        if (b.codigoDoBilhete.equals(guardarCodigo)){
                            guardarBilhete = b;
                            achouBilhete = true;
                        }
                    }

                    if (!achouBilhete) {
                        System.out.println("Codigo invalido. Tente Novamente");
                    } else {

                        if (guardarBilhete instanceof BilheteEstudante) {

                            guardarBilhete.recarregarBilhete();
                            System.out.println("BILHETE RECARREGADO");

                        }else {
                            System.out.println("Informe o Valor que Deseja Recarregar");

                            double guardarValor = input.nextDouble();
                            guardarBilhete.recarregarBilhete(guardarValor);

                            System.out.println("BILHETE RECARREGADO");
                        }
                    }
                    break;

                case 4://PAGAR PASSAGEM
                    achou = false;
                    input.nextLine();
                    System.out.println("Informe Seu Código: ");
                    String codigoDobilhete = input.nextLine();
                    guardarBilhete= null;
                    for (Bilhete value : bilhetes) {
                        if (codigoDobilhete.equals(value.getCodigoDoBilhete())) {
                            guardarBilhete = value;
                            achou = true;
                        }
                    }
                    if (achou == false) {

                        //Caso o usuário informe uma opção diferente do esperado, exibir a mensagem “Opção
                        //Inválida” e solicitar uma nova opção.
                        System.out.println("Código Inválido. Informe Outro Código: ");

                    } else {
                        guardarBilhete.pagarPassagem();
                        System.out.println("PASSAGEM PAGA");
                    }
                    break;


                case 5:// LISTAR BILHETES
                    System.out.println(" 5= Listar Bilhetes");
                    input.nextLine();

                    // USEI O FOREACH. foreach é uma versao mais simplificada do fori
                    System.out.println("Aqui Está a Sua Lista De Bilhetes :");
                    for (Bilhete bilhete: bilhetes
                         ) {
                        System.out.println(bilhete);


                    }

                    break;

                    //O método de pesquisar Bilhete recebe um CPF como parâmetro e retorna os dados do
                //Bilhete associado a pessoa.

                case 6:

                    System.out.println(" 6= Pesquisar Bilhete Por CPF");
                    String nada = input.nextLine();
                    System.out.println("Digite o CPF Cadastrado no Bilhete");
                    String salvarCpf = input.nextLine();
                    Bilhete salvar = null;
                    boolean achei = false;
                    for (Bilhete bilhete: bilhetes) {
                        if (salvarCpf.equals(bilhete.getUsuario().getCpf())){
                            salvar = bilhete;
                            achei = true;


                        }


                    }
                    if (achei == true)
                        System.out.println("Este é o Seu Bilhete: " + salvar);
                    else
                        System.out.println("CPF não encontrado: ");
                    break;





            }
            //O sistema deve parar a execução somente quando o usuário informar a opção 99 -Sair
        } while (opcoes != 99);

    }



}

