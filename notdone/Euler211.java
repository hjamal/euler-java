import java.util.Date;
/*
Project Euler Problem 211
=========================

For a positive integer n, let σ[2](n) be the sum of the squares of its
divisors. For example,

                   σ[2](10) = 1 + 4 + 25 + 100 = 130.

Find the sum of all n, 0 < n < 64,000,000 such that σ[2](n) is a perfect
square.
*/

public class Euler211 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
