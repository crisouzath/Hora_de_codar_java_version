/*Escreva um programa para ler as notas das 4 avaliações de um aluno no semestre, calcular e escrever a média do semestre e a seguinte mensagem: PARABÉNS! Você foi aprovado! somente se o aluno foi aprovado (considere 6.0 a média mínima para aprovação e 4 notas informadas).  */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner resposta=new Scanner(System.in);
    int[] notas = new int[4];
        int media = 0, soma = 0;
        for(int i=0; i< notas.length; i++){
            System.out.println("Informe a nota:");
            notas[i] = resposta.nextInt();
            soma += notas[i];
        }
        media = soma/4;
        if(media >= 6){
            System.out.println("PARABÉNS! Você foi aprovado! Com a média de: " + media);
        }else{
            System.out.println("Você foi reprovado! Com a média de: " + media);
        }
  }
}
