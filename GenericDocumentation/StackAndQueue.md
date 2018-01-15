# Stack And Queue

## Stack works on FILO.

    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    
    public class StackExplained {
    
        private static int[] stack;
        private static int topOfStack = 0;
        private static int size;
    
        public static void main(String[] args) throws IOException {
            try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
                size = Integer.parseInt(br.readLine());
                arrayBuilder();
                displayTheStack();
                for (int i = 0; i < size; i++) {
                    System.out.println();
                    int number = Integer.parseInt(br.readLine());
                    push(number);
                    displayTheStack();
                }
                pop();
                displayTheStack();
            }
        }
    
        /**
         * this builds the array with negative number -1
         */
        public static void arrayBuilder() {
            stack = new int[size];
            for (int i = 0; i < size; i++) {
                stack[i] = -1;
            }
        }
    
        /**
         * @param number push basically means data is pushed to the array.
         */
        public static void push(int number) {
            if (topOfStack < size) {
                System.out.println("adding the number to the stack " + number);
                stack[topOfStack++] = number;
            } else {
                System.out.println("stack is full");
            }
        }
    
        /**
         * Pop removes the number from the top of the stack, in this case end of the array
         */
        public static void pop() {
            if (topOfStack == 0) {
                System.out.println("Please add numbers to stack, stack is empty...");
            } else {
                System.out.println("Popping/removing the number out of the stack");
                stack[--topOfStack] = -1;
            }
        }
    
        /**
         * this displays the number
         */
        public static void displayTheStack() {
            for (int i = 0; i < size; i++) {
                System.out.print(" | " + (stack[i] == -1 ? " " : stack[i]) + " | ");
            }
            System.out.println();
        }
    }
