import java.util.Scanner;

public class Geografia {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int ddd = scan.nextInt();
      
      switch(ddd){
          case 11:
              System.out.println("PÔ MANOOO");
              break;
          case 21:
              System.out.println("Pegou a visão mermão?");
              break;
      
          case 31:
              System.out.println("Cê tá bão? Quer um pãozinho de queijo?");
              break;
              
          case 41:
              System.out.println("Guri, me vê um pinhão");
              break;
              
          default:
              System.out.println("“NÃO ATENDA JUNINHO!!");
              break;
      }
    }
}
    
    