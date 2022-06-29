import java.util.Scanner;

public class LowestValue {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      int arraySize = scan.nextInt();
      int[] array = new int[arraySize];
      int lowestValue = 2147483647; //maior valor para uma variável do tipo int (no Java)
      int lowestValuePosition = 0;
      
      for(int i = 0; i < arraySize; i++){
          array[i] = scan.nextInt();
          
          if(array[i] < lowestValue){
              lowestValue = array[i];
              lowestValuePosition = i;
          }
      }
      System.out.print("O menor valor digitado foi " + lowestValue + ", na posição " + lowestValuePosition + " do array");
    }
}