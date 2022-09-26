import java.util.Scanner;

/* Faça um algoritmo que leia a largura e altura de uma parede, calcule e 
 * mostre a área a ser pintada e a quantidade de tinta necessária para o serviço, 
 * sabendo que cada litro de tinta pinta uma área de 2 metros quadrados.
 */
/* 1 litro      2 x 1 metros
 * x    =       metros/litros
 */
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a largura da parede a ser pintada(em metros): ");
        float largura = sc.nextFloat();
        System.out.print("Digite a altura da parede a ser pintada(em metros): ");
        float altura = sc.nextFloat();
        sc.close();
        int tinta = (int) altura * (int) largura / 2;
        System.out.printf(
                "Medindo %.1fx%.1f.\nA área a ser pintada será de: %.2f.\nA quantidade de tinta necessária para tal serviço é de: %d",
                largura, altura, largura * altura, tinta);
    }
}
