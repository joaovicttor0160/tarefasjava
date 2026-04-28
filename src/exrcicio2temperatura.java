import java.util.Scanner;

public class exrcicio2temperatura {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        double c, f;

        System.out.print("Digite a temperatura em Celsius: ");
        c = leitor.nextDouble();

        f = (9 * c + 160) / 5;

        System.out.println("A temperatura em Fahrenheit é: " + f);

        leitor.close();
    }
}