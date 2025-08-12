// Palindrome check for a singly linked list
// -----------------------------------------------------------
// A palindrome list reads the same forward and backward.
// Example: 1 -> 2 -> 3 -> 2 -> 1  (palindrome)
//          1 -> 2 -> 3 -> 4       (not palindrome)
//
// Approach (O(n) time, O(1) extra space):
// 1. Find middle using slow/fast pointers.
// 2. Reverse second half of list in-place.
// 3. Compare first half and reversed second half.
// 4. (Optional) Restore list by reversing second half back.
// 5. Report result.
//
// Visual example for 1 -> 2 -> 3 -> 2 -> 1
// slow,fast traversal:
//  step0: slow=1 fast=1
//  step1: slow=2 fast=3
//  step2: slow=3 fast=1(end)  => slow at middle
// Split & reverse second half starting after slow:
//  First half: 1 -> 2 -> 3
//  Second half original: 2 -> 1 -> null
//  Second half reversed: 1 -> 2 -> null
// Compare pairs:
//  (1,1) (2,2) (3, end) => palindrome
//
// Reversal in-place diagram:
//  prev=null, curr=2 -> 1 -> null
//  iter1: nxt=1 , curr.next=prev(null)  prev=2  curr=1
//  iter2: nxt=null, curr.next=2        prev=1  curr=null  (reversed head=1)
// -----------------------------------------------------------

import java.util.*;

public class pallindrome {

	// Node definition kept private to this file to avoid name clashes
	private static class Node {
		int data;
		Node next;
		Node(int d) { data = d; }
	}

	// Insert at tail to preserve input order
	private static Node insertTail(Node head, int val) {
		Node nn = new Node(val);
		if (head == null) return nn;
		Node t = head;
		while (t.next != null) t = t.next;
		t.next = nn;
		return head;
	}

	// Reverse list starting at head; return new head
	private static Node reverse(Node head) {
		Node prev = null, curr = head;
		while (curr != null) {
			Node nxt = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nxt;
		}
		return prev;
	}

	// Check palindrome
	private static boolean isPalindrome(Node head) {
		if (head == null || head.next == null) return true; // 0 or 1 node

		// 1. Find middle (slow will stop at mid for odd length)
		Node slow = head, fast = head;
		while (fast.next != null && fast.next.next != null) { // moves until fast near end
			slow = slow.next;
			fast = fast.next.next;
		}

		// 2. Reverse second half (slow.next is start of second half)
		Node secondStart = reverse(slow.next);
		Node secondHead = secondStart; // keep pointer to restore later

		// 3. Compare halves
		Node p1 = head, p2 = secondStart;
		boolean ok = true;
		while (p2 != null) { // second half length <= first half
			if (p1.data != p2.data) { ok = false; break; }
			p1 = p1.next;
			p2 = p2.next;
		}

		// 4. Restore list (optional, good practice)
		slow.next = reverse(secondHead);

		return ok;
	}

	// Utility: print list
	private static void printList(Node head) {
		for (Node t = head; t != null; t = t.next) {
			System.out.print(t.data + (t.next != null ? "->" : ""));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter list values (end with -1):");
		Node head = null;
		while (true) {
			int v = sc.nextInt();
			if (v == -1) break;
			head = insertTail(head, v);
		}
		System.out.print("List: ");
		printList(head);
		boolean pal = isPalindrome(head);
		System.out.println(pal ? "Palindrome" : "Not Palindrome");
		sc.close();
	}
}
                