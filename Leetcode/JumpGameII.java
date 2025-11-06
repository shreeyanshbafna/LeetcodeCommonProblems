package Leetcode;

public class JumpGameII {
	public static void main(String[] args) {
		int y[] = {2,3,1,1,4};
		int res = minimumnoofjump(y);
		System.out.println(res);
	}

	static int minimumnoofjump (int y[]) {
	      // Track the minimum number of jumps needed
        int jumps = 0;
      
        // Track the farthest position reachable with current and previous jumps
        int maxReachable = 0;
      
        // Track the end of the current jump's range
        int currentJumpEnd = 0;
      
        // Iterate through array except the last element (we don't need to jump from the last position)
        for (int i = 0; i < y.length - 1; i++) {
            // Update the farthest position we can reach from current position
            maxReachable = Math.max(maxReachable, i + y[i]);
          
            // If we've reached the end of the current jump's range
            if (i == currentJumpEnd) {
                // We must make another jump
                jumps++;
              
                // Update the range of the next jump to the farthest position we can reach
                currentJumpEnd = maxReachable;
            }
        }
      
        return jumps;

	}
}
