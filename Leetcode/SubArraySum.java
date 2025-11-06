package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubArraySum {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,2,-1,-1,3,2,2};
		int k =4;
		int sum =0;
		int count =0;
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			System.out.println(sum);
			System.out.println(map);
			
			if(map.containsKey(sum-k)){
				count +=map.get(sum-k);
				System.out.println(count+"count");

			}
			map.put(sum, map.getOrDefault(sum,0)+1);
			System.out.println();
		}
		System.out.println(count);
	}

}
