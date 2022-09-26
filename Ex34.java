import java.util.Scanner;

/* 
O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no 
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o 
indivíduo dentro de certas faixas.
- abaixo de 18.5: Abaixo do peso
- entre 18.5 e 25: Peso ideal
- entre 25 e 30: Sobrepeso
- entre 30 e 40: Obesidade
- acima de 40: Obseidade mórbida
 */
public class Ex34 {
    public static void main(String[] args) {
        float[] entradas = metodoDeEntradas();
        float altura = entradas[0];
        float peso = entradas[1];
        float imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso ideal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc < 40) {
            System.out.println("Obesidade");
        } else {
            System.out.println("Obesidade mórbida");
        }
    }

    public static float[] metodoDeEntradas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Qual a sua altura? ");
        float altura = sc.nextFloat();
        System.out.print("Qual a sua massa(em Kg) na terra? ");
        float peso = sc.nextFloat();
        sc.close();
        float[] variaveisDeEntrada = { altura, peso };
        return variaveisDeEntrada;
    }
}
