package Desafios;
public final class LutaFinal extends MaeDesafio{
    public LutaFinal(){
        super(55, 800, "Kayo e o Tigre");
    }
    
    @Override
    public void descreveAmbiente(){
        System.out.println("\nVocê chegou a fortaleza. Agora Kayo e seu Tigre terrível lhe esperam para batalha FINAL.");
    }

    @Override
    public void descreveDesafio(){
        System.out.println("Acabe com Kayo e resgate a princesa.");
    } 
}
