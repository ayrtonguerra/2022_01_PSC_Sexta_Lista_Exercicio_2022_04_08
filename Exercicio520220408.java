import java.util.Scanner;
public class Exercicio520220408 {
    public static void main(String[] args){
        int qtdSoma = 0, qtdMult = 0;
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
                    //Criar variavel que vai armazenar o valor da soma
                    int soma = 0;
                    //Incrementar contador de quantas vezes a operação de somar vários números foram solicitadas pelo usuário
                    qtdSoma++;
                    //Solicitar a quantidade de números que o usuário quer somar
                    System.out.print("Quantos números você quer somar? R: ");
                    qtd = sc.nextInt();
                    //Solicitando cada número e somando os valores
                    for(int i = 1; i <= qtd; i++){
                        System.out.format("Digite o %do número: ", i);
                        soma += sc.nextInt();
                    }
                    //Mostrando o resultado para o usuário
                    System.out.format("%nSoma: %d%n", soma);
                    break;
                case 2:
                    //Multiplicar vários números
                    //Criar a variável que vai armazenar o valor da multiplicação
                    int mult = 1;
                    //Incrementar o contador de quantas vezes a operação de multiplicar vários número foram solicitadas
                    qtdMult++;
                    //Solicitar a quantidade de números que o usuário quer multiplicar
                    System.out.print("Quantos números você quer multiplicar? R: ");
                    qtd = sc.nextInt();
                    //Solicitando cada número e multiplicando os valores
                    for(int i = 1; i <= qtd; i++){
                        System.out.format("Digite o %do número: ", i);
                        mult *= sc.nextInt();
                    }
                    //Mostando o resultado para o usuário
                    System.out.format("%nMultiplicação: %d%n", mult);
                    break;
                case 3:
                    //Sair
                    //Mostrando mensagem com a quantidade de vezes que o usuário solicitou as opções 1 e 2 do programa
                    System.out.println("\nTe vejo na próxima!");
                    System.out.println("Estatísticas do uso:");
                    System.out.format("Operação 'Somar vários números': Utilizada %d vez(es)%n", qtdSoma);
                    System.out.format("Operação 'Multiplicar vários números': Utilizada %d vez(es)%n%n", qtdMult);
                    break;
                default:
                    //Mensagem de opção inválida
                    System.out.println("Opção inválida...");
                    break;
            }
        } while(opcao != 3);
        sc.close();
    }
}