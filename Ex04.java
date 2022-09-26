import java.util.Scanner;

/* Desenvolva um algoritmo que leia dois números inteiros
 * e mostre o somatório entre eles.
 */

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um valor: ");
        int valor = sc.nextInt();

        System.out.print("Digite outro valor: ");
        int valor2 = sc.nextInt();
        sc.close();

        int soma = valor + valor2;
        System.out.printf("A soma entre %d e %d é igual a %d.", valor, valor2, soma);
        System.out.println();
        System.out.printf("A soma entre %d e %d é igual a %d.", valor, valor2, valor + valor2);
    }
}
