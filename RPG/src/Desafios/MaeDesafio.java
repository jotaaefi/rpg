package Desafios;
public abstract class MaeDesafio implements DesafioInterface{
    protected String nome;
    protected int dano;
    protected int vida;
    protected int ptsCritico;
    protected final int danoCritico = dano + 30;
    protected final int ptsManaPorRodada = 20;

    public MaeDesafio(int dano, int vida, String nome){
        this.dano = dano;
        this.vida = vida;
        this.nome = nome;
        this.ptsCritico = 0;
    }

    //Metodos da classe mae
    public void recebeDano(int dano) {
        this.vida -= dano;
    }

    //Sobrecarga
    public void recebeDano(int dano, double multiplicador){
        this.vida -= dano * multiplicador;
    }

    public void resetPtsCritico(){
        this.ptsCritico = 0;
    }

    public void aumentaBarraCritico(){
        if(this.ptsCritico + 25 >= 100){
            this.ptsCritico = 100;
        }
        else{
            this.ptsCritico += 25;
        }
    }

    //Getters
    public int getDano() {
        return dano;
    }

    public int getPtsCritico() {
        return ptsCritico;
    }

    public int getDanoCritico() {
        return danoCritico;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }

    public int getPtsManaPorRodada() {
        return ptsManaPorRodada;
    }

    //A ser definido
    public abstract void descreveAmbiente();

    public abstract void descreveDesafio();
}
