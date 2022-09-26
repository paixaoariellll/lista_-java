import java.util.Scanner;

/* Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua 
 * média e mostre na tela. No final, analise a média e mostre se o aluno teve ou 
 * não um bom aproveitamento (se ficou acima da média 7.0).
 */

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Por favor, digite a primeira nota: ");
        float nota1 = sc.nextFloat();
        System.out.print("Por favor, digite a segunda nota: ");
        float nota2 = sc.nextFloat();
        sc.close();
        if ((nota1 + nota2) / 2 >= 7) {
            System.out.printf("O aluno teve um bom aproveitamento com a nota %.2f Parabéns %s!", (nota1 + nota2) / 2,
                    nome);
        } else {
            System.out.printf("O aluno não teve um bom aproveitamento com a nota %.2f Sentimos muito %s",
                    (nota1 + nota2) / 2, nome);
        }

    }
}
