import java.util.Scanner;

/* 
[DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta. 
Analise seus comprimentos e diga se é possível formar um triângulo com essas 
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento 
de cada lado deve ser menor que a soma dos outros dois.
 */
/* |y-z|<maiorlado>|y+z| */
public class Ex24 {
    public static void main(String[] args) {
        float[] numeros = entradaTriangulo();
        if (comparaNumeros(numeros[0], numeros[1], numeros[2])) {
            System.out.println("Parabéns, você formou um triângulo!");
        } else {
            System.out.println("Que pena, não dá pra formar um triângulo com seus valores!");
        }
    }

    public static float[] entradaTriangulo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o valor(float) do primeiro segmento de reta: ");
        float numero1 = sc.nextFloat();
        System.out.print("Por favor, digite o valor(float) do segundo segmento de reta: ");
        float numero2 = sc.nextFloat();
        System.out.print("Por favor, digite o valor(float) do terceiro segmento de reta: ");
        float numero3 = sc.nextFloat();
        sc.close();
        return new float[] { numero1, numero2, numero3 };
    }

    public static boolean comparaNumeros(float num, float num2, float num3) {
        return (num > Math.abs(num2 - num3) && num < (num2 + num3));
    }
}
