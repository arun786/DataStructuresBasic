# Search Algorithm
## Binary Search

It uses the concept of dividing the array into 2 parts and check
for the number if it is present in the lower half or the upper half.
Once the number is found in any of the half, the other half is ignored.
And the search continues till you get the number.

Note : Binary search works on Sorted array/numbers only.


    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    
    public class BinarySearch {
    
        public static void main(String[] args) throws IOException {
            System.out.println("Please enter the size of the array...");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                int size = Integer.parseInt(br.readLine());
                BinarySearch binarySearch = new BinarySearch();
                int[] numbers = binarySearch.generateAnArray(size);
                final int[] sortedNumber = binarySearch.BubbleSort(numbers);
                Display display = () -> {
                    for (int i = 0; i < sortedNumber.length; i++) {
                        System.out.print(sortedNumber[i] + " ");
                    }
                };
                display.display();
                System.out.println();
                System.out.println("Enter the number to search..");
                int number = Integer.parseInt(br.readLine());
                int index = binarySearch.binarySearch(sortedNumber, number);
                if (index == -1) {
                    System.out.println("Number not Found");
                } else {
                    System.out.println("Index of the number is " + index);
                }
            }
        }
    
        public interface Display {
            void display();
        }
    
        /**
         * @param numbers
         * @param value
         * @return This method searches for a number is a sorted array using Binary search
         */
        private int binarySearch(int[] numbers, int value) {
            int highIndex = numbers.length - 1;
            int lowIndex = 0;
            int middleIndex = -1;
            while (lowIndex <= highIndex) {
                middleIndex = (lowIndex + highIndex) / 2;
                if (numbers[middleIndex] > value) {
                    highIndex = middleIndex - 1;
                } else if (numbers[middleIndex] < value) {
                    lowIndex = middleIndex + 1;
                } else {
                    lowIndex = highIndex + 1;
                    if(numbers[middleIndex] == value)
                    return middleIndex;
                }
            }
            return -1;
        }
    
        /**
         * @param numbers
         * @return This method sorts an array using Bubble Sort
         */
        private int[] BubbleSort(int[] numbers) {
            int size = numbers.length;
            for (int i = size - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        numbers = swap(j, j + 1, numbers);
                    }
                }
            }
            return numbers;
        }
    
        /**
         * @param index1
         * @param index2
         * @param numbers
         * @return This method swaps the number in the array as per the index passed
         */
        private int[] swap(int index1, int index2, int[] numbers) {
            int temp = numbers[index1];
            numbers[index1] = numbers[index2];
            numbers[index2] = temp;
            return numbers;
        }
    
        /**
         * @param size
         * @return This method generates an Array of number
         */
        private int[] generateAnArray(int size) {
            int[] numbers = new int[size];
            for (int i = 0; i < size; i++) {
                numbers[i] = (int) (Math.random() * 100);
            }
            return numbers;
        }
    }
