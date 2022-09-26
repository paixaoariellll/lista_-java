/* 
Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou!
 */

public class Ex40 {
    public static void main(String[] args) {
        for (int i = 0; i <= 18; i = i + 3) {
            System.out.printf("%d ", i);
        }
        System.out.printf("Acabou!");
    }
}
