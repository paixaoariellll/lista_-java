import java.util.Arrays;
import java.util.Scanner;

/* 
Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos
 */
public class Ex53 {
    public static void main(String[] args) {
        int[] pessoas = idadeSexo();
        int cadastroDeHomens = 0, mulheres = 0, mulheresMaisDeVinte = 0, totalDePessoas = 0;
        float mediaTotal = 0, mediaHomens = 0;
        for (int i = 0; i < pessoas.length; i++) {
            totalDePessoas++;
            mediaTotal = totalDePessoas / 5;
            if (pessoas[i] == 1) {
                cadastroDeHomens++;
                mediaHomens = pessoas[i];
            }
            if (pessoas[i] == 2) {
                mulheres++;
                if (pessoas[i] > 20) {
                    mulheresMaisDeVinte++;
                }
            }
        }
        System.out.println("Vetor: " + Arrays.toString(pessoas));
        System.out.println("Homens: " + cadastroDeHomens + mediaHomens);
        System.out.println("Mulheres: " + mulheres);
        /* Falta terminar de fazer as médias */
        System.out.println("Média de idade do grupo: " + mediaTotal);
        System.out.println("Mulheres tem mais de 20 anos: " + mulheresMaisDeVinte);
    }

    public static int[] idadeSexo() {
        Scanner sc = new Scanner(System.in);
        int[] idades = new int[5];
        for (int i = 0; i < idades.length; i++) {
            System.out.printf("Digite a idade da %d pessoa: ", i + 1);
            idades[i] = sc.nextInt();
        }
        int[] sexos = new int[5];
        for (int j = 0; j < sexos.length; j++) {
            System.out.printf("Digite 1 para Masculino ou 2 para Feminino.\nDigite o sexo da %d pessoa: ", j + 1);
            sexos[j] = sc.nextInt();
        }
        sc.close();
        int tamanhoTotal = idades.length + sexos.length;
        int[] concatenaVetores = new int[tamanhoTotal];
        int position = 0;
        for (int object : idades) {
            concatenaVetores[position] = object;
            position++;
        }
        for (int object : sexos) {
            concatenaVetores[position] = object;
            position++;
        }
        return concatenaVetores;
    }
}
