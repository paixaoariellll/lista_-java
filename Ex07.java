import java.util.Scanner;

/* Crie um algoritmo que leia um número
 * real e mostre na tela o seu dobro e a 
 * sua terça parte. 
*/

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        float numero = sc.nextFloat();
        sc.close();
        System.out.printf("O dobro de %.1f é %.1f \nA terça parte de %.1f é %.6f", numero, numero * 2, numero,
                numero / 3);
    }
}
