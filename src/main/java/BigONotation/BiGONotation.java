package BigONotation;

public class BiGONotation {

    private static int[] numbers;
    private int size;
    private int initialSize;

    public static void main(String[] args) {
        /**
         * O^1
         */
        BiGONotation b = new BiGONotation(1);
        b.O_1(10);
        display d = () -> System.out.println(numbers[0]);
        d.display();

        /**
         * O(N)
         */
        BiGONotation b1 = new BiGONotation(100000);
        b1.arrayBuilder();
        long startTime = System.currentTimeMillis();
        String indexes = b1.O_N(200);
        long endTime = System.currentTimeMillis();
        System.out.println("time Taken ..." + (endTime - startTime));
        System.out.println(indexes);
    }

    interface display {
        void display();
    }

    /**
     * @param size Constructor to initialize the array
     */
    public BiGONotation(int size) {
        this.size = size;
        numbers = new int[size];
    }

    /**
     * This is an example of O(1) Notation, Adding an item to an array
     */
    public void O_1(int number) {
        if (initialSize < size)
            numbers[initialSize++] = number;
    }

    /**
     * O(N) Notation, the best example is Linear Search.
     */
    public String O_N(int number) {
        String indexesWithValues = "";
        for (int i = 0; i < size; i++) {
            if (numbers[i] == number) {
                indexesWithValues += i + " ";
            }
        }
        if (indexesWithValues == "") {
            return "Values not present";
        }
        return indexesWithValues;
    }


    private void arrayBuilder() {
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 1000) + 10;
        }
    }
}
