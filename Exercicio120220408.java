import java.util.Scanner;
public class Exercicio120220408 {
    public static void main(String[] args){
        int idade;
        double altura, peso;
        int qtdPessoas, qtdPessoasMaior50, qtdPessoasAltura10E20, qtdPessoasPesoMenor40;
        double somaAltura10E20;
        double mediaAltura10E20, percPesoMenor40;
        Scanner sc = new Scanner(System.in);

        qtdPessoas = 0;
        qtdPessoasMaior50 = 0;
        qtdPessoasAltura10E20 = 0;
        qtdPessoasPesoMenor40 = 0;
        somaAltura10E20 = 0;
        mediaAltura10E20 = 0;
        System.out.println("\nDigite idade 0 para sair...");
        do{
            System.out.print("Digite a idade da pessoa: ");
            idade = sc.nextInt();
            if(idade != 0){
                System.out.print("Digite a altura da pessoa (metros): ");
                altura = sc.nextDouble();
                System.out.print("Digite o peso da pessoa (Kg): ");
                peso = sc.nextDouble();
                qtdPessoas++;
                if(idade > 50){
                    qtdPessoasMaior50++;
                } else if(idade >= 10 && idade <= 20){
                    somaAltura10E20 += altura;
                    qtdPessoasAltura10E20++;
                }
                if(peso < 40){
                    qtdPessoasPesoMenor40++;
                }
            }
            System.out.println("");
        } while(idade != 0);

        //Cálculos
        mediaAltura10E20 = (double) somaAltura10E20 / qtdPessoasAltura10E20;
        percPesoMenor40 = (double) qtdPessoasPesoMenor40 * 100 / qtdPessoas;

        //Saída
        System.out.println("\nEstatísticas:");
        System.out.format("Quantidade de pessoas maior que 50 anos: %d%n", qtdPessoasMaior50);
        System.out.format("Média das alturas das pessoas com idade entre 10 e 20 anos, inclusive: %f%n", mediaAltura10E20);
        System.out.format("Percentual de pessoas com peso menor que 40 quilos: %f%%%n", percPesoMenor40);
        System.out.println("");
        sc.close();
    }
}