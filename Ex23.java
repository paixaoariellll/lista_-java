import java.util.Scanner;

/* 
Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos 
para todos, mas especialmente para mulheres. Faça um programa que leia nome, 
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo 
que:
 - Homens ganham 5% de desconto
 - Mulheres ganham 13% de desconto
 */
public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Por favor, digite (h) para homem e (m) para mulher: ");
        char sexo = sc.nextLine().charAt(0);
        System.out.print("Por favor, digite o valor total da sua compra: ");
        double valor = sc.nextDouble();
        valor = (sexo == 'h') ? valor * 0.95 : valor * 0.87;
        sc.close();
        System.out.printf((sexo == 'm') ? "Olá, %s!(%c) \nO valor da sua compra é de: R$ %.2f"
                : "Olá, %s!(%c)\nO valor da sua compra é de: R$ %.2f", nome, sexo, valor);
    }
}
