// { Driver Code Starts
//Initial Template for Java


import java.util.*; 
import java.io.*; 

class GFG 
{ 
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            int array[] = new int[n];
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }

            Solution ob = new Solution();

            int ans[] = ob.help_classmate(array,n);

           	for (int i=0; i<n; i++) 
                System.out.print(ans[i]+" "); 
            System.out.println();
            t--;
        }
	} 
} 

// } Driver Code Ends


//User function Template for Java

class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	    Stack<Integer> stk=new Stack<Integer>();
	    int nse[]=new int[n];
	    stk.push(0);
	    for(int i=1;i<n;i++)
	    {
	        while(stk.empty()==false && arr[stk.peek()]>arr[i])
	        nse[stk.pop()]=arr[i];
	        stk.push(i);
	    }
	    while(stk.empty()==false)
	    {
	        nse[stk.pop()]=-1;
	    }
	    return nse;
	} 
}