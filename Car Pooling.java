
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
		int [] arr=new int [1001];
		int n=trips.length;
		for(int i=0;i<n;i++){
			int from=trips[i][1];
			int _to=trips[i][2];
			arr[from]+=trips[i][0];
			arr[_to]-=trips[i][0];
		}
		int maxi=0;
		for(int i=0;i<1001;i++){
			maxi+=arr[i];
			if(maxi>capacity){
				return false;
			}
		}
		return true;
	}
}
