import java.util.Scanner;

/*
 * Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
 * e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
 */

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quanto dinheiro você possui em sua carteira em R$? ");
        float real = sc.nextFloat();
        System.out.print("Por favor, digite a coração do dolar: ");
        float cotacao = sc.nextFloat();
        sc.close();
        float dolar = real / cotacao;
        System.out.printf(" Com R$ %.2f reais você poderá comprar %.2f dólares", real, dolar);
    }
}