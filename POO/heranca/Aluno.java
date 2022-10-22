public class Aluno extends EachUspMember{
    private String cursoGraduacao;

    public Aluno(String nome, String sobrenome, int idade) {
        super(nome, sobrenome, "Aluno", idade);
    }

    public void matricularAluno(String cursoGraduacao){
        if(cursoGraduacao.equals("")){
            System.out.println("Erro!");
        }else{
            this.cursoGraduacao = cursoGraduacao;
            System.out.println(this.getNome() + ", você foi matriculado com sucesso no curso de " + this.getCursoGraduacao() + "!");
        }
    }

    public String getCursoGraduacao() {
        return this.cursoGraduacao;
    }
}