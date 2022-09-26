import java.util.Scanner;

/* Crie um programa que leia o nome e o salário de um 
 * funcionário, mostrando no final uma mensagem. 
*/

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do Funcionário: ");
        String nome = sc.nextLine();

        System.out.print("Salário: ");
        float sal = sc.nextFloat();
        sc.close();

        System.out.printf("O funcionário %s tem um salário de R$%.2f em Junho.", nome, sal);
    }
}
