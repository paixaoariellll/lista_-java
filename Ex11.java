import java.util.Scanner;

/* Desenvolva uma lógica que leia os valores de A, B e C de uma equação do 
 * segundo grau e mostre o valor de Delta.
 */
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exemplo: (a).x^2 - (b).x + c ");
        System.out.println("Os valores adiabáticos de a, b e c");
        System.out.print("Por favor, digite o valor de a: ");
        float a = sc.nextFloat();
        System.out.print("Por favor, digite o valor de b: ");
        float b = sc.nextFloat();
        System.out.print("Por favor, digite o valor de c: ");
        float c = sc.nextFloat();
        sc.close();
        System.out.printf("Sabendo que Delta = b^2 - 4.a.c\nPortanto, o valor de delta é: %.1f", (b * b) - (4 * a * c));
    }
}
