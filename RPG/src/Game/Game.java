package Game;
import Desafios.Gangue;
import Desafios.LutaFinal;
import Desafios.Matilha;
import Personagens.MaePersonagem;
import Utilidades.LeOpcao;

public class Game {
    
    
    public static void game(MaePersonagem bonecoFinal){
        int opcaoInGame;
        Luta b = new Luta();
        Gangue g = new Gangue();
        Matilha m = new Matilha();
        LutaFinal kaio = new LutaFinal();

        System.out.println("\nAntes de comecar sua aventura.");
        System.out.println("\nAdicione 5 pocoes ao seu inventario.");
        
        for(int i = 0; i < 5; i++){
            System.out.println("\nPocao de vida(1), pocao de dano(2) ou aumentar dificuldade(3)?");
            opcaoInGame = LeOpcao.leOpcao();

            if(opcaoInGame == 1){
                bonecoFinal.addPocaoVida();
            }
            else if(opcaoInGame == 2){
                bonecoFinal.addPocaoDano();
            }
            else if(opcaoInGame == 3){
                i = 10;
            }
        }

        System.out.println("\nComecando sua aventura. Boa sorte!!!");

        if(b.LutaInsana(bonecoFinal, m) == 1){
            System.out.println("\nParabens!! Avancou para fase 2.\n");
            if(b.LutaInsana(bonecoFinal, g) == 1){
                System.out.println("\nParabens!! Avancou para fase final.\n");
                if(b.LutaInsana(bonecoFinal, kaio) == 1){
                    System.out.println("\nParabens!! Ganhou o jogo... espere o lancamento da continuacao!\n"); 
                    return;    
                }
                else{
                    System.out.println("\nInfelizmente voce morreu. Tente novamente.\n");
                    return;
                }
            }
            else{
                System.out.println("\nInfelizmente voce morreu. Tente novamente.\n");
                return;
            }
        }
        else{
            System.out.println("\nInfelizmente voce morreu. Tente novamente.\n");
            return;
        }
    }
}
