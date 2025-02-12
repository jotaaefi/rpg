package Personagens;
public final class Alienware extends MaePersonagem{
    
    public Alienware(){
        super("Alienware", 300, "Multiplicador de Forca", 50);
    }

    public void objetivo()
    {
        System.out.println("Objetivo: Resgatar a Princesa Daisy");
    }

    public void contexto()
    {
        System.out.println("Eles chegaram no Bosque do Kaio apos um longo periodo investigativo"); 
        System.out.println("sobre o sumico da Princesa de Mumbani, Daisy, e concluem que o sequestrador "); 
        System.out.println("era o lendario criminoso Kaio e sua quadrilha de mequetrefes biologicamente \nmodificados com soro.");
    
    }

    public void local()
    {
        System.out.println("Local: Bosque Kaio");
    }
                 
    @Override
    public void contarHistoria() {
        System.out.println("\n" + nomePersonagens + "\n\nUm alienígena criado na terra, precisamente na vila dos magos por Snape, \ndesde criança aprendeu a controlar sua força e as mais avançadas artes marciais.");
    }

    @Override
    public void resetDano(){
        this.dano = 50;
    }

    @Override
    public void mostrarArma() {
        System.out.println("\nAlienware possui sua espada feita a mao por ele.");
    }
}
