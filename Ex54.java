import java.util.Arrays;
import java.util.Scanner;

/* 
Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando 
no final:
a) Qual foi a média de altura do grupo.
b) Quantas pessoas pesam mais de 90Kg.
c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m.
d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg.
 */
public class Ex54 {
    public static void main(String[] args) {
        float[] pesos = metodoPeso();
        float[] alturas = metodoAltura();
        float media = metodoMedia(alturas);
        float pedindoNaC = metodoMenosDe50Emenosde160(alturas, pesos);
        float pedindoNaD = metodoMaisDe190EMaisDe100(alturas, pesos);
        System.out.flush();
        System.out.printf("Pesos: %.1f", Arrays.toString(pesos));
        System.out.printf("\nAlturas: %.1f", Arrays.toString(alturas));
        System.out.println("Média dos pesos: " + media);
        System.out.println("pessoas que pesam menos de 50Kg tem menos de 1.60: " + pedindoNaC);
        System.out.println("pessoas que pesam menos de 50Kg tem menos de 1.60: " + pedindoNaD);
    }

    public static int metodoMaisDe190EMaisDe100(float[] alturas, float[] pesos) {
        int maisEhMaisTambem = 0;
        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] < 50 && alturas[i] < 1.60) {
                maisEhMaisTambem++;
            }
        }
        return maisEhMaisTambem;
    }

    public static int metodoMenosDe50Emenosde160(float[] alturas, float[] pesos) {
        int menosEhMais = 0;
        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] < 50 && alturas[i] < 1.60) {
                menosEhMais++;
            }
        }
        return menosEhMais;
    }

    public static int metodoMaiorDeNoventa(float[] pesos) {
        int maiorDeNoventa = 0;
        for (int i = 0; i < pesos.length; i++) {
            if (pesos[i] > 90) {
                maiorDeNoventa++;
            }
        }
        return maiorDeNoventa;
    }

    public static float metodoMedia(float[] alturas) {
        float mediaDasAlturas = 0;
        for (int i = 0; i < alturas.length; i++) {
            mediaDasAlturas = (mediaDasAlturas + alturas[i]);
        }
        return mediaDasAlturas / alturas.length;
    }

    public static float[] metodoPeso() {
        Scanner sc = new Scanner(System.in);
        float[] pesos = new float[7];
        for (int i = 0; i < pesos.length; i++) {
            System.out.printf("Por favor, digite o peso da %dª pessoa: ", i + 1);
            pesos[i] = sc.nextFloat();
        }
        sc.close();
        return pesos;
    }

    public static float[] metodoAltura() {
        Scanner sc = new Scanner(System.in);
        float[] alturas = new float[7];
        for (int j = 0; j < alturas.length; j++) {
            System.out.printf("Por favor, digite a altura da %dª pessoa: ", j + 1);
            alturas[j] = sc.nextFloat();
        }
        sc.close();
        return alturas;
    }
}
