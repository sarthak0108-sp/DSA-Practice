package arrays;

import java.util.HashMap;

public class Maxsubarraysum_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {15, -2, 2, -8, 1, 7, 10, 23};
		int n=a.length;
		int sum=0;
		int len=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		map.put(0, -1);
		for(int i=0;i<n;i++) {
			sum+=a[i];
			if(map.containsKey(sum)) {
				int previdx=map.get(sum);
				int length=i-previdx;
				len=Math.max(len, length);
			}
			else {
				map.put(sum, i);
			}
			
		}
		System.out.println(len);

	}

}
