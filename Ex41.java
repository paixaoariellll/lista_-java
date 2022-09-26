/* 
Desenvolva um programa que mostre na tela a seguinte contagem:
100 95 90 85 80 ... 0 Acabou!
 */

public class Ex41 {
    public static void main(String[] args) {
        for (int i = 100; i >= 0; i = i - 5) {
            System.out.printf("%d ", i);
        }
        System.out.printf("Acabou!");
    }
}
