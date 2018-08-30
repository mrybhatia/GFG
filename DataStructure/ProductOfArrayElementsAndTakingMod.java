/*

LINK : https://practice.geeksforgeeks.org/problems/product-of-array-element/1

This is a functional problem . Your task is to return the product of array elements under a given modulo. 
The modulo operation finds the remainder after division of one number by another. For example, K(mod(m))=K%m= remainder obtained when K is divided by m.

Input:

The first line of input contains T denoting the number of testcases.Then each of the T lines contains a single positive integer N denotes number of element in array. Next line contain 'N' integer elements of the array.


Output:

Return the product of array elements under a given modulo.
That is, return (Array[0]*Array[1]*Array[2]...*Array[n])%modulo.


Constraints:


1<=T<=200

1<=N<=10^5

1<=ar[i]<=10^5

Example:

Input:

1

4

1 2 3 4

Output:

24

*/


import java.util.*;
class Product
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Long arr[] = new Long[n];
            
            for(int i = 0; i < n; i++)
              arr[i] = sc.nextLong();
              
              Long mod = 1000000007L;
              GfG gfg = new GfG();
              System.out.println(gfg.product(arr, mod, n));
        }
    }
}

class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {   Long pro = 1L;
        for(int i=0;i<arr.length;i++){
            pro = (pro%mod)*(arr[i]%mod);
        }
        return pro%mod;
    }
}
