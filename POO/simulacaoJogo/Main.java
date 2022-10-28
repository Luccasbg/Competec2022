import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      Arqueiro arqueiro = new Arqueiro(10,50);
      Guerreiro guerreiro = new Guerreiro(20, 30);

      System.out.println("Insira a força do arco desejado:");
      int forcaArco = sc.nextInt();

      System.out.println("Insira a força da espada desejada:");
      int forcaEspada = sc.nextInt();


      arqueiro.setForcaArco(forcaArco);
      guerreiro.setForcaEspada(forcaEspada);

      while(arqueiro.getVida() > 0 && guerreiro.getVida() > 0){
          arqueiro.atacarInimigo(guerreiro);
          if(guerreiro.getVida() <= 0){
              System.out.println("O personagem morreu!");
          }else{
              System.out.println("Vida do guerreiro: " + guerreiro.getVida());
          }
      }
    }
}
