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
        System.out.println(this.getNome() + ", você registrou sua área de pesquisa com sucesso!");
    }

    public String getAreaPesquisa() {
        return areaPesquisa;
    }

    public void setAreaPesquisa(String areaPesquisa) {
        this.areaPesquisa = areaPesquisa;
    }
}