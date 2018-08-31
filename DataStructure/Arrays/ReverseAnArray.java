/*

LINK : https://practice.geeksforgeeks.org/problems/reverse-an-array/0/?track=SP-Arrays%20and%20Searching

Given an array, print reverse of it.

Input:

First line contains an integer, the number of test cases 'T' Each test case should contain an integer, size of array 'N' in the first line. The second line contains the space seperated intergers of the array.

Output:

Print the array in reverse order in a single line separated by space.Each array is to be printed in separate line.

Constraints:

1 <= T <= 100

1 <= N <=100

0 <= Arr[i] <= 100

Example:

Input
1
4
1 2 3 4

Output:
4 3 2 1

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList al = new ArrayList();
		int t =sc.nextInt();
		int y;
		int s;
		for(int i=0;i<t;i++){
		    al.clear();
		    s = sc.nextInt();
		    
		    for(int j=0;j<s;j++){
		        y = sc.nextInt();
		        al.add(y);
		    }
		    Collections.reverse(al);
		    for(int j=0;j<s;j++){
		    System.out.print(al.get(j));
		    System.out.print(" ");
		    }System.out.println();
		}
	}
}
