package Leetcode;

import java.util.PriorityQueue;

public class TopKElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 4, 6, 7, 8, 9, 9, 7, 5 ,0};
		PriorityQueue<Integer> min = new PriorityQueue<Integer>();
		int k =3;
		for (int i = 0; i < arr.length; i++) {
			
			min.add(arr[i]);
			if(min.size()>k)
				min.poll();
		}
		System.out.println(min);
	}

}
