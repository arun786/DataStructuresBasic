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