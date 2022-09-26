import java.util.OptionalInt;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

/* 
Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
 */
public class Ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------ Pedra Papel Tesoura -------");
        int jogadaAtual;
        do {
            System.out.println("Pedra =  1, Papel = 2, Tesoura = 3");
            System.out.print("Faça sua jogada: ");
            jogadaAtual = sc.nextInt();
            System.out.printf("A jogada do desafiante foi: %d\nA jogada da máquina foi:  %d\n", jogadaAtual,
                    numerosRandomicos());
            joKenPo(jogadaAtual, numerosRandomicos());
        } while (jogadaAtual >= 1 && jogadaAtual <= 3);
        sc.close();
    }

    public static int numerosRandomicos() {
        Random random = new Random();
        IntStream jogadaDaMaquina = random.ints(1, 1, 3);
        OptionalInt first = jogadaDaMaquina.findFirst();
        int resultadoDaMaquina = first.getAsInt();
        return resultadoDaMaquina;
    }

    /* (maquina > player || (maquina = 1 && palyer = 3)) ? perdeu: ganhou */
    public static boolean joKenPo(int player, int maquina) {
        boolean resultado = false;
        if (maquina > player || (maquina == 1 && player == 3)) {
            System.out.println("Perdeu");
            resultado = true;
        } else {
            System.out.println("Venceu");
        }
        return resultado;
    }
}