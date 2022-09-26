import java.util.Scanner;

/*
Um programa de vida saudável quer dar pontos atividades físicas que podem 
ser trocados por dinheiro. O sistema funciona assim:
- Cada hora de atividade física no mês vale pontos
- até 10h de atividade no mês: ganha 2 pontos por hora
- de 10h até 20h de atividade no mês: ganha 5 pontos por hora
- acima de 20h de atividade no mês: ganha 10 pontos por hora
- A cada ponto ganho, o cliente fatura R$0,05 (5 centavos) 
Faça um programa que leia quantas horas de atividade uma pessoa teve por mês, 
calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
 */
public class Ex36 {
    public static void main(String[] args) {
        System.out.println("----- Programa de vida saudável -----");
        float dinheiro = dinheiroPorPonto();
        System.out.printf("Você poderá receber: R$ %.2f neste mês", dinheiro);

    }

    public static float dinheiroPorPonto() {
        /* 2 horas / 0 pontos */
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite quantos horas você treinou: ");
        int horasDeTreino = sc.nextInt();
        sc.close();
        /* 2 horas / 0 pontos */
        int esportista = 0, pontuacao;
        /* 2 horas / 0 pontos / esportista = 0 */
        if (horasDeTreino < 10) {
            esportista = (horasDeTreino * 2);
            /* x horas / 0 pontos / esportista = 2 * x.horas */
        } else if (horasDeTreino < 20) {
            esportista = (horasDeTreino * 5);
            /* x horas / 0 pontos / esportista = 5 * x.horas */
        } else {
            esportista = (horasDeTreino * 10);
            /* x horas / 0 pontos / esportista = 10 * x.horas */
        }
        pontuacao = esportista;
        float dinheiro = 0f;
        dinheiro = pontuacao * 5 / 100;
        return dinheiro;
    }
}
