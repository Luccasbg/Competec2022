import java.util.Scanner;

public class RoboCoach {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      
      double[] grades = new double[3];
      double sumGrades = 0.0;
      double avarageGrades = 0.0;
      
      for(int i = 0; i < 3; i++){
          grades[i] = scan.nextDouble();
          sumGrades = sumGrades + grades[i];
      }
      avarageGrades = sumGrades / 3;
      
      if(avarageGrades >= 0 && avarageGrades < 3){
          System.out.println("Aluno reprovado! Elimine o que não te faz evoluir.");
      }else if(avarageGrades >= 3 && avarageGrades < 5){
          System.out.println("Aluno em recuperação! Nunca subestime sua capacidade, a vida muda quando você muda.");
      }else if(avarageGrades >= 5 && avarageGrades <= 10){
          System.out.println("Aluno aprovado! Só o talento não adianta, é o esforço que faz adiferença!");
      }
    }
}