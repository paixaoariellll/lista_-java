import java.util.Scanner;

/* Faça um algoritmo que leia um determinado ano e mostre se ele é ou não 
 * BISSEXTO.
 */
public class Ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite um ano(Ex.: 1995): ");
        int ano = sc.nextInt();
        sc.close();
        System.out.printf(ano % 4 == 0 ? "O ano é bissexto" : "O ano não é bissexto");
    }
}
