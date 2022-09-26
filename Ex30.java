/* 
[DESAFIO] Refaça o algoritmo 25, acrescentando o recurso de mostrar que tipo 
de triângulo será formado: 
- EQUILÁTERO: todos os lados iguais
- ISÓSCELES: dois lados iguais
- ESCALENO: todos os lados diferentes
número floateiro
 */
public class Ex30 {
    public static void main(String[] args) {
        float[] numeros = Ex24.entradaTriangulo();
        if (Ex24.comparaNumeros(numeros[0], numeros[1], numeros[2])) {
            float a = numeros[0];
            float b = numeros[1];
            float c = numeros[2];
            if (a == b && a == c) {
                System.out.println("O triângulo é equilátero");
            } else {
                System.out.printf("%s\n",
                        a == b || a == c || b == c ? "O triângulo é isósceles" : "O triângulo é escaleno");
            }
        } else {
            System.out.println("Não é um triângulo");
        }
    }
}
