import java.util.Random;
import java.util.Scanner;

public class Ex32_Franklin {
    public static void main(String[] args) {
        // 31) [DESAFIO] Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Vamos jogar joKenPo\n Escolha 'Pedra', 'Papel' ou 'Tessoura'!");
        String jogador1 = sc.nextLine();
        int npc = rand.nextInt(3);
        sc.close();
        // -----------------------usar Randon para gerar o movimento da
        // "maquina"-----------------------------------
        // pedra - 0 / papel - 1 / tessoura - 2
        if (jogador1.equalsIgnoreCase("pedra")) {
            // condição de jogada contra pedra
            if (npc == 1) {
                System.out.println("Npc jogou papel.\nvocê perdeu!");
            } else {
                System.out.println(
                        npc == 2 ? ("Npc jogou tessoura.\nvocê venceu!") : ("Npc fez a mesma jogada.\nEmpate!"));
            }
        } else if (jogador1.equalsIgnoreCase("papel")) {
            // condição de jogada papel
            if (npc == 2) {
                System.out.println("Npc jogou tessoura.\nvocê perdeu!");
            } else {
                System.out.println(npc == 0 ? ("Npc jogou pedra.\nVocê venceu!") : ("Npc fez a mesma jogada\nEmpate!"));
            }
        } else if (jogador1.equalsIgnoreCase("tessoura")) {
            // condição de jogada contra tessoura
            if (npc == 0) {
                System.out.println("Npc jogou pedra.\nvocê perdeu!");
            } else {
                System.out.println(npc == 1 ? ("Npc jogou papel.\nvocê venceu!") : ("Npc fez a mesma jogada\nEmpate!"));
            }
        } else {
            System.out.println("Escreva uma opção correta.");
        }
    }
}