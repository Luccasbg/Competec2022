import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.println("Você deseja cadastrar um professor ou um aluno?");
      String tipoCadastro = scanner.nextLine();

      if(tipoCadastro.toLowerCase().equals("aluno")){
          System.out.println("Insira o seu nome:");
          String nomeAluno = scanner.nextLine();

          System.out.println("Insira o seu sobrenome:");
          String sobrenomeAluno = scanner.nextLine();

          System.out.println("Insira sua idade:");
          int idadeAluno = scanner.nextInt();

          Aluno aluno = new Aluno(nomeAluno, sobrenomeAluno, idadeAluno);
          System.out.println(aluno);
      }else if(tipoCadastro.toLowerCase().equals("professor")){
          System.out.println("Insira o seu nome:");
          String nomeProfessor = scanner.nextLine();

          System.out.println("Insira o seu sobrenome:");
          String sobrenomeProfessor = scanner.nextLine();

          System.out.println("Insira sua idade:");
          int idadeProfessor = scanner.nextInt();

          Professor professor = new Professor(nomeProfessor, sobrenomeProfessor, idadeProfessor);
          System.out.println(professor);
      }else{
          System.out.println("Insira um tipo de cadastro válido!");
      }
  }
}

