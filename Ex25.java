import java.util.Scanner;

/* 
 Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando 
na tela uma das mensagens abaixo:
 - O primeiro valor é o maior
 - O segundo valor é o maior
 - Não existe valor maior, os dois são iguais
 */
public class Ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o primeiro valor: ");
        int numero1 = sc.nextInt();
        System.out.print("Por favor, digite o segundo valor: ");
        int numero2 = sc.nextInt();
        sc.close();
        if (numero1 > numero2) {
            System.out.println("O primeiro valor é o maior");
        } else if (numero1 < numero2) {
            System.out.println("O segundo valor é o maior");
        } else {
            System.out.println("Os valores são iguais!");
        }
    }
}
