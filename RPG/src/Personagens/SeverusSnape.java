package Personagens;
public final class SeverusSnape extends MaePersonagem{
    public SeverusSnape(){
        super("Severus Snape", 120, "Kamehameha", 85);
    }
    
    @Override
    public void contarHistoria() {
        System.out.println("\n" + nomePersonagens + "\n\nUm cometa de origem alienígena caiu perto da casa onde ele morava quando \npequeno e todos os moradores próximos adquiriram capacidade de controlar uma energia \nmística chamada mana. A pequena vila foi mais tarde denominada Eichenwald, a vila dos magos.");
    }

    @Override
    public void resetDano(){
        this.dano = 85;
    }

    @Override
    public void mostrarArma() {
        System.out.println("\nSeverus possui um Bastão Mágico do dragao guerreiro.");
    }
}
