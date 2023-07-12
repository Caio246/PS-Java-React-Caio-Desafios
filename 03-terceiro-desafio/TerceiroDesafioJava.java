import java.util.*;

public class TerceiroDesafioJava {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int arraySize = scan.nextInt();

        System.out.print("Digite o valor alvo: ");
        int k = scan.nextInt();

        int[] arr = new int[arraySize];
        System.out.print("Digite os elementos do array separados por espaço: ");
        for (int i = 0; i < arraySize; i++) {
            arr[i] = scan.nextInt();
        }

        int pairCount = countPairs(arr, k);
        System.out.println("Número de pares que satisfazem o critério: " + pairCount);
    }

    public static int countPairs(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int numbers : arr) {
            if (set.contains(numbers - k)) {
                count++;
            }
            if (set.contains(numbers + k)) {
                count++;
            }
            set.add(numbers);
        }

        return count;
    }

}