import java.util.Scanner;

/* 
Crie um programa que leia duas notas de um aluno e calcule a sua média, 
mostrando uma mensagem no final, de acordo com a média atingida:
 - Média até 4.9: REPROVADO
 - Média entre 5.0 e 6.9: RECUPERAÇÃO
 - Média 7.0 ou superior: APROVADO
 */
public class Ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o valor da sua nota(Ex.: 9.8): ");
        float nota = sc.nextFloat();
        sc.close();
        if (nota < 5) {
            System.out.printf("Com a nota %.1f, você está REPROVADO!", nota);
        } else if (nota < 7) {
            System.out.printf("Com a nota %.1f, você está de Recuperação!", nota);
        } else {
            System.out.printf("Com a nota %.1f, você está Aprovado!!", nota);
        }
    }
}
