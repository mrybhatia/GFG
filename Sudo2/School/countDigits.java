/*
LINK : https://practice.geeksforgeeks.org/problems/count-digits/0/?track=SP%20-%202.3

Given a number N. You need to write a program to count the number of digits in N which evenly divides N.

Input:
First line of input contains an integer T which denotes the number of test cases. T test cases follows. First line of each test case contains a single integer N.

Output:
For each test case in a new line print the total number of digits of N which evenly divides N.

Constraints:
1<=T<=200
1<=N<=105

Example:
Input:
3
12
1012
23
Output:
2
3
0
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int x,n,count;
		String a;
		for(int i=0;i<t;i++){
		    count = 0;
		    a = sc.next();
		    n = Integer.parseInt(a);
		    for(int j=0;j<a.length();j++){
		        x = Integer.parseInt(String.valueOf(a.charAt(j)));
		        if(x == 0){
		            continue;
		        }else if(n % x == 0){
		            count++;
		        }
		    }System.out.println(count);
		    
		}
	}
}
