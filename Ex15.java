import java.util.Scanner;

/* Crie um programa que leia o número de dias trabalhados em um mês e mostre o 
 * salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 
 * por hora trabalhada.
 */

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o valor inteiro dos dias trabalhados em um mês: ");
        int diasTrabalhados = sc.nextInt();
        sc.close();
        System.out.printf(
                "Sabendo que o funcionário trabalha 8 horas por dia e ganha R$25 por hora trabalhada.\nVocê receberá neste mês, o valor de: %.2f",
                (float) 200 * diasTrabalhados);
    }
}
/*
 * 8 horas por dia
 * 25 * 8 = 200 R$
 * 10 dias * 200 = 2.000 reais nesse mês!
 */
