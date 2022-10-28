public class Main {
  public static void main(String[] args) {
      Arqueiro arqueiro = new Arqueiro(10,50);
      Guerreiro guerreiro = new Guerreiro(20, 30);

      arqueiro.setForcaArco(5);
      guerreiro.setForcaEspada(10);

      System.out.println(guerreiro.getVida());


      while(arqueiro.getVida() > 0 && guerreiro.getVida() > 0){
          if(arqueiro.getVida() <= 0 || guerreiro.getVida() <= 0){
              System.out.println("O personagem morreu!");
          }else{
              arqueiro.atacarInimigo(guerreiro);
              System.out.println(guerreiro.getVida());
          }
      }
  }
}