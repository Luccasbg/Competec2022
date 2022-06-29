import java.util.Scanner;

public class Vacinas{
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int n = scan.nextInt();
      int[] gene = new int[n];
      int contador = -1; //Para que a primeira comparação seja anulada, pois vai ser uma condicional em relação à ela mesma
      
      for(int i = 0; i < n; i++){
          gene[i] = scan.nextInt();
      }
      
      for(int x = n-1; x >= 0; x--){
          if(gene[n-1] == gene[x]){
              contador++;
          }
      }
      switch(contador){
          case 0:
              System.out.println("Sumiuu!");
              break;
          case 1:
              System.out.println("Ainda não é o suficiente!");
              break;
          default:
              System.out.println("Achei o danado!");
              break;
      }
    }
}