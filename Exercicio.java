import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        int[] numeros = variaveis();
        int primeiroValor = numeros[0];
        int segundoValor = numeros[1];
        int usaMetodoSoma = somaDosNumeros(primeiroValor, segundoValor);
        System.out.printf("%d + %d = %d", primeiroValor, segundoValor, usaMetodoSoma);

    }

    public static int somaDosNumeros(int primeiroNumero, int segundoNumero) {
        int soma = primeiroNumero + segundoNumero;
        return soma;
    }

    public static int[] variaveis() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Por favor digite o valor do número a: ");
        var primeiroNumero = entrada.nextInt();
        System.out.print("Por favor digite o valor do número b: ");
        var segundoNumero = entrada.nextInt();
        entrada.close();
        int[] valores = { primeiroNumero, segundoNumero };
        return valores;
    }
}