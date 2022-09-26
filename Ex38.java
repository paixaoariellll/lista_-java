/* 
Escreva um programa que mostre na tela a seguinte contagem: 
6 7 8 9 10 11 Acabou!
 */
public class Ex38 {
    public static void main(String[] args) {
        for (int i = 6; i < 12; i++) {
            System.out.printf("%d ", i);
        }
        System.out.printf("Acabou!");
    }
}
