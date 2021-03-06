import java.util.Date;
/*
Project Euler Problem 272
=========================

For a positive number n, define C(n) as the number of the integers x, for
which 1 < x < n and x^3 ≡ 1 mod n.

When n=91, there are 8 possible values for x, namely: 9, 16, 22, 29, 53,
74, 79, 81. Thus, C(91)=8.

Find the sum of the positive numbers n ≤ 10^11 for which C(n) = 242.
*/

public class Euler272 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
