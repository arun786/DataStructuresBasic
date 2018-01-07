package Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * It is a combination of searching and sorting.
 * first the minimum is searched and then placed at minimum position
 * and then the next minimum is searched excluding the already sorted minimum
 * value.
 */
public class SelectionSort {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the size of the array...");
        SelectionSort worker = new SelectionSort();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int size = Integer.parseInt(br.readLine());
            int[] numbers = worker.generateNumber(size);
            worker.doSelectionSort(numbers);
            for (int i = 0; i < size; i++) {
                System.out.print(numbers[i] + " ");
            }
        }
    }

    /**
     * @param numbers This method sorts an array as per the logic of Selection Sort
     */
    public void doSelectionSort(int[] numbers) {
        for (int x = 0; x < numbers.length; x++) {
            int minimum = x;
            for (int y = x; y < numbers.length; y++) {
                if (numbers[y] < numbers[minimum]) {
                    minimum = y;
                }
            }
            swap(minimum, x, numbers);
        }
    }

    /**
     * @param x
     * @param y
     * @param numbers this method swaps the number
     */
    public void swap(int x, int y, int[] numbers) {
        int temp = numbers[x];
        numbers[x] = numbers[y];
        numbers[y] = temp;
    }

    /**
     * @param size
     * @return this method generates a number
     */
    public int[] generateNumber(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size - 1; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }
        return numbers;
    }
}
