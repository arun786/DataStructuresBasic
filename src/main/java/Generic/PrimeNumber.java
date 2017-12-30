package Generic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

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


    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the number to check if it is prime..");
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int number = Integer.parseInt(br.readLine());
            boolean flag = isPrime(number);
            System.out.println("Number passed " + number + " is a prime " + flag);
        }
    }

}



