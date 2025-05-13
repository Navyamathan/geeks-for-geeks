//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();

            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    
    public void reverseArray(int arr[]) 
    {
      int index = 0;
      printValue(index,arr);
    }
    
    public void printValue(int i, int arr[])
    {
        if(i > (arr.length-1)/2)
        {
            return;
        }
        int temp1 = arr[i];
        int temp2 = arr[arr.length-1-i];
        arr[i] = temp2;
        arr[arr.length-1-i] = temp1;
        printValue(i+1,arr);
    }
}