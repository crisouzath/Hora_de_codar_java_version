import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner resposta=new Scanner(System.in);
    System.out.println("Área do trapézio");
    System.out.println("Informe o valor da base menor?");
    int baseM=resposta.nextInt();
    System.out.println("Informe o valor da base maior?");
    int basem=resposta.nextInt();
    System.out.println("Informe o valor da altura?");
    int altura=resposta.nextInt();

    int area=((baseM+basem)*altura)/2;

    System.out.println("A área é "+area);
  }
}