import java.util.Arrays;
import java.util.Random;

/* 
Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela 
qual foi o maior e qual foi o menor preço digitados.
 */
public class Ex51 {
    public static void main(String[] args) {
        int[] numeros = numerosRandomicos();
        int maior = 0;
        int menor = 99999;
        int posicaoDoMaior = 0;
        int posicaoDoMenor = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicaoDoMaior = i + 1;
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
                posicaoDoMenor = i + 1;
            }
        }
        System.out.println("Os números sorteados são: " + Arrays.toString(numeros));
        System.out.printf("O maior número é: %d na posição %d\nO menor número é: %d na posição %d", maior,
                posicaoDoMaior, menor, posicaoDoMenor);
    }

    public static int[] numerosRandomicos() {
        Random random = new Random();
        int[] vetorDosRandomicos = new int[8];
        for (int j = 0; j < vetorDosRandomicos.length; j++) {
            float numeroAleatorio = random.nextFloat(0, 100);
            vetorDosRandomicos[j] = (int) numeroAleatorio;
        }
        return vetorDosRandomicos;
    }
}
