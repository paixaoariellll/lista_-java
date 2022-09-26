import java.util.Scanner;

/* 
Crie um programa que leia 6 números inteiros e no final mostre quantos deles 
são pares e quantos são ímpares.
 */
public class Ex49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0, impares = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.printf("Por favor, digite o %d número: ", i);
            int numero = sc.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        sc.close();
        System.out.printf("Pares: %d\nImpares: %d", pares, impares);
    }
}
