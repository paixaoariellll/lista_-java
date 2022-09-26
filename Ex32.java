import java.util.Random;
import java.util.Scanner;

/* No método estatic não se usa o this.parametro = parametro 
[DESAFIO] Crie um jogo onde o computador vai sortear um número entre 1 e 5 o 
jogador vai tentar descobrir qual foi o valor sorteado. 
 */
public class Ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int player = 0;
        System.out.println("----- Jogo da Advinhação -----");
        do {
            System.out.println("Digite um número inteiro de 1 a 5 e teste sua sorte!");
            player = sc.nextInt();
            venceu(numerosRandomicos(), player);
        } while (player >= 1 && player <= 10);
        sc.close();
    }

    public static void venceu(int numerosRandomicos, int player) {
        if (numerosRandomicos == player) {
            System.out.printf("A máquina printou: %d\nParabéns, você venceu!\n", numerosRandomicos);
        } else {
            System.out.printf("A máquina printou: %d\nQue pena, você perdeu!\n", numerosRandomicos);
        }
    }

    public static int numerosRandomicos() {
        Random random = new Random();
        int resultadoDaMaquina = random.nextInt(1, 10);
        return resultadoDaMaquina;
    }

    public static int numerosRandomicosPersonalizados(int init, int end) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro de 1 a 5 e teste sua sorte!");
        init = sc.nextInt();
        System.out.println("Digite um número inteiro de 1 a 5 e teste sua sorte!");
        end = sc.nextInt();
        Random random = new Random();
        int resultadoDaMaquina = random.nextInt(init, end);
        sc.close();
        return resultadoDaMaquina;
    }
}
