/*Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Qual seu nome amiguinho?");
    Scanner resposta=new Scanner(System.in);
    String nome=resposta.nextLine();
    System.out.println("Olá, "+nome);
  }
}
