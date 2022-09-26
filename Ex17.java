import java.util.Scanner;

/*  Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 
 * 80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba 
 * o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida
 */

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite a valocidade do carro(em km/h): ");
        float velocidade = sc.nextFloat();
        sc.close();
        if (velocidade > 80) {
            System.out.printf("O motorista foi multado!\nO valor da cobrado será: R$ %.2f em reais",
                    (velocidade - 80) * 5);
        } else {
            System.out.println("Boa viagem!");
        }
    }
}
