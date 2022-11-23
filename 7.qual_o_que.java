/*Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores.  */

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

    int soma;

    if(num1>num2 && num1>num3){
      if(num2>num3){
        soma=num1+num2;
        System.out.println(num1+"+"+num2+"="+soma);
      }else{
        soma=num1+num3;
        System.out.println(num1+"+"+num3+"="+soma);
      }
    }else if(num2>num3&&num2>num1){
      if(num1>num3){
        soma=num2+num1;
        System.out.println(num2+"+"+num1+"="+soma);
      }else{
        soma=num2+num3;
         System.out.println(num2+"+"+num3+"="+soma);
      }
    }else{
      if(num1>num2){
        soma=num3+num1;
        System.out.println(num3+"+"+num1+"="+soma);
      }else{
        soma=num3+num1;
        System.out.println(num3+"+"+num2+"="+soma);
      }
    }
  }
}
