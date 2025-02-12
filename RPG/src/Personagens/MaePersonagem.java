package Personagens;
import java.util.ArrayList;

public abstract class MaePersonagem implements PersonagemInterface{
    protected String nomePersonagens;
    protected int vida;
    protected String nomePoderEspecial;
    protected int dano;
    protected int barraDeMana;
    protected final int danoAtkEspecial = 120;
    protected ArrayList<String> itens = new ArrayList<>();

    public MaePersonagem(String nome, int vida, String poderEspecial, int dano){
        this.nomePersonagens = nome;
        this.vida = vida;
        this.nomePoderEspecial = poderEspecial;
        this.dano = dano;
        this.barraDeMana = 0;
    }

    //Metodos da classe mae
    public void poderEspecial() {
        System.out.println("\nE seu poder especial e o " + nomePoderEspecial + ".");
    }
    
    public void tomarPocaoDano() {
        if(itens.contains("pocao dano")){
            this.dano += 10;
            System.out.println("\nPocao de dano usada.");
            itens.remove("pocao dano");
        }
        else{
            System.out.println("\nSem pocoes restantes.");
        }
    }

    public void tomarPocaoVida(){
        if(itens.contains("pocao vida")){
            this.vida += 50;
            System.out.println("\nPocao de vida usada.");
            itens.remove("pocao vida");
        }
        else{
            System.out.println("\nSem pocoes restantes.");
        }
    }

    public void addPocaoVida(){
        itens.add("pocao vida");
    }

    public void addPocaoDano(){
        itens.add("pocao dano");
    }
    
    public void recebeDano(int dano){
        this.vida -= dano;
    }

    public void aumentaBarraMana(int ptsMana){
        if(this.barraDeMana + 15 >= 100){
            this.barraDeMana = 100;
        }
        else{
            this.barraDeMana += 15;
        }
    }

    public void resetPtsEspecial(){
        this.barraDeMana = 0;
    }

    //Getters
    public int getDano() {
        return dano;
    }

    public String getNomePersonagens() {
        return nomePersonagens;
    }
    public String getPoderEspecial() {
        return nomePoderEspecial;
    }

    public int getVida() {
        return vida;
    }

    public int getBarraDeMana() {
        return barraDeMana;
    }

    public int getDanoAtkEspecial() {
        return danoAtkEspecial;
    }

    //A ser definido
    public abstract void mostrarArma();

    public abstract void contarHistoria();

    public abstract void resetDano();
    
}
