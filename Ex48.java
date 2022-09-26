import java.util.Scanner;

/* 
Faça um programa que leia 7 números inteiros e no final mostre o somatório 
entre eles.
 */

public class Ex48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros = 0;
        for (int i = 1; i <= 7; i++) {
            System.out.printf("Por favor, digite o %d número: ", i);
            int numero = sc.nextInt();
            numeros += numero;
        }
        sc.close();
        System.out.printf("A soma dos números digitados é: %d", numeros);
    }
}
