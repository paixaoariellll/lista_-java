import java.util.Scanner;

/* Faça um programa que leia as duas notas de um
 * aluno em uma matéria e mostre na tela a sua média
 * na disciplina. 
*/
public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: ");
        float nota1 = sc.nextFloat();
        System.out.print("Nota 2: ");
        float nota2 = sc.nextFloat();
        sc.close();
        System.out.printf("A média entre %.1f e %.1f é igual a %.1f", nota1, nota2, (nota1 + nota2) / 2);
    }
}
