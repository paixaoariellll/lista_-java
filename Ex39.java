/* 
Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou!
 */

public class Ex39 {
    public static void main(String[] args) {
        for (int i = 10; i >= 3; i--) {
            System.out.printf("%d ", i);
        }
        System.out.printf("Acabou!");
    }
}
