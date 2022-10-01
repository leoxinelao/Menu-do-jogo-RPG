
import java.util.Scanner;


public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int opção;
        System.out.println("Bem vindo ao Menu!! Escolha a opção que você deseja.");
        System.out.println("1 - Jogar");
        System.out.println("2 - Instruções");
        System.out.println("3 - Créditos");
        System.out.println("4 - Sair");
       
        do{
              opção = entrada.nextInt();
         switch(opção){
             case 1:
                 System.out.println("Bom jogo!");
             break;
             case 2:
                 System.out.println("Você escolheu instruções.");
                 System.out.println("");
             break;
             case 3:
                 System.out.println("Você escolheu Créditos.");
                 System.out.println("Projeto Integrador");
                 System.out.println("Grupo 4 - Turma A\nLeonardo Henrique Rodrigues Moretti\nGuilherme Candido Caldas\nGabriel Aron Leal de Araújo\n"
                         + "Marcelo Augusto Da Cruz Pereira");
             break;
             case 4:
                 System.out.println("Você saiu do jogo.");
                 System.exit(0);
             break;
             default: System.out.println("Isso não é uma opção.");
         }
        }while(opção != 1);
        System.out.println("Digite seu nome: ");
        String nome = entrada.next();
        
        
        
      
    }
}
