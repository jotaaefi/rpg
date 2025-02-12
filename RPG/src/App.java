import Game.Game;
import Personagens.Alienware;
import Personagens.SeverusSnape;
import Utilidades.LeOpcao;
import Utilidades.Menu;

public class App {
    public static void main(String[] args) throws Exception {
        int opcao;

        Alienware a = new Alienware();
        a.local();
        a.objetivo();
        a.contexto(); 

        a.contarHistoria();
        a.mostrarArma();
        a.poderEspecial();
            
        SeverusSnape s = new SeverusSnape();

        s.contarHistoria();
        s.mostrarArma();
        s.poderEspecial();

        Menu.menu();
        
        opcao = LeOpcao.leOpcao();

        if(opcao == 1){
            System.out.println("\nBem Vindo, Alienware!");
            Game.game(a);
        }
        else if(opcao == 2){
            System.out.println("\nBem Vindo, Snape!");
            Game.game(s);
        }
        else{
            System.out.println("\nTchau!!");
            return;
        }
    }   
}
