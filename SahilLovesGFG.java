/*

Link : https://practice.geeksforgeeks.org/contest-problem/sahil-loves-gfg/0/

Sahil is done with his internship and now it's time to attend Geeks Classes to enhance knowledge of Data Structures. However, to join this class, he has been given a task to complete. The task is to count the occurrences of "gfg" in the given string, and if he completes this task, he qualifies for Geeks Classes. But, Sahil is facing some problem in solving this task, so help him.

Input : 
First line of input contains "T" testcases. Next "T" lines contains Strings with lowercase characters.

Output : 
For each testcase, output the count the ccurrences of "gfg"(continuous) present in string.

Constraints : 
1 <= T <= 10
1<= length_of_string <= 100

Example :
Input :
2
geefgfgksforgfgeeks
dsajslsdlsfgf
Output :
2
-1

Explanation :
#Test Case 1: In the first testcase, "gfg" occurs two times in the String. First ccurrence starts at index 4 and next starts at 12.
#Test Case 2: In second testcase, there is no occurences of "gfg" in given string. So, it returned -1.

 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String a;
		int count=0;
		for(int i=0;i<t;i++){
		    count = 0;
		    a = sc.next();
		    for(int j=0;j<a.length()-2;j++){
		        if((a.substring(j,j+3)).equals("gfg")){
		            count += 1;
		        }
		    }
		}
		if(count==0){
		    System.out.println("-1");
		}else{
		    System.out.println(count);
		}
		
	}
}
