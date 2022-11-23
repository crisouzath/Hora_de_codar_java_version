import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner resposta=new Scanner(System.in);
    System.out.println("Área do losango");
    System.out.println("Informe o valor da base menor?");
    int baseM=resposta.nextInt();
    System.out.println("Informe o valor da base maior?");
    int basem=resposta.nextInt();

    int area=(baseM*basem)/2;

    System.out.println("A área é "+area);
  }
}