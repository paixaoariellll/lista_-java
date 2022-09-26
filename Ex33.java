import java.util.Scanner;

/* 
Escreva um programa para aprovar ou não o empréstimo bancário para a compra 
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e 
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que 
ela não pode exceder 30% do salário ou então o empréstimo será negado.
 */
public class Ex33 {
    public static void main(String[] args) {
        float[] entradas = metodoDeEntradas();
        float preco = entradas[0];
        float salario = entradas[1];
        float parcelasEmMeses = preco / (entradas[2] / 12);
        System.out.printf(parcelasEmMeses <= 0.3 * salario ? "Empréstimo Aprovado" : "Emprestimo negado");

    }

    public static float[] metodoDeEntradas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual o valor da casa? ");
        float valorDaCasa = sc.nextFloat();
        System.out.print("Qual o salário do comprador? ");
        float salarioDoComprador = sc.nextFloat();
        System.out.print("Em quantos anos você irá pagar? ");
        float anosDeParcela = sc.nextFloat();
        sc.close();
        float[] variaveisDeEntrada = { valorDaCasa, salarioDoComprador, anosDeParcela };
        return variaveisDeEntrada;
    }
}
