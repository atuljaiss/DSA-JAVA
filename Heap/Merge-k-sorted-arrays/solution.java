//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0){
			int n = sc.nextInt();
			int[][] a = new int[n][n];
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			Solution T = new Solution();
			ArrayList<Integer> arr= T.mergeKArrays(a, n);
			for(int i = 0; i < n*n ; i++)
			    System.out.print(arr.get(i)+" ");
		    System.out.println();
		    
		    t--;
		}
	}
}


// } Driver Code Ends


//User function Template for Java
class Triplet implements Comparable<Triplet>{
    int val,apos,vpos;
    Triplet(int v,int ap, int vp){
        val = v;
        apos = ap;
        vpos = vp;
    }
    public int compareTo(Triplet t){
        if(t.val < val){
            return 1;
        }else return -1;
    }
}

class Solution
{
    //Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int k) 
    {
        // Write your code here.
        ArrayList<Integer> al = new ArrayList<>();
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        for(int i = 0;i<k;i++){
            pq.add(new Triplet(arr[i][0],i,0));
        }
        while(pq.isEmpty()==false){
            Triplet t = pq.poll();
            al.add(t.val);
            int ap = t.apos, vp = t.vpos;
            if(vp+1 < k){
                pq.add(new Triplet(arr[ap][vp+1],ap,vp+1));
            }
        }
        
        return al;
        
    }
}