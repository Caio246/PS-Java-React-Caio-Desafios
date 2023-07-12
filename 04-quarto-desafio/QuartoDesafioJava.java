import java.util.Scanner;

public class QuartoDesafioJava {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o número de linhas embaralhadas:");
            int numberOfCases = scan.nextInt();
            scan.nextLine();

            for (int i = 0; i < numberOfCases; i++) {
                System.out.println("Digite uma linha de cada vez:");
                String phrase = readLine(scan);
                int pointDivision = phrase.length() / 2;

                StringBuilder part1 = new StringBuilder(phrase.substring(0, pointDivision));
                StringBuilder part2 = new StringBuilder(phrase.substring(pointDivision));

                part1.reverse();
                part2.reverse();

                System.out.println(part1.toString() + part2.toString());
            }
        }
    }

    public static String readLine(Scanner scan) {
        String line = scan.nextLine();
        while (line.isEmpty()) {
            line = scan.nextLine();
        }
        return line;
    }
}
