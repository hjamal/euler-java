/*
 Project Euler Problem 2
 =======================

 Each new term in the Fibonacci sequence is generated by adding the
 previous two terms. By starting with 1 and 2, the first 10 terms will be:

 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

 Find the sum of all the even-valued terms in the sequence which do not
 exceed four million.
 */

#include <stdlib.h>
#include <stdio.h>

/*
 *	The Functions below are not used to solve the problem.
 *
 *	The first function takes an int for the term uses 
 *	recursion to find the fibonacci number at that term.
 *
 *	The second funtion uses an iterative approach to find the term of the fib sequence.
 */
int fibR(int t);
int fibI(int t);

/*
 *	The idea is to generate terms as you no need for functions.
 *	This way we don't need to generate so many terms for no reason
 *
 */
int main(int argc, char **argv){
	int sum, fib1, fib2, temp;
	sum = 0;
	fib1 = fib2 = 1;
	while(fib1 <= 4000000){
		if(fib1 % 2 == 0)
			sum += fib1;
		temp = fib2;
		fib2 += fib1;
		fib1 = temp;
	}
	printf("%d\n", sum);
}
int fibI(int t){
	int i, temp, num1, num2;
	num1 = num2 = 1;
	for(i = 0; i <= t; i++){
		temp = num2;
		num2 += num1;
		num1 = temp;
	}
	return num2;
}
int fibR(int i){
	if(i == 0)
		return 0;
	if(i == 1)
		return 1;
	else
		return fibR(i-1) + fibR(i-2);

}