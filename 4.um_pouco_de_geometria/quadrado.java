import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner resposta=new Scanner(System.in);
    System.out.println("Área do quadrado");
    System.out.println("Informe o valor do lado?");
    int lado=resposta.nextInt();
    int area=lado*lado;

    System.out.println("A área é "+area);
  }
}