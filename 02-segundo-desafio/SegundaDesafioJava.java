import java.util.Scanner;
import java.util.regex.Pattern;

public class SegundaDesafioJava {
    private static final int[] CASH = {100, 50, 20, 10, 5, 2};
    private static final int[] COINS = {100, 50, 25, 10, 5, 1};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalMoney = readValidMoney(scan);

        int totalValue = (int) (totalMoney * 100);

        System.out.println("NOTAS:");
        for (int ballot : CASH) {
            int totalBallots = totalValue / (ballot * 100);
            totalValue %= ballot * 100;
            System.out.printf("%d nota(s) de R$ %.2f%n", totalBallots, ballot * 1.0);
        }

        System.out.println("MOEDAS:");
        for (int coin : COINS) {
            int countCoins = totalValue / coin;
            totalValue %= coin;
            System.out.printf("%d moeda(s) de R$ %.2f%n", countCoins, coin / 100.0);
        }

        scan.close();
    }

    private static double readValidMoney(Scanner scan) {
        while (true) {
            String input = scan.next();
            if (isValidMoney(input)) {
                return Double.parseDouble(input);
            } else {
                System.out.println("Valor inválido! Digite novamente:");
            }
        }
    }

    private static boolean isValidMoney(String input) {
        Pattern pattern = Pattern.compile("^\\d+(\\.\\d{1,2})?$");
        return pattern.matcher(input).matches();
    }
}