public class Professor extends EachUspMember {
    private String areaPesquisa;

    public Professor(String nome, String sobrenome, int idade) {
        super(nome, sobrenome, "Professor", idade);
    }

    public void iniciarPesquisa(String areaPesquisa){
        if(areaPesquisa.equals("")){
            System.out.println("Erro!");
        }

        this.areaPesquisa = areaPesquisa;
        System.out.println(this.getNome() + ", você registrou sua pesquisa na área de " + this.getAreaPesquisa() + " com sucesso!");
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }
}