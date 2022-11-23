import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner resposta=new Scanner(System.in);
    System.out.println("Área do retângulo");
    System.out.println("Informe o valor da altura?");
    int altura=resposta.nextInt();
    System.out.println("Informe o valor da base?");
    int base=resposta.nextInt();

    int area=base*altura;

    System.out.println("A área é "+area);
  }
}