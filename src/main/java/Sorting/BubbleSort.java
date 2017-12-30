package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the size of the array....");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int size = Integer.parseInt(br.readLine());
            int[] numberSorted = useBubbleSort(size);
            for (int i = 0; i < size; i++) {
                System.out.print(numberSorted[i] + " ");
            }
        }
    }

    /**
     * @param size
     * @return Bubble Sort uses the concept of iterating from index 0 to length
     * of the array and comparing each index value with other, so at the end of
     * the iteration the maximum or minimum as per the requirement will be at the
     * end. The next iteration starts from index 0 to one less than the end
     * of the array and so on
     */
    public static int[] useBubbleSort(int size) {
        int[] numbers = generateNumbers(size);
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    numbers[j] = numbers[j] + numbers[j + 1];
                    numbers[j + 1] = numbers[j] - numbers[j + 1];
                    numbers[j] = numbers[j] - numbers[j + 1];
                }
            }
        }
        return numbers;
    }


    public static int[] generateNumbers(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        return numbers;
    }
}
