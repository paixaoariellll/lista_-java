import java.util.Scanner;

/* Faça um programa que leia o nome de uma pessoa e 
 * mostre uma mensagem de boas-vindas para ela:
 */

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");
        String nome = sc.nextLine();
        sc.close();

        System.out.println("Olá " + nome + ", é um prazer te conhecer!");
        System.out.printf("Olá %s, é um prazer te conhecer!", nome.toUpperCase());
    }
}
