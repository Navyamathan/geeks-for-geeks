//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution
{
    void mergeSort(int arr[], int l, int h) 
    {
        if(l==h)
        {
            return ;
        }
        int m = (l+h)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,h);
        merge(arr,l,m,h);
    }
    
    void merge(int arr[], int l, int m, int h)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int left = l;
        int right = m+1;
        
        while(left <= m && right <= h)
        {
            if(arr[left] < arr[right])
            {
                list.add(arr[left]);
                left++;
            }
            else
            {
                list.add(arr[right]);
                right++;
            }
        }
        
        while(left <= m)
        {
            list.add(arr[left]);
            left++;
        }
        
        while(right <= h)
        {
            list.add(arr[right]);
            right++;
        }
        
        for(int i=l; i<=h; i++)
        {
            arr[i] = list.get(i-l);
        }
    }
}
