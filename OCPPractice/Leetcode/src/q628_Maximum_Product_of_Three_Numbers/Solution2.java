//Approach 2: Single Scan

//Algorithm
//We need not necessarily sort the given nums array to find the maximum product. Instead, we can only find the required 2 smallest values(min1 and min2) and the three largest values(max1, max2, max3) in the nums array, by iterating over the nums array only once.
//At the end, again we can find out the larger value out of min1 \times min2 \times max1min1×min2×max1 and max1 \times max2 \times max3max1×max2×max3 to find the required maximum product.

// Result:
//Success
//Runtime: 3 ms, faster than 74.71% of Java online submissions for Maximum Product of Three Numbers.
//Memory Usage: 40.2 MB, less than 96.43% of Java online submissions for Maximum Product of Three Numbers.

package q628_Maximum_Product_of_Three_Numbers;

public class Solution2 {
	
	public int maximumProduct(int[] nums) {
						
		int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        for (int n: nums) {
            if (n <= min1) {
                min2 = min1;
                min1 = n;
            } else if (n <= min2) {     // n lies between min1 and min2
                min2 = n;
            }
            if (n >= max1) {            // n is greater than max1, max2 and max3
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (n >= max2) {     // n lies betweeen max1 and max2
                max3 = max2;
                max2 = n;
            } else if (n >= max3) {     // n lies betwen max2 and max3
                max3 = n;
            }
        }
        return Math.max(min1 * min2 * max1, max1 * max2 * max3);
		
	}

	public static void main(String[] args) {
		Solution2 s = new Solution2();
		
		int[] a1 = {-4,-3,-2,-1,60};
		
		System.out.println(s.maximumProduct(a1));

	}

}
