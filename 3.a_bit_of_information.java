/*Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]". */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Qual seu nome amiguinho?");
    Scanner resposta=new Scanner(System.in);
    String nome=resposta.nextLine();
     System.out.println("E sua idade?");
    int idade=resposta.nextInt();
    if(idade==1){
       System.out.println("Olá ,"+nome+". Sua idade é "+idade+" ano");
    }else{
       System.out.println("Olá ,"+nome+". Sua idade é "+idade+" anos");
    }
  }
}
