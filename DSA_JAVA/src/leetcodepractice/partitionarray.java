package leetcodepractice;

import java.util.ArrayList;
import java.util.Arrays;

public class partitionarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {9,12,5,10,14,3,10};
		int pivot=10;
		 int result[]=new int[nums.length];
			int idx=0;
			for(int i=0;i<nums.length;i++) {
				if(nums[i]<pivot){
	                 result[idx]=nums[i];
	                 idx++;
	            }
		
			}
			for(int i=0;i<nums.length;i++) {
				if(nums[i]==pivot){
	                 result[idx]=nums[i];
	                 idx++;
	            }
		
			}
	        for(int i=0;i<nums.length;i++) {
				if(nums[i]>pivot){
	                 result[idx]=nums[i];
	                 idx++;
	            }
		
			}
	    
		System.out.println(Arrays.toString(result));
		
		

	}

}
