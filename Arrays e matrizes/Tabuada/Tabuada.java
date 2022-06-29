import java.util.Scanner;

public class Tabuada {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int n = scan.nextInt();
      
      for(int x = 1; x <= n; x++ ){
          for(int m = 0; m <= 10; m++){
              System.out.println(x + " x " + m + " = " + x * m);
          }
          System.out.println("===============");
      }
    }
}
    