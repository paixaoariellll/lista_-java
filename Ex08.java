import java.util.Scanner;

/* Desenvolva um programa que leia uma distância em metros
 * e mostre os valores relativos em outras medidas. 
*/
/* km-hec-dam-m-cm-dcm-mm
       <-%10    *10-> */

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma distância em metros: ");
        float numero = sc.nextFloat();
        sc.close();
        System.out.printf(
                "A distância de %.1fm corresponde a:\n%.5f Km           %.1f dm  \n%.4f Hm            %.1f cm \n%.3f Dam           %.1f mm",
                numero, numero / 1000, numero * 10, numero / 100, numero * 100, numero / 10, numero * 1000);
    }
}
