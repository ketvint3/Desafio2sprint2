package Desafios;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //1. Deve permitir o cadastramento de no máximo 20 contatos, constando nome e número
        //de telefone;
        // 2. Os nomes e telefones devem ser armazenados em arrays;

        String[] nome = new String[20];
        String[] telefone = new String[20];
         int opcao;
         int posicao=0;
         String excluirNome;

        //3. Criar um menu Principal com as seguintes opções: 1-Cadastrar Contato, 2-Excluir
        //Contato, 3-Listar todos os Contatos, 4-Limpar a lista de contatos e 99-Sair;
       //4. O sistema deve parar a execução somente quando o usuário informar a opção 99-Sair

        do { System.out.println(" ------Menu Principal------");
            System.out.println(" Informe A Opçao Desejada Ou 99 Para Sair");
            System.out.println("1= Cadastrar novo contato da agenda");
            System.out.println("2= Excluir contato da agenda");
            System.out.println("3= Listar contatos da agenda");
            System.out.println("4= Limpar todos os contatos");

            opcao = input.nextInt();

            switch (opcao) {


                // Adicionar contato
                case 1:
                    System.out.println("Cadastrar Novo Contato da Agenda");
                    input.nextLine();

                    System.out.println("Digite o Nome:");
                    nome[posicao] = input.nextLine();

                    System.out.println("Digite o Telefone:");
                    telefone[posicao] = input.nextLine();

                    posicao++;
                    break;


                // Excluir contato
                case 2:
                    System.out.println("Excluir contato da agenda");
                    input.nextLine();


                    System.out.println("Qual Contato Deseja Excluir?");
                    excluirNome = input.nextLine();


                    boolean depois = false;
                    for (int i = 0; i < 20; i++) {
                        if (nome[i] != null) {

                            if(depois == true) {
                                nome[i-1] = nome[i];
                                telefone[i-1] = nome[i];

                            }

                            if (nome[i].equals(excluirNome)) {
                                depois=true;
                                System.out.println("Contato Excluido!");
                                nome[i] = null;
                                telefone[i] = null;
                            }

                        }

                    }
                     break;


                //listar contatos
                case 3:
                    System.out.println("listar contatos da agenda");
                    input.nextLine();

                    System.out.println("Aqui Está Sua Lista De Contatos :");


                    for (int i = 0; i < 20; i++) {
                        if (nome[i] != null) {
                            System.out.println(" Nome: " + nome[i] + "    " + "Telefone: " + telefone[i] + "    ");


                        }

                    }
                    break;


                case 4:
                    System.out.println("limpar todos os contatos");
                    input.nextLine();

                    System.out.println("Lista De Contatos Vazia");

                    for (int i = 0; i < 20; i++) {

                        nome[i] = null;
                        telefone[i] = null;


                    } break;

                case 99:
                    System.out.println("programa finalizado!");
                    break;

                default:
                    System.out.println("opçao invalida. Tente novamente");


            }
        } while (opcao!=99);

    }
}
