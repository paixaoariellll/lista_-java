import java.util.Scanner;

/* [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um 
 * fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele 
 * já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule 
 * quantos dias de vida um fumante perderá e exiba o total em dias
 */
/* Não Fumem Crianças! */
public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o valor inteiro da quantidade de cigarros fumados por dia: ");
        int qtdCigarrosPorDia = sc.nextInt();
        System.out.print("Por favor, digite o valor inteiro da quantidade de anos que você fumou: ");
        int qtdAnos = sc.nextInt();
        sc.close();
        float diasPerdidos = (qtdCigarrosPorDia * 365 * qtdAnos) / 144;
        System.out.printf(
                "Considerando que um fumante perde 10 min de vida a cada cigarro.\nA quantidade em dias que o fumante perderá é de: %d dia(s)!",
                (int) diasPerdidos);
    }
}
/*
 * 6 cigarros = 1 hora.
 * 1 dia = 24 horas => 6 * 24 = 144 cigarros. para perder 1 dia
 * 144 cigarros = 1 dia de vida perdido.
 * 365 dias = 1 ano.
 * 360 (10 minutos em um dia)
 * Uma pessoa que não fuma, perderá 0 dias.
 * Uma pessoa que fumou 144 cigarros por 1 ano, perderá 1 dia.
 * Uma pessoa que fumou 1440 cigarros por 1 ano, perderá 10 dias.
 * 1 por dia => 365 cigarros
 * dias perdidos = total / (144)
 */
