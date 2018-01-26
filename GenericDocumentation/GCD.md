# GCD is greatest Common divisor

        /**
         * @param a
         * @param b
         * @return Using Modulus with recursion
         */
        private static int GCDUsingModulus(int a, int b) {
            if (a == 0 && b != 0)
                return b;
            else if (b == 0 && a != 0) {
                return a;
            } else if (a == b) {
                return a;
            } else if (a > b)
                return GCDUsingModulus(a % b, b);
            return GCDUsingModulus(a, b % a);
        }
    
        /**
         * @param a
         * @param b
         * @return If we can find the difference between the number
         */
        private static int GCD(int a, int b) {
            if (a == 0 && b != 0)
                return b;
            else if (b == 0 && a != 0) {
                return a;
            } else if (a == 0 && b == 0)
                return 0;
            else if (a == b)
                return b;
            else if (a > b)
                return GCD(a - b, b);
            return GCD(a, b - a);
        }