package Desafios;
public final class Matilha extends MaeDesafio{
    
    public Matilha(){
        super(15, 400, "Matilha de lobos");
    }

    @Override
    public void descreveAmbiente(){
        System.out.println("\nVocê está Bosque Tenebroso.");
    }

    @Override
    public void descreveDesafio(){
        System.out.println("Acabe com a matilha de lobos selvagens.");
    }
}
