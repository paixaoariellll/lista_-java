import java.time.LocalDate;
import java.util.Scanner;

/* Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade 
 * dela e depois mostre se ela pode ou não votar.
 */
public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Em que ano você nasceu?(Ex.: 1994) ");
        int nascimento = sc.nextInt();
        sc.close();
        LocalDate hoje = LocalDate.now();
        if ((hoje.getYear() - nascimento) >= 16) {
            System.out.printf("Por possuir %d anos de idade, você já pode votar!", (hoje.getYear() - nascimento));
        } else {
            System.out.printf("Por possuir %d anos de idade, você ainda não pode votar!",
                    (hoje.getYear() - nascimento));
        }
    }
}
