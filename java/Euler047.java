import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
/*
Project Euler Problem 47
========================

The first two consecutive numbers to have two distinct prime factors are:

14 = 2 * 7
15 = 3 * 5

The first three consecutive numbers to have three distinct prime factors
are:

644 = 2^2 * 7 * 23
645 = 3 * 5 * 43
646 = 2 * 17 * 19.

Find the first four consecutive integers to have four distinct primes
factors. What is the first of these numbers?
*/
import java.util.Scanner;

public class Euler047 {
    public static void main(String[] args) throws FileNotFoundException {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println(getFactors(93845346));
        System.out.println("Execution Time: "
                + (end.getTime() - start.getTime()));
    }

    private static ArrayList<Integer> getFactors(long n)
            throws FileNotFoundException {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> primeList = new ArrayList<Integer>();
        File file = new File("./src/listOfPrimes.txt");
        Scanner scanner = null;

        scanner = new Scanner(file);

        while (scanner.hasNextInt()) {
            primeList.add(scanner.nextInt());
        }
        scanner.close();
        int i = 0;
        while (n != 1) {
            if (n % primeList.get(i) == 0) {
                list.add(primeList.get(i));
                n = n / primeList.get(i);
                i = 0;
            } else {
                i++;
            }

        }

        return list;
    }

    public static boolean isPrime(long num) {

        if (num == 0 || num == 1)
            return false;
        if (num < 4)
            return true;
        if (num % 2 == 0)
            return false;
        if (num < 9)
            return true;
        if (num % 3 == 0)
            return false;
        else {

            int sqrt = (int) Math.floor(Math.sqrt(num));
            int f = 5;

            while (f <= sqrt) {
                if (num % f == 0)
                    return false;
                if (num % (f + 2) == 0)
                    return false;
                f += 6;
            }
            return true;
        }
    }
}
