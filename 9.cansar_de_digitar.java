/*Faça um programa que leia 10 valores informados pelo usuário, calcule, exiba os números informados e escreva a média aritmética desses valores lidos.*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner resposta=new Scanner(System.in);
    int num = 0, i, resultado;
        for(i=1; i<11; i++){
            System.out.println("Informe o " + i +"° " + "número");
            num = resposta.nextInt();
            num = num + i;
        }
        resultado = num / 10;
        System.out.println("A média é " + result);
  }
}
