import java.util.Scanner;

/* 
Faça um programa que leia a largura e o comprimento de um terreno 
retangular, calculando e mostrando a sua área em m². O programa também 
devemostrar a classificação desse terreno, de acordo com a lista abaixo:
- Abaixo de 100m² = TERRENO POPULAR
- Entre 100m² e 500m² = TERRENO MASTER
- Acima de 500m² = TERRENO VIP
 */
public class Ex28 {
    public static void main(String[] args) {
        Scanner entraNumero = new Scanner(System.in);
        System.out.print("Por favor, digite a largura do terreno em metros: ");
        int largura = entraNumero.nextInt();
        System.out.print("Por favor, digite o comprimento do terreno em metros: ");
        int comprimento = entraNumero.nextInt();
        entraNumero.close();
        System.out.printf("A área do terreno é %d metros quadrados. \n", largura * comprimento);
        if ((largura * comprimento) < 100) {
            System.out.println("Terreno Popular");
        } else if ((largura * comprimento) < 500) {
            System.out.println("Terreno Master");
        } else {
            System.out.println("Terreno VIP");
        }
    }
}
