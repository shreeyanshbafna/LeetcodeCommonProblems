package Leetcode;

import java.util.Collections;
import java.util.PriorityQueue;

public class TopKSmallestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 4, 6, 7, 8, 9, 9, 7, 5, 0 };

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		int k = 3;
		for (int i = 0; i < arr.length; i++) {

			maxHeap.add(arr[i]);
			if (maxHeap.size() > k)
				maxHeap.poll();
		}
		System.out.println(maxHeap);
	}

}
