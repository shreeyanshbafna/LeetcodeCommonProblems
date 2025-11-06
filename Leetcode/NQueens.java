package Leetcode;

import java.util.Iterator;

public class NQueens {

	public static void main(String[] args) {
		int n = 4;
		SolveQueens(n);
	}
	private static void SolveQueens(int n) {
		char chess[][] = new char[n][n];
		for(int i =0; i<n;i++ ) {
			for(int j=0; j<n;j++ ) {
				chess[i][j] = '.';
			}
		}
		
		placequeens();
	}
	private static void placequeens() {
		// TODO Auto-generated method stub
		
	}

}
