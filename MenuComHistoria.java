
import java.util.Scanner;


public class MenuComHistoria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int opção;
        System.out.println("Bem vindo ao Menu!! Escolha a opção que você deseja.");
        System.out.println("1 - Jogar");
        System.out.println("2 - Instruções");
        System.out.println("3 - Créditos");
        System.out.println("4 - Sair");
       
        do{
              opção = input.nextInt();
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
        System.out.println("Bem vindo a ...");
        System.out.println("Você acorda em uma cabana de caçador, não muito bonita, mas te protegeria de tempestades. Tirando seu odor forte, sons de ratos\n"
                + "no assoalho e o barulho do vento passando entre as rachaduras das paredes, era bem aconchegante ficar próximo de uma lareira.");
        System.out.println("    -- Ah, maravilha!! Finalmente você acordou hahaha. Te encontrei caído enquanto caçada com meu velho amigo Bruto ali"
                + " *você se vira e vê um cachorro\n de porte pequeno, não lhe parece o melhor cão de caça, mas uma companhia leal*. Diga-me, quem você é?");
        System.out.println("Escolha seu nome: ");
        String name = input.next();
        System.out.println("Escolha sua raça: ");
        String raça = input.next();
        //Aqui vão ter raças pré-definidas\\
        System.out.println("    -- Olá "+name+"! Que bom que se lembra de seu nome então significa que sua cabeça está bem! Mas ainda não me disse exatamente, quem é você?");
        System.out.println("Escolha sua classe: ");
        String classe = input.next();
        //Aqui vão ter classes pré-definidas\\
        
      
    }
}
