/*Crie uma bomba relógio (usando somente código - para deixar claro!) cuja contagem regressiva vá de 30 a 0. Utilize "document.write" para escrever em tela e no final da repetição escreva "EXPLOSÃO". */

class Main {
  public static void main(String[] args) {
    for(int i = 30; i>0; i--){
            System.out.println(i);
        }
        System.out.println("EXPLOSÃO!");
  }
}
