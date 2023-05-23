
 import java.util.*;
import java.lang.*;
import java.io.*;
public class Main {
	   public static void main(String args[]) {
		  
		        Scanner sc = new Scanner(System.in);
		        int n = sc.nextInt();
		        int[][] trips = new int[n][3];
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < 3; j++) {
		                trips[i][j] = sc.nextInt();
		            }
		        }
		        int k = sc.nextInt();
	           
	        Solution obj= new Solution();
	        System.out.println(obj.carPooling(trips,k));
	    }
}
class Solution{
  
    public boolean carPooling(int[][] trips, int capacity) {
//your code
		TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int[] trip:trips)
        {
            int passengers=trip[0];
            int start=trip[1];
            int end=trip[2];

            map.put(start, map.getOrDefault(start, 0)+passengers);
            map.put(end, map.getOrDefault(end, 0)-passengers);
        }
        int runningsum=0;
        for(int it:map.values())
        {
            runningsum+=it;
            if(runningsum>capacity)
            {
                return false;
            }
        }
        return true;
	}
}
