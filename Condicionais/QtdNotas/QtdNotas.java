import java.util.Scanner;

public class QtdNotas {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      double preco = scan.nextDouble();
      
      if(preco / 100 >= 1){
          int notasCem = (int) preco / 100;
          System.out.println(notasCem+ " nota(s) de R$ 100");
      }
      
      preco = preco % 100; //trocando o valor pelo resto - que sobrou da divisão anterior
      
      if(preco / 50 >= 1){
          int notasCinquenta = (int) preco / 50;
          System.out.println(notasCinquenta+ " nota(s) de R$ 50");
      }
      
      preco = preco % 50;
      
      if(preco / 20 >= 1){
          int notasVinte = (int) preco / 20;
          System.out.println(notasVinte+ " nota(s) de R$ 20");
      }
      
      preco = preco % 20;
      
      if(preco / 10 >= 1){
          int notasDez = (int) preco / 10;
          System.out.println(notasDez+ " nota(s) de R$ 10");
      }
      
      preco = preco % 10;
      
      if(preco / 5 >= 1){
          int notasCinco = (int) preco / 5;
          System.out.println(notasCinco+ " nota(s) de R$ 5");
      }
      
      preco = preco % 5;
      
      if(preco / 2 >= 1){
          int notasDois = (int) preco / 2;
          System.out.println(notasDois+ " nota(s) de R$ 2");
      }
      
      preco = preco % 2;
      
      if(preco / 1 >= 1){ //não obrigatório, mas usei a condição para não mostrar "0 modedas de R$ 1 a cada rodada"
        int moedasUm = (int) preco / 1;
        System.out.println(moedasUm+ " moeda(s) de R$ 1");
      }
      
           
      preco = preco % 1;
      
      if(preco / 0.5 >= 1){
          double moedasCinquenta =  preco / 0.5;
          System.out.println((int) moedasCinquenta+ " moeda(s) de R$ 0.50");
      }
      
      preco = preco % 0.5;
      
      if(preco / 0.25 >= 1){
          double moedasVinteCinco =  preco / 0.25;
          System.out.println((int) moedasVinteCinco+ " moeda(s) de R$ 0.25");
      }
      
      preco = preco % 0.25;
      
      if(preco / 0.10 >= 1){
          double moedasDez = preco / 0.10;
          System.out.println((int) moedasDez+ " moeda(s) de R$ 0.10");
      }
    
      preco = preco % 0.10;
    
      if(preco / 0.05 >= 1){
          double moedasCinco = preco / 0.05;
          System.out.println((int) moedasCinco+ " moeda(s) de R$ 0.05");
      }
        
    }
}