import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class PrimeiroDesafioJava {

    public static void main(String[] args) throws IOException {

            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int totalNumbers = Integer.parseInt(st.nextToken());

            List<Integer> numbers = new ArrayList<>();

            for (int i = 0; i < totalNumbers; i++) {
                st = new StringTokenizer(br.readLine());
                numbers.add(Integer.parseInt(st.nextToken()));
            }

            List<Integer> oddNumbers = numbers.stream()
                    .filter(number -> number % 2 == 0)
                    .sorted()
                    .collect(Collectors.toList());

            List<Integer> evenNumbers = numbers.stream()
                    .filter(number -> number % 2 != 0)
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());

            List<Integer> result = new ArrayList<>();
                result.addAll(oddNumbers);
                result.addAll(evenNumbers);
                result.forEach(System.out::println);
        }
    }
}
