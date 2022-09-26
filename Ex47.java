/* 
Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 + 
450 + 400 + 350 + 300 + ... + 50 + 0 
*/
public class Ex47 {
    public static void main(String[] args) {
        for (int i = 500; i >= 0; i = i - 50) {
            System.out.printf("%d + ", i);
        }
        float soma = (500 + 0) * 11 / 2;
        System.out.print("= " + soma);
    }
}
