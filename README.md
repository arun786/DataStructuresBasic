# DataStructuresBasic

## Linear Search

In Linear search, the number to be searched is compared to each number in the array

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    
    public class LinearSearch {
    
        public static void main(String[] args) throws IOException {
            String index = "";
            boolean flag = false;
            int[] numbers = NumberBuilder(10);
    
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
    
            System.out.println();
    
            System.out.println("Please enter the number you want to search");
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                String number = br.readLine();
    
    
                for (int i = 0; i < numbers.length; i++) {
                    if (Integer.parseInt(number) == numbers[i]) {
                        flag = true;
                        index = "" + i;
                    }
                }
    
                if (flag) {
                    System.out.println("Numbers present on Indexes " + index);
                } else {
                    System.out.println("Number not present");
                }
            }
        }
    
        public static int[] NumberBuilder(int size) {
            int[] numbers = new int[size];
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = (int) (Math.random() * 100);
            }
            return numbers;
        }
    }
