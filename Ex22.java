import java.time.LocalDate;
import java.util.Scanner;

/* 
Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua 
situação em relação ao alistamento militar.
 - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o 
alistamento.
 - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do 
alistamento.
 */
public class Ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o ano de seu nascimento: ");
        int nascimento = sc.nextInt();
        sc.close();
        LocalDate hoje = LocalDate.now();
        System.out.printf(
                hoje.getYear() - nascimento >= 18 ? "Com %d anos, você já pode votar"
                        : "Com %d anos, você ainda não pode votar",
                hoje.getYear() - nascimento, hoje.getYear() - nascimento);
    }
}
