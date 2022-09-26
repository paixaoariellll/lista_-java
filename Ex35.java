import java.util.Scanner;

/* 
Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O 
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para 
carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e 
quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a 
tabela a seguir:
- Carros populares (aluguel de R$90 por dia)
- Até 100Km percorridos: R$0,20 por Km
- Acima de 100Km percorridos: R$0,10 por Km
- Carros de luxo (aluguel de R$150 por dia)
- Até 200Km percorridos: R$0,30 por Km
- Acima de 200Km percorridos: R$0,25 por Km
*/
public class Ex35 {
    public static void main(String[] args) {
        System.out.println("------ Aluguel de Carros ------");

    }

    public static float precoDoAluguel() {
        int tipo = tipoDeCarro();
        int km = quantosKmPercorridos();
        int dias = quantosDias();
        float aluguel = 0;
        if (tipo == 1 && km < 100) {
            aluguel = (90 * dias) + (km * 2) / 10;
        } else if (km >= 100) {
            aluguel = (90 * dias) + (km * 1) / 10;
        } else if (tipo == 2 && km < 200) {
            aluguel = (150 * dias) + (km * 3) / 10;
        } else {
            aluguel = (150 * dias) + (km * 25) / 10;
        }
        return aluguel;
    }

    public static int tipoDeCarro() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite 1 para popular ou 2 para luxo");
        int tipo = sc.nextInt();
        int tipoCarro = 0;
        sc.close();
        if (tipo == 1 || tipo == 2) {
            tipoCarro = tipo;
        }
        return tipoCarro;
    }

    public static int quantosDias() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite quantos dias alugou o carro: ");
        int dias = sc.nextInt();
        sc.close();
        return dias;
    }

    public static int quantosKmPercorridos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite quantos km você andou? ");
        int kmpercorridos = sc.nextInt();
        sc.close();
        return kmpercorridos;
    }
}
