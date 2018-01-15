# String operations

## Reverse a String without using Java Predefined function

We can reverse a String using StringBuffer method reverse().
Below is the algorithm to reverse a String.

    package Generic;
    
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    
    public class ReverseAString {
        public static void main(String[] args) throws IOException {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                String str = br.readLine();
                String reverse[] = toReverse(str);
                for (int i = 0; i < reverse.length; i++) {
                    System.out.print(reverse[i]);
                }
    
            }
        }
    
        /**
         *
         * @param word
         * @return
         *
         */
        public static String[] toReverse(String word) {
            String[] reverseWord = word.split("");
            int size = reverseWord.length;
            for (int i = 0, j = size - 1; i < size / 2; i++, j--) {
                String temp = reverseWord[i];
                reverseWord[i] = reverseWord[j];
                reverseWord[j] = temp;
            }
            return reverseWord;
        }
    }

