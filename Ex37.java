import java.util.Scanner;

/* 
Uma empresa precisa reajustar o salário dos seus funcionários, dando um 
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual, 
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa. 
No final, mostre o seu novo salário, baseado na tabela(Fajuta) a seguir:
Mulheres:
- menos de 15 anos de empresa: +5%
- de 15 até 20 anos de empresa: +12% 
- mais de 20 anos de empresa: +23%
Homens:
- menos de 20 anos de empresa: +3%
- de 20 até 30 anos de empresa: +13%
- mais de 30 anos de empresa: +25%
*/

public class Ex37 {
    public static void main(String[] args) {
        System.out.println("---- Reajuste Salarial ----");
        float[] retornoDosDados = dadosDoFuncionario();
        float salario = retornoDosDados[0];
        float tempo = retornoDosDados[2];
        System.out.printf("Por possuir %.0f anos de empresa, você passará receber R$ %.2f", tempo, salario);
    }

    public static float[] dadosDoFuncionario() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, digite o seu salário atual: ");
        float salarioAtual = sc.nextFloat();
        System.out.print("Digite 1 para Homem, 2 para Mulher: ");
        int genero = sc.nextInt();
        System.out.print("Digite quantos anos de empresa você possui: ");
        int anosDeEmpresa = sc.nextInt();
        float novoSalario = 0;
        sc.close();
        if (genero == 1 || genero == 2) {
            if (genero == 1) {
                if (anosDeEmpresa < 15) {
                    novoSalario = salarioAtual + salarioAtual * 5 / 100;
                } else if (anosDeEmpresa < 20) {
                    novoSalario = salarioAtual + salarioAtual * 12 / 100;
                } else {
                    novoSalario = salarioAtual + salarioAtual * 23 / 100;
                }
            } else {
                if (anosDeEmpresa < 15) {
                    novoSalario = salarioAtual + salarioAtual * 3 / 100;
                } else if (anosDeEmpresa < 20) {
                    novoSalario = salarioAtual + salarioAtual * 13 / 100;
                } else {
                    novoSalario = salarioAtual + salarioAtual * 25 / 100;
                }
            }
        }
        float[] dados = { novoSalario, genero, anosDeEmpresa };
        return dados;
    }
}
