// Stock Span Problem - Step-by-step logic and code (O(n) using a stack)
// Given prices: [100, 80, 60, 70, 60, 75, 85]
// Output spans: [1,   1,  1,  2,  1,  4,  6]
//
// Core idea (monotonic stack of indices with decreasing prices):
// For each day i:
// 1) Pop from stack while stack top's price <= current price (we found more days that are <= current).
// 2) If stack becomes empty, span = i + 1 (all previous days are <= current).
//    Else span = i - stack.peek() (distance to last greater price).
// 3) Push current index i.
// This visits each index once (push/pop at most once) => O(n).

import java.util.*;

class StockSpan {
	static int[] calculateSpan(int[] prices) {
		int n = prices.length;
		int[] span = new int[n];
		Deque<Integer> st = new ArrayDeque<>(); // stack of indices

		for (int i = 0; i < n; i++) {
			// Step 1: remove all previous days with price <= current
			while (!st.isEmpty() && prices[st.peek()] <= prices[i]) {
				st.pop();
			}

			// Step 2: compute span using last greater element index
			span[i] = st.isEmpty() ? (i + 1) : (i - st.peek());

			// Step 3: push current day
			st.push(i);
		}
		return span;
	}

	// Optional: simple O(n^2) version to understand the definition directly
	static int[] calculateSpanNaive(int[] prices) {
		int n = prices.length;
		int[] span = new int[n];
		for (int i = 0; i < n; i++) {
			int s = 1; // at least today counts
			// count backwards while previous prices <= current
			for (int j = i - 1; j >= 0 && prices[j] <= prices[i]; j--) {
				s++;
			}
			span[i] = s;
		}
		return span;
	}
}

// Demo runner (no public class, because file name has spaces)
class StockSpanDemo {
	public static void main(String[] args) {
		int[] prices = {100, 80, 60, 70, 60, 75, 85};

		int[] span = StockSpan.calculateSpan(prices);
		System.out.println("Prices: " + Arrays.toString(prices));
		System.out.println("Span   : " + Arrays.toString(span));

		// Uncomment to compare with naive
		// System.out.println("Naive  : " + Arrays.toString(StockSpan.calculateSpanNaive(prices)));
	}
}

                                              