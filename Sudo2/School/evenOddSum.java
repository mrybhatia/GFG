/*

LINK : https://practice.geeksforgeeks.org/problems/even-odd-sum/0/?track=SP%20-%202.3

Given an array Arr[] of N integers, write a program to find the sum of values of even and odd index positions separately.

Input: 
First line of input contains a single integer T which denotes the number of test cases. Then T test cases follows. First line of each test case contains a single integer N which denotes the number of elements in the array. Second line of each test case contains N space separated integer which denotes the elements of the array.
Output:
For each test case, in first line print the sum of elements of array present at even indexes and in the second line print the sum of elements at odd indexes.

Constraints:
1<=T<=100
1<=N<=1000
1<=Arr[i]<=105

Example:
Input:
2
6
1 2 3 4 5 6
7
10 20 30 40 50 60 70
Output:
9
12
160
120
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int s;
		int[] a;
		int sume=0,sumo=0;
		for(int i=0;i<t;i++){
		    sume=0;sumo=0;
		    s = sc.nextInt();
		    a = new int[s];
		    for(int j=0;j<s;j++){
		        a[j] = sc.nextInt();
		    }
		    for(int j=0;j<s;j+=2){
		        sumo += a[j];
		    }
		    System.out.println(sumo);
		    for(int j=1;j<s;j+=2){
		        sume += a[j];
		    }
		    System.out.println(sume);
		}
	}
}
