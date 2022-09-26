import java.util.Arrays;
import java.util.Random;

/* 
Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e 
mostre na tela:
a) Quais foram os números sorteados
b) Quantos números estão acima de 5
c) Quantos números são divisíveis por 3
 */
public class Ex50 {
    public static void main(String[] args) {
        int[] numeros = numerosRandomicos();
        int maiorQueCinco = 0;
        int divisivelPorTres = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 5) {
                maiorQueCinco++;
            }
            if (numeros[i] % 3 == 0) {
                divisivelPorTres++;
            }
        }
        System.out.println(
                "Os números sorteados são: " + Arrays.toString(numeros) + "\nOs números maiores que 5 são: "
                        + maiorQueCinco
                        + "\nOs números divisíveis por 3 são: "
                        + divisivelPorTres);
    }

    public static int[] numerosRandomicos() {
        Random random = new Random();
        int[] vetorDosRandomicos = new int[20];
        for (int j = 0; j < vetorDosRandomicos.length; j++) {
            int numeroAleatorio = random.nextInt(11);
            vetorDosRandomicos[j] = numeroAleatorio;
        }
        return vetorDosRandomicos;
    }
}
