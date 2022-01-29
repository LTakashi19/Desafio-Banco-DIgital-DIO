package Clientes;

import Tipo_Contas.Conta;

import java.util.ArrayList;


public abstract class Cliente {

   private final String nome;
   private  ArrayList<Conta> contas= new ArrayList<>();
   private  ArrayList<String> contatos= new ArrayList<>();




   public Cliente(String nome){
      this.nome= nome;
   }




   public String getNome() {
      return nome;
   }




   public void trocarAgencia(Conta conta, int novaAgencia){
      conta.setNumeroAgencia(novaAgencia);
      System.out.println("Agencia trocada para: " + novaAgencia);
   }

   public void adicionaConta(Conta conta){
      contas.add(conta);
   }

   public void adicionaContato(String contato){
      contatos.add(contato);
   }

   public void imprimeInformacoes(){
      System.out.println("\nLista de contatos de " + this.nome + ":");
      for (String contato : contatos){
         System.out.println(contato);
      }
      System.out.println("Contas associadas a " + this.nome + ":");
      for (Conta conta : contas){
         System.out.println(conta.getNumeroConta());
      }
      System.out.println("");
   }

}
