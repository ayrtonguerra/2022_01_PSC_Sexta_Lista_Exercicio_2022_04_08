import java.util.Scanner;
public class Exercicio520220408 {
    public static void main(String[] args){
        int qtdSoma, qtdMult;
        int opcao, qtd;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Somar vários números");
            System.out.println("2 - Multiplicar vários números");
            System.out.println("3 - Sair");
            System.out.println("");
            System.out.print("Opção escolhida: ");
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    //Somar vários números
                    System.out.print("Quantos números você quer somar? R: ");
                    qtd = sc.nextInt();
                    for(int i = 1; i <= qtd; i++){
                        
                    }
                    break;
                case 2:
                    //Multiplicar vários números

                    break;
                case 3:
                    //Sair

                    break;
                default:
                    //Mensagem de opção inválida
                    System.out.println("Opção inválida...");
                    break;
            }
        } while(opcao != 0);
        sc.close();
    }
}