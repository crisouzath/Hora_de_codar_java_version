/* */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner resposta=new Scanner(System.in);
    System.out.println("Informe um número fazendo favor:");
    int num1=resposta.nextInt();
    System.out.println("Mais um:");
    int num2=resposta.nextInt();
    System.out.println("O último:");
    int num3=resposta.nextInt();

    if(num1>num2 && num1>num3){
      System.out.println("O número maior é "+num1);
    }else if(num2>num3&&num2>num1){
      System.out.println("O número maior é "+num2);
    }else{
       System.out.println("O número maior é "+num3);
    }
  }
}
