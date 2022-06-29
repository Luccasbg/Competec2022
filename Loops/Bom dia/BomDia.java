import java.util.Scanner;

public class BomDia {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int senha = 0;
      
      while(senha != 40028922){
          senha = scan.nextInt();
      }
      System.out.print("Eh o funk do Yudi que vai dar Playstation 2");
    }
}