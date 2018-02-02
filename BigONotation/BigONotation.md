# Big O Notation

## O(1)

Adding a value to an array is example of O(1).

    /**
     * This is an example of O(1) Notation, Adding an item to an array
     */
    public void O_1(int number) {
        if (initialSize < size)
            numbers[initialSize++] = number;
    }
   
## O(N)

Linear Search 

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
    
## Big O of N^2

    /**
    * O(N^2) , the best example being Bubble Sort
    */
    public void bubbleSort() {
    
    for (int i = numbers.length-1; i > 0; i--) {
        for (int j = 0; j < i; j++) {
    
            if (numbers[j] > numbers[j + 1]) {
                swap(j, j + 1);
            }
        }
    }
    
    System.out.println(Arrays.toString(numbers));
    
    }