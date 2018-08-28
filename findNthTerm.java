/*
Link : https://www.geeksforgeeks.org/find-nth-term-series-136101521/

Given a number n, find the n-th term in the series 1, 3, 6, 10, 15, 21…

Concept :
		Example :

					n = 2
					2nd term equals to sum of 1st term and 2 i.e
					A2 = A1 + 2 
					   = 1 + 2
					   = 3

					Similarly,
					A3 = A2 + 3
					   = 3 + 3
					   = 6 and so on..
					We get:

					A(n) = A(n - 1) + n 
					     = A(n - 2) + n + (n - 1)
					     = A(n - 3) + n + (n - 1) + (n - 2) 
					       .
					       .
					       .
					     = A(1) + 2 + 3... + (n-1) + n

					A(n) = 1 + 2 + 3 + 4... + (n - 1) + n
					     = n(n + 1) / 2

					i.e A(n) is sum of First n natural numbers.
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class Series{
    static int term(int n){
        return n * (n + 1) / 2;
    }
     
    // Driver Code
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(term(n));
    }
}
