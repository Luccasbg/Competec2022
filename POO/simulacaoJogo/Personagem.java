public abstract class Personagem {

    private int vida, ataque, velocidade;

    public Personagem(int vida, int ataque, int velocidade){
        this.vida = vida;
        this.ataque = ataque;
        this.velocidade = velocidade;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }
}