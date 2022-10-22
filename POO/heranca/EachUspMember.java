public abstract class EachUspMember {
    private String nome, sobrenome, cargo;
    private int idade;

    public EachUspMember(String nome, String sobrenome, String cargo, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cargo = cargo;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cargo='" + cargo + '\'' +
                ", idade=" + idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}