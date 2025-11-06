package Leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKMostOccuringelementElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 4, 6, 7, 8, 9, 9, 7, 5, 0,11,11 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
				Comparator.comparingInt(Map.Entry::getValue));
		int k = 4;
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			minHeap.offer(entry);
			if (minHeap.size() > k) {
				minHeap.poll(); // Remove least frequent element
			}
		}
		int[] result = new int[k];
		for (int i = k - 1; i >= 0; i--) {
			result[i] = minHeap.poll().getKey();
		}
		for (int num : result) {
			System.out.println(num);
		}
		
	}

}
