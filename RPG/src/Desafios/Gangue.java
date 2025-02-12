package Desafios;
public final class Gangue extends MaeDesafio{
    
    public Gangue(){
        super(30, 650, "capangas");
    }
    
    @Override
    public void descreveAmbiente(){
        System.out.println("\nIndo em direcao ao Fortaleza Kayo você se depara com uma gangue de capangas mutantes.");
    }

    @Override
    public void descreveDesafio(){
        System.out.println("Nocauteie e prenda todos os capangas.");
    }
}
