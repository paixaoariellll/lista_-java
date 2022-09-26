import java.util.Scanner;

/* Faça um programa que leia um número inteiro e mostre
 * o seu antecessor e seu sucessor. 
*/

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();
        sc.close();
        System.out.printf("O antecessor de %d é %d \nO sucessor de %d é %d", numero, numero - 1, numero, numero + 1);
    }
}
