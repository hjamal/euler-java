import java.util.Date;
/*
Project Euler Problem 269
=========================

A root or zero of a polynomial P(x) is a solution to the equation P(x) = 0.
Define P[n] as the polynomial whose coefficients are the digits of n.
For example, P[5703](x) = 5x^3 + 7x^2 + 3.

We can see that:

 • P[n](0) is the last digit of n,
 • P[n](1) is the sum of the digits of n,
 • P[n](10) is n itself.

Define Z(k) as the number of positive integers, n, not exceeding k for
which the polynomial P[n] has at least one integer root.

It can be verified that Z(100 000) is 14696.

What is Z(10^16)?
*/

public class Euler269 {
    public static void main(String[] args) {
        Date start, end;
        start = new Date();

        end = new Date();
        System.out.println("Execution Time: " + (end.getTime() -start.getTime()));
    }
}
