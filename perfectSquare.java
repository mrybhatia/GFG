/*

Link : https://practice.geeksforgeeks.org/problems/check-if-a-number-is-perfect-square/0/?track=SP-Misc

Given a natural number n, print 1 if it is perfect square else 0.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N, N is the number to be checked whether perfect square or not.

Output:
1 if it is perfect square else 0 

Constraints:
1 <= T <= 30
1 <= N <= 100000

Example:
Input:
3
100
10
125

Output:
1
0
0

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int t = sc.nextInt();
	     long n;
	     for(int i=0;i<t;i++){
	         n = sc.nextLong();
             long tst = (long)(Math.sqrt(n));
             if(tst*tst == n)
                System.out.println("1");
             else
                System.out.println("0");
	     }
	  }
}
