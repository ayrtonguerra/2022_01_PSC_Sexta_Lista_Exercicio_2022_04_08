import java.util.Scanner;
public class Exercicio320220408{
    public static void main(String[] args){
        int qtdPessoas, qtdCasadas, qtdViuvas, qtdSolteiras, qtdDesquitadas;
        int idade, somaIdadeViuvas;
        double mediaIdadeViuvas;
        double percDesqViuvas;
        String estadoCivil;
        Scanner sc = new Scanner(System.in);
        qtdPessoas = 0;
        qtdCasadas = 0;
        qtdViuvas = 0;
        qtdSolteiras = 0;
        qtdDesquitadas = 0;
        somaIdadeViuvas = 0;
        System.out.println("\nEstado civil:");
        System.out.println("C - Casado");
        System.out.println("S - Solteiro");
        System.out.println("V - Viúvo");
        System.out.println("D - Desquitado");
        System.out.println("Digite idade 0 para sair...");
        do{
            System.out.print("Digite a idade da pessoa: ");
            idade = sc.nextInt();
            if(idade != 0){
                System.out.print("Digite o estado civil da pessoa: ");
                estadoCivil = sc.next();
                switch(estadoCivil){
                    case "C":
                        qtdCasadas++;
                        break;
                    case "S":
                        qtdSolteiras++;
                        break;
                    case "V":
                        qtdViuvas++;
                        somaIdadeViuvas += idade;
                        break;
                    case "D":
                        qtdDesquitadas++;
                        break;
                    default:
                        System.out.println("Estado civil inválido...");
                        break;
                }
                qtdPessoas++;
                System.out.println("");
            }
        } while(idade != 0);

        //Cálculos
        mediaIdadeViuvas = (double) somaIdadeViuvas / qtdViuvas;
        percDesqViuvas = (double) (qtdDesquitadas + qtdViuvas) * 100 / qtdPessoas;

        //Saída
        System.out.println("\nEstatísticas:");
        System.out.format("Quantidade de pessoas casadas: %d%n", qtdCasadas);
        System.out.format("Quantidade de pessoas solteiras: %d%n", qtdSolteiras);
        System.out.format("Média das idades das pessoas viúvas: %f%n", mediaIdadeViuvas);
        System.out.format("Percentual pessoas desquitadas e viúvas: %f%%%n", percDesqViuvas);
        sc.close();
    }
}