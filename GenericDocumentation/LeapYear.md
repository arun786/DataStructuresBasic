# Leap Year Algo

    /**
         * @param year
         * @return Checks if a year is leap year or not
         */
        public static String isLeapYear(int year) {
    
            boolean flag = true;
            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 != 0) {
                    flag = false;
                }
            } else {
                flag = false;
            }
    
            return flag == true ? "Is a leap Year" : "Not a leap Year";
        }