/* Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final. Considere que a nota de aprovação é 6,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta. Se a resposta for "S", o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade de alunos aprovados. */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner resposta = new Scanner(System.in);
         double n1, n2, media = 0;
        int cont = 0;
        String conf;

        do{
            System.out.println("Informe a primeira nota:");
            n1 = resposta.nextDouble();
            System.out.println("Informe a segunda nota:");
            n2 = resposta.nextDouble();

            media = (n1 + n2)/2;

            if(media >= 9.5){
                System.out.println("Aluno aprovado com a média: " + media + "\n");
                cont+=1;
            }
            else{
                System.out.println("Aluno reprovado com a média: " + media + "\n");
            }
            System.out.println("Deseja calcular a média de outro aluno S/N?\n");
            conf = resposta.next();
        }
        while(conf.equals("S") || conf.equals("s"));
  }
}
