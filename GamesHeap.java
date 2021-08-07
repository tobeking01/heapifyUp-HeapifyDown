import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * 
 * @author Tobechi Onwenu
 * Heap Class using key value heap with an array
 *
 */

public class GamesHeap {
	private Games[] heap;
	private int numItems;

	public GamesHeap(int maxItems) {
		heap = new Games[maxItems];
		numItems = 0;
	}

	// insert games
	public void insert(Games elementToAdd) {
		heap[numItems++] = elementToAdd;
		heapifyUp(numItems - 1);
	}

	// Size of games list
	public int size() {
		return numItems;
	}

	// search based on name
	public Games search(String target) {
		for (int i = 0; i < numItems; i++) {
			if (heap[i].getGameName().compareToIgnoreCase(target) == 0) {
				return heap[i];
			}
		}
		return null;
	}

	public boolean countains(Games object) {
		for (int i = 0; i < numItems; i++) {
			if (heap[i].equals(object)) {
				return true;
			}
		}
		return false;
	}

	public double total() {
		double result = 0;
		for (int i = 0; i < numItems; i++) {
			result += heap[i].getPrice();
		}
		return result;
	}

	public double average() {
		double total = total();
		double avg = total / numItems;
		return avg;
	}

	public int positionOf(Games search) {
		int count = 0;
		for (int i = 0; i < numItems; i++) {
			if (search.equals(heap[i])) {
				return count;
			}
			count++;
		}
		return -1;
	}

	// Delete only the head
	public Games poll() {
		Games output = heap[0];
		heap[0] = heap[numItems - 1];
		numItems--;
		heapifyDown(0);
		return output;
	}

	// delete any item
	public Games delete(int index) {
		Games head = heap[0];
		heap[index] = heap[numItems - 1];
		heap[0] = heap[index];
		numItems--;
		heapifyDown(0);
		return head;
	}

	public String toString() {
		String temp = "";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		temp += String.format("%-25s %-10s %-10s %-10s\n", "Game", "Year", "Price", "Rating");
		temp += "*************************************************************************\n";
		for (int i = 0; i < numItems; i++) {
			temp += heap[i] + "\n";
		}
		temp += "\nDate and Time is: " + dtf.format(now) + "s\n";
		return temp;
	}

	private void heapifyDown(int parent) {
		int largest = parent;
		int left = leftOfParent(parent);
		int right = rightOfParent(parent);

		if (left < numItems && heap[left].compareTo(heap[largest]) > 0) {
			largest = left;
		}

		if (right < numItems && heap[right].compareTo(heap[largest]) > 0) {
			largest = right;
		}

		if (largest != parent) {
			swap(largest, parent);
			heapifyDown(largest);
		}

	}

	private void heapifyUp(int index) {
		int parentIndex = parent(index);
		if (index > 0 && heap[index].compareTo(heap[parentIndex]) > 0) {
			swap(index, parentIndex);
			heapifyUp(parentIndex);
		}

	}

	private void swap(int index1, int index2) {
		Games temp = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = temp;
	}

	private int leftOfParent(int parentIndex) {
		return 2 * parentIndex + 1;
	}

	private int rightOfParent(int parentIndex) {
		return 2 * parentIndex + 2;
	}

	private int parent(int childIndex) {
		return (childIndex - 1) / 2;
	}

}
