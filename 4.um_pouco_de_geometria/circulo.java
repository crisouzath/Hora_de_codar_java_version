import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner resposta=new Scanner(System.in);
    System.out.println("Área do círculo");
    System.out.println("Informe o valor do raio?");
    int raio=resposta.nextInt();
    double pi=3.14;
    double area=(raio*raio)*pi;

    System.out.println("A área é "+area);
  }
}