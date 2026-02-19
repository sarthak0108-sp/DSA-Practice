package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Missingele_inrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1, 4, 11, 51, 15};
		ArrayList<Integer> list=new ArrayList<>();
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			map.put(i, a[i]);
		}
		int low=50;
		int high=55;
		for(int i=low;i<=high;i++) {
			if(map.containsValue(i)) {
				continue;
			}
			else {
				list.add(i);
			}
		}
		System.out.println(list);
		

	}

}
