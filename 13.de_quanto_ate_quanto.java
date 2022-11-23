/*Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo. */
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner resposta = new Scanner(System.in);
        int n1, n2, acum = 0, calculo = 0;
        System.out.println("Informe o primeiro número");
        n1 = resposta.nextInt();
        System.out.println("Informe o segundo número");
        n2 = resposta.nextInt();
        while(n1 <= n2){
            acum = acum + n1;
            n1++;
            calculo++;
        }
        System.out.println("O resultado é: " + acum/calculo);
  }
}
