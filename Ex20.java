import java.util.Scanner;

/* Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou ÍMPAR */
public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite um número do tipo inteiro: ");
        int numero = sc.nextInt();
        sc.close();
        System.out.printf(numero % 2 == 0 ? "O número é PAR" : "O número é IMPAR");
    }
}
