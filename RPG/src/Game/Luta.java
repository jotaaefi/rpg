package Game;
import java.util.Random;
import Desafios.MaeDesafio;
import Personagens.MaePersonagem;
import Utilidades.LeOpcao;
import java.lang.Thread;

public class Luta {

    public void mostrarStatusP(MaePersonagem p)
    {
        System.out.format("\n%s: dmg em %d e vida restante: %d. \nEspecial em %d por cento.", p.getNomePersonagens(), p.getDano(), p.getVida(), p.getBarraDeMana());
    }

    public void mostrarStatusD(MaeDesafio d)
    {
        System.out.format("\n\n%s: vida restante: %d. \nAtaque Critico: %d por cento.", d.getNome(), d.getVida(), d.getPtsCritico());
    }

    public void descDesafio(MaeDesafio d){
        d.descreveAmbiente();
        d.descreveDesafio();
    }

    public int calcularDado()
    {
        Random gerador = new Random();
        //1..20
        //nextInt(): 0...19
        int numSorteado = 1 + gerador.nextInt(19);

        return numSorteado;
    }  

    public int LutaInsana(MaePersonagem p, MaeDesafio d)
    {   
        int numSorteado;
        descDesafio(d);

        while(p.getVida() > 0 && d.getVida() > 0){
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            mostrarStatusP(p);
            mostrarStatusD(d);

            System.out.format("\n\nPreparação para o proximo round: \n1-Se curar.\n2-Buffar dano.\n3-Continuar assim.\n");

            int opcao = LeOpcao.leOpcao();
            switch(opcao){
                case 1:
                    p.tomarPocaoVida();
                    break;
                case 2:
                    p.tomarPocaoDano();
                    break;
                case 3:
                    break;
            }

            numSorteado = calcularDado();
            
            if(d.getPtsCritico() == 100){
                System.out.printf("\n%s usou seu ataque critico contra %s e causou %d de dano!!\n", d.getNome(), p.getNomePersonagens(), d.getDanoCritico());
                p.recebeDano(d.getDanoCritico());
                d.resetPtsCritico();
            }
            
            if(p.getBarraDeMana() == 100){
                System.out.printf("\n%s usou '%s' contra %s e causou %d de dano!!\n", p.getNomePersonagens(), p.getPoderEspecial(), d.getNome(), p.getDanoAtkEspecial());
                d.recebeDano(p.getDanoAtkEspecial());
                p.resetPtsEspecial();
            }

            if(numSorteado < 8) {
                System.out.println("\nValor sorteado: " + numSorteado);
                System.out.printf("%s tentou um golpe em %s e errou! Levou %d de dano.\n", p.getNomePersonagens(), d.getNome(), d.getDano());
                p.recebeDano(d.getDano());
                d.aumentaBarraCritico();
            }
            else if(numSorteado < 16){
                System.out.println("\nValor sorteado: " + numSorteado);
                System.out.printf("%s deu um ataque basico em %s e acertou!\n", p.getNomePersonagens(), d.getNome());
                d.recebeDano(p.getDano());
                p.aumentaBarraMana(d.getPtsManaPorRodada());
            }
            else{
                System.out.println("\nValor sorteado: " + numSorteado);
                System.out.printf("%s acertou um ataque critico em %s e causou dano %.2f!\n", p.getNomePersonagens(), d.getNome(), p.getDano() * 1.2);
                d.recebeDano(p.getDano(), 1.2);
                p.aumentaBarraMana(d.getPtsManaPorRodada());
            } 
        }

        if(p.getVida() > 0){
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("\nSeu heroi ganhou esse desafio.");
            p.resetDano();
            return 1;
        }
        return -1;
    }
}
