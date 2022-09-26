import java.util.Scanner;

/* Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o 
 * seu novo salário, com 15% de aumento.
 */

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor digite o valor do seu salário(em reais): ");
        float preco = sc.nextFloat();
        sc.close();
        System.out.printf("Seu salário sairá de %.2fR$. \nCom o acréscimo ficará %.2fR$ aproveite!", preco,
                preco * 1.15);
    }
}
