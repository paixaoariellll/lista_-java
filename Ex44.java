import java.util.Scanner;

/* 
Crie um algoritmo que leia o valor inicial da contagem, o valor final e o 
intervalo, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o intervalo: 2
Contagem: 3 5 7 9 Acabou!
 */
public class Ex44 {
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        int[] dadosRecebidos = dadosDaContagem();
        int inicio = dadosRecebidos[0];
        int fim = dadosRecebidos[1];
        int intervalo = dadosRecebidos[2];
        if (inicio < fim) {
            System.out.print("Incremento: ");
            for (int i = inicio; i <= fim; i = i + intervalo) {
                System.out.printf("%d ", i);
            }
            System.out.printf("Acabou!");

        } else {
            System.out.print("Decremento: ");
            for (int j = inicio; j >= fim; j = j - intervalo) {
                System.out.printf("%d ", j);
            }
            System.out.printf("Acabou!");

        }
    }

    public static int[] dadosDaContagem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o valor do inicio: ");
        int inicio = sc.nextInt();
        System.out.print("Por favor, digite o valor do fim: ");
        int fim = sc.nextInt();
        System.out.print("Por favor, digite o valor do intervalo da contagem: ");
        int intervalo = sc.nextInt();
        sc.close();
        int[] dados = { inicio, fim, intervalo };
        return dados;
    }
}
