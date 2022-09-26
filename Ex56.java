import java.util.Scanner;

/* 
Crie um programa que leia vários números pelo teclado e mostre no final o 
somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado
 */
public class Ex56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int somatorio = -1111;
        do {
            numero = sc.nextInt();
            somatorio += numero;
        } while (numero != 1111);
        sc.close();
        System.out.println(somatorio);
    }
}
