/*Faça um programa para ler 2 valores informados pelo usuário e se o segundo valor informado for neutro, deve ser lido um novo valor - ou seja, para o segundo valor não pode ser aceito o valor zero nem um valor negativo. O programa deve imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido.  */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner resposta=new Scanner(System.in);
    System.out.println("Valor?");
    int valor=resposta.nextInt();
    System.out.println("Valor????????????");
    int valor2=resposta.nextInt();

    while(valor2<=0){
      System.out.println("Sabe nem informar um valor hein");valor2=resposta.nextInt();
      System.out.println("Espero que seja um número bom amigo, espero");
    }

    double divisao=valor/valor2;

    System.out.println(divisao);
  }
}
