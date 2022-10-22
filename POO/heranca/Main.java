public class Main {
  public static void main(String[] args) {

      Aluno aluno = new Aluno("Luccas", "Guimarães", 17);
      Professor professor = new Professor("Caio", "Novais", 21);

      aluno.matricularAluno("Sistemas de informação");
      professor.iniciarPesquisa("Inteligência artificial");

      System.out.println(aluno.getNome() + ", seu curso de graduação é: " + aluno.getCursoGraduacao());
      System.out.println(professor.getNome() + ", sua área de pesquisa é: " + professor.getAreaPesquisa());
  }
}