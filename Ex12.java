import java.util.Scanner;

/* Crie um programa que leia o preço de um produto, calcule e mostre o seu 
 * PREÇO PROMOCIONAL, com 5% de desconto.
 */

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor digite o preço do produto(em reais): ");
        float preco = sc.nextFloat();
        sc.close();
        System.out.printf("O produto %.2f ficará por %.2fR$!!! Aproveite", preco, preco * 0.95);
    }
}
