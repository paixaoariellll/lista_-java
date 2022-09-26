import java.util.Scanner;

/*  Switch case */
public class Ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Quente ou frio (exceção) */
        System.out.print("Digite como está a temperatura hoje: ");
        String temperatura = sc.nextLine().toLowerCase();
        sc.close();
        switch (temperatura) {
            case "quente":
                System.out.println("Está quente");
                break;
            case "frio":
                System.out.println("Está frio");
                break;
            default:
                System.out.println("Não tá quente nem frio");
                break;
        }
    }
}
