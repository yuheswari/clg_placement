import java.util.*;

// Menu-driven Priority Queue (max-heap) with stable ordering for equal priorities
// File: stack/priority.java | Run from the stack folder: java priority
public class priority {
	// Node with priority and payload; stable on same priority using seq
	private static class Node implements Comparable<Node> {
		final int priority;
		final long seq;      // insertion order for stability
		final String value;

		Node(int priority, long seq, String value) {
			this.priority = priority;
			this.seq = seq;
			this.value = value;
		}

		// Higher priority first; if equal, earlier seq first
		@Override
		public int compareTo(Node other) {
			int byPriorityDesc = Integer.compare(other.priority, this.priority);
			if (byPriorityDesc != 0) return byPriorityDesc;
			return Long.compare(this.seq, other.seq);
		}

		@Override
		public String toString() {
			return "[p=" + priority + ", v='" + value + "']";
		}
	}

	private final PriorityQueue<Node> pq = new PriorityQueue<>();
	private long seq = 0; // increasing insertion counter

	private void enqueue(String value, int pr) {
		pq.add(new Node(pr, seq++, value));
	}

	private Node dequeue() {
		return pq.poll();
	}

	private Node peek() {
		return pq.peek();
	}

	private int size() {
		return pq.size();
	}

	private boolean isEmpty() {
		return pq.isEmpty();
	}

	private void printAll() {
		if (pq.isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		// Non-destructive print using a copy
		PriorityQueue<Node> copy = new PriorityQueue<>(pq);
		List<Node> items = new ArrayList<>();
		while (!copy.isEmpty()) items.add(copy.poll());
		System.out.println(items);
	}

	private static int readInt(Scanner sc, String prompt) {
		while (true) {
			System.out.print(prompt);
			if (sc.hasNextInt()) return sc.nextInt();
			System.out.println("Please enter a valid integer.");
			sc.next();
		}
	}

	private static String readLine(Scanner sc, String prompt) {
		System.out.print(prompt);
		String line = sc.nextLine();
		if (line.isEmpty()) line = sc.nextLine(); // handle leftover newline
		return line;
	}

	private static void printMenu() {
		System.out.println();
		System.out.println("Priority Queue - Menu (max-heap)");
		System.out.println("1) Enqueue (value, priority)");
		System.out.println("2) Dequeue (remove highest priority)");
		System.out.println("3) Peek (view highest priority)");
		System.out.println("4) Size");
		System.out.println("5) Is Empty");
		System.out.println("6) Print All (non-destructive)");
		System.out.println("0) Exit");
	}

	public static void main(String[] args) {
		priority app = new priority();
		Scanner sc = new Scanner(System.in);

		System.out.println("Priority Queue (max-heap) ready. Enter choices as shown.");
		while (true) {
			printMenu();
			int choice = readInt(sc, "Choose: ");
			switch (choice) {
				case 1: {
					String value = readLine(sc, "Enter value (text): ");
					int pr = readInt(sc, "Enter priority (integer, higher = sooner): ");
					app.enqueue(value, pr);
					System.out.println("Enqueued: " + value + " with priority " + pr);
					break;
				}
				case 2: {
					Node x = app.dequeue();
					if (x == null) System.out.println("Queue is empty");
					else System.out.println("Dequeued: " + x);
					break;
				}
				case 3: {
					Node x = app.peek();
					if (x == null) System.out.println("Queue is empty");
					else System.out.println("Peek: " + x);
					break;
				}
				case 4:
					System.out.println("Size: " + app.size());
					break;
				case 5:
					System.out.println(app.isEmpty() ? "Empty" : "Not Empty");
					break;
				case 6:
					app.printAll();
					break;
				case 0:
					System.out.println("Goodbye.");
					sc.close();
					return;
				default:
					System.out.println("Invalid choice. Try again.");
			}
		}
	}
}

