package Sting2Desafio;

public class Pessoa {

//1. Deve se ter uma Classe representando Usuários do Sistema, contendo CPF, nome,
//email e telefone da pessoa.
   private String nome;
    private String email;
    private String cpf;
    private String telefone;

 public String getNome() {
  return nome;
 }

 public String getEmail() {
  return email;
 }

 public String getCpf() {
  return cpf;
 }

 public String getTelefone() {
  return telefone;
 }

 public Pessoa (String nome, String email, String cpf, String telefone) {

     this.nome = nome;
     this.email = email;
     this.cpf = cpf;
     this.telefone = telefone;




    }

}
