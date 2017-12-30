# Prime Number 

    public static boolean isPrime(int number) {
        if (number % 2 == 0) {
            return false;
        }
        int size = (int) Math.sqrt(number);
        for (int i = 3; i <= size; i = i + 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }