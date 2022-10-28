import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      Arqueiro arqueiro = new Arqueiro(10,50);
      Guerreiro guerreiro = new Guerreiro(20, 30);

      System.out.println("Arqueiro - Insira a força do arco desejado:");
      int forcaArco = sc.nextInt();

      System.out.println("Guerreiro - Insira a força da espada desejada:");
      int forcaEspada = sc.nextInt();

      arqueiro.setForcaArco(forcaArco);
      guerreiro.setForcaEspada(forcaEspada);

      System.out.println("Quem irá atacar?");
      String personagemAtacante = sc.next();

      if(personagemAtacante.toLowerCase().equals("arqueiro")){
          while(guerreiro.getVida() > 0){
              arqueiro.atacarInimigo(guerreiro);
              if(guerreiro.getVida() <= 0){
                  System.out.println("O personagem morreu!");
              }
          }
      }else if(personagemAtacante.toLowerCase().equals("guerreiro")){
          while(arqueiro.getVida() > 0){
              guerreiro.atacarInimigo(arqueiro);
              if(arqueiro.getVida() <= 0){
                  System.out.println("O personagem morreu!");
              }
          }
      }else{
          System.out.println("Erro! Insira um personagem válido!");
      }
    }
}
