import java.util.Scanner;

/* 
Crie um programa que calcule e mostre na tela o resultado da soma entre 6 + 
8 + 10 + 12 + 14 + ... + 98 + 100 = 5035.
 */
/* 1 + 2 + 3 + 4 + 5 = 15 */
public class Ex46 {
    public static void main(String[] args) {
        int soma = (int) metodoSoma();
        System.out.print(soma);
    }

    public static float metodoSoma() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o valor do início: ");
        int inicio = sc.nextInt();
        System.out.print("Por favor, digite o valor do início: ");
        int fim = sc.nextInt();
        sc.close();
        int quantidade = (fim - inicio) + 1;
        float soma = (inicio + fim) * quantidade / 2;
        return soma;
    }
}
