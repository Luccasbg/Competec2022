public class Arqueiro extends Personagem implements Action{

    private int forcaArco;

   @Override
   public void atacarInimigo(Personagem inimigo){
       inimigo.setVida(inimigo.getVida() - (this.getAtaque() + this.getForcaArco()));
   }

    public Arqueiro(int ataque, int velocidade){
        super(100, ataque, velocidade);
    }

    public void setForcaArco(int forcaArco) {
        this.forcaArco = forcaArco;
    }

    public int getForcaArco() {
        return forcaArco;
    }
}