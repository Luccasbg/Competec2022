public class Guerreiro extends Personagem implements Action {

    private int forcaEspada;
    public Guerreiro(int ataque, int velocidade){
        super(100, ataque, velocidade);
    }

    @Override
    public void atacarInimigo(Personagem inimigo){
        inimigo.setVida(inimigo.getVida() - (this.getAtaque() + this.getForcaEspada()));
    }

    public void setForcaEspada(int forcaEspada){
        this.forcaEspada = forcaEspada;
    }

    public int getForcaEspada() {
        return forcaEspada;
    }
}