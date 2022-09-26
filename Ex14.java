import java.util.Scanner;

/*  A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva 
 * um programa que pergunte a quantidade de Km percorridos por um carro alugado e a 
 * quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, 
 * sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
 */
public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Locadora de Carros ----");
        System.out.print("Quantos quilômetros você percorreu? ");
        float qtdQuilometros = sc.nextFloat();
        System.out.print("Por quantos dias o carro foi alugado? ");
        int dias = sc.nextInt();
        sc.close();
        System.out.printf(
                "Preço da diária: R$ 90 reais\nPreço do Km rodado: R$ 0,20 reais\nO valor do aluguel foi de: R$ %.2f",
                90 * dias + 0.2 * qtdQuilometros);
    }
}
/*
 * 90 * 10 = 900
 * 0.2* 10 = 2
 * total = 902
 */