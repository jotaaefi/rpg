package Utilidades;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LeOpcao {
    static int opcao;
    static Scanner sc = new Scanner(System.in);

    public static int leOpcao(){
        opcao = 0;
        do{
            try{
                
                System.out.format("Opcao: ");
                opcao = sc.nextInt();

                if(opcao != 1 && opcao != 2 && opcao != 3)
                {
                    System.out.println("\nOpcao invalida!");
                }
            }catch(InputMismatchException e){
                sc.nextLine();
                System.out.println("\nDigite um valor inteiro!\n");
            }
        }while(opcao != 1 && opcao != 2 && opcao != 3 );

        return opcao;    
    }
}
