import java.util.Date;
/*
Project Euler Problem 134
=========================

Consider the consecutive primes p[1] = 19 and p[2] = 23. It can be
verified that 1219 is the smallest number such that the last digits are
formed by p[1] whilst also being divisible by p[2].

In fact, with the exception of p[1] = 3 and p[2] = 5, for every pair of
consecutive primes, p[2] > p[1], there exist values of n for which the
last digits are formed by p[1] and n is divisible by p[2]. Let S be the
smallest of these values of n.

Find S for every pair of consecutive primes with 5 p[1] 1000000.
*/

public class Euler134 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
