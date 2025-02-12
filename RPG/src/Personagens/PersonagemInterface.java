package Personagens;
public interface PersonagemInterface {
    public void contarHistoria();
    public void mostrarArma();
    public void addPocaoDano();
    public void addPocaoVida();
    public void poderEspecial();
    public void tomarPocaoVida();
    public void tomarPocaoDano();
    public void resetPtsEspecial();
    public void resetDano();
    public void recebeDano(int dano);
    public void aumentaBarraMana(int ptsMana);
}
