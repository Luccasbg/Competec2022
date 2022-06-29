import java.util.Scanner;

public class Patinete{
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int[][] notas = new int[2][4];
      int somaNotas = 0;
      int mediaNotas = 0;
      
      for(int i = 0; i < 2; i++){
          for(int j = 0; j < 4; j++){
              notas[i][j] = scan.nextInt();
              somaNotas = somaNotas + notas[i][j];
          }
      }
      
      for(int x = 0; x < 2; x++){
          for(int y = 0; y < 4; y++){
              System.out.print(notas[x][y] + " ");
          }
      }
      System.out.print("- ");
      mediaNotas = somaNotas / 8; //o 8 representa o número total de notas
      System.out.print(mediaNotas);
    }
}