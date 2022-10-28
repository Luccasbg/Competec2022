public class Arqueiro extends Personagem implements Action{

    private int forcaArco;

   @Override
   public void atacarInimigo(Personagem inimigo){
       inimigo.setVida(inimigo.getVida() - (this.getAtaque() + this.getForcaArco()));
       System.out.println("Vida do " + inimigo.getNome() + " após o ataque: " + inimigo.getVida());
   }

    public Arqueiro(int ataque, int velocidade){
        super("arqueiro", 100, ataque, velocidade);
    }

    public void setForcaArco(int forcaArco) {
        this.forcaArco = forcaArco;
    }

    public int getForcaArco() {
        return forcaArco;
    }
}