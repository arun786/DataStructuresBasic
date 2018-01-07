# Sorting methods

## Bubble Sort
### Big O for Bubble Sort for worst case scenario is O(n to the power of 2)

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
        
# Selection Sort
        
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
