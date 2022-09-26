import java.util.Arrays;
import java.util.Scanner;

/* 
Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
a) Qual é a média de idade do grupo
b) Quantas pessoas tem mais de 18 anos
c) Quantas pessoas tem menos de 5 anos
d) Qual foi a maior idade lida
 */
public class Ex52 {
    public static void main(String[] args) {
        int[] idades = leiaIdade();
        float media = 0;
        int maior = 0;
        int menorDeCinco = 0;
        int maiorDeDezoito = 0;
        int total = 0;
        for (int i = 0; i < idades.length; i++) {
            total += idades[i];
            media = total / 10;
            if (idades[i] > 18) {
                maiorDeDezoito++;
            }
            if (idades[i] > maior) {
                maior = idades[i];
            }
            if (idades[i] < 5) {
                menorDeCinco++;
            }
        }
        System.out.println(Arrays.toString(idades));
        System.out.printf("A média de idade do grupo é de: %.2f\n", media);
        System.out.printf("Quantas pessoas têm mais de 18 anos: %d\n", maiorDeDezoito);
        System.out.printf("Quantas pessoas têm menos de 5 anos: %d\n", menorDeCinco);
        System.out.printf("A maior idade digitada foi: %d", maior);
    }

    public static int[] leiaIdade() {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[10];
        for (int i = 0; i < idades.length; i++) {
            System.out.printf("por favor, digite o %d numero: ", i + 1);
            idades[i] = sc.nextInt();
        }
        Arrays.sort(idades);
        sc.close();
        return idades;
    }
}
