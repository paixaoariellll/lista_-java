import java.util.Scanner;

/* 
Faça um algoritmo que pergunte ao usuário um número inteiro e positivo 
qualquer e mostre uma contagem até esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!
 */

public class Ex42 {
    public static void main(String[] args) {
        int numeroEscolido = escolhaNumero();
        System.out.printf("Contagem: ");
        for (int i = 0; i <= numeroEscolido; i++) {
            System.out.printf("%d ", i);
        }
        System.out.printf("Acabou!");
    }

    public static int escolhaNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite um número inteiro: ");
        int numero = sc.nextInt();
        sc.close();
        return numero;
    }
}
