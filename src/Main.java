public class Main {
    public static void main(String[] args) {
        double c;
        double f;
     java.util.Scanner leitor = new
     java.util.Scanner(System.in);
 System.out.print("Digite a temperartura em Celsius: ");
 c = leitor.nextDouble();

        f = (9 * c + 160) / 5;

        System.out.println("A temperatura em fahrenheit é " + f);
    }
}