package adil.datastructure;

//Java implementation of Min Heap 
public class MinHeap { 
	private int[] Heap; 
	private int size; 
	private int maxsize; 

	private static final int FRONT = 0; 

	public MinHeap(int maxsize) 
	{ 
		this.maxsize = maxsize; 
		this.size = 0; 
		Heap = new int[this.maxsize + 1]; 
		//Heap[0] = Integer.MIN_VALUE; 
	} 

	// Function to return the position of 
	// the parent for the node currently 
	// at pos 
	private int parent(int pos) 
	{ 
		return (pos-1) / 2; 
	} 

	// Function to return the position of the 
	// left child for the node currently at pos 
	private int leftChild(int pos) 
	{ 
		return (2 * pos)+1; 
	} 

	// Function to return the position of 
	// the right child for the node currently 
	// at pos 
	private int rightChild(int pos) 
	{ 
		return (2 * pos) + 2; 
	} 

	// Function that returns true if the passed 
	// node is a leaf node 
	private boolean isLeaf(int pos) 
	{ 
		if (pos >= (size / 2) && pos <= size) { 
			return true; 
		} 
		return false; 
	} 

	// Function to swap two nodes of the heap 
	private void swap(int fpos, int spos) 
	{ 
		int tmp; 
		tmp = Heap[fpos]; 
		Heap[fpos] = Heap[spos]; 
		Heap[spos] = tmp; 
	} 

	// Function to heapify the node at pos 
	private void minHeapify(int pos) 
	{ 

		// If the node is a non-leaf node and greater 
		// than any of its child 
		if (!isLeaf(pos)) { 
			if (Heap[pos] > Heap[leftChild(pos)] 
				|| Heap[pos] > Heap[rightChild(pos)]) { 

				// Swap with the left child and heapify 
				// the left child 
				if (Heap[leftChild(pos)] < Heap[rightChild(pos)]) { 
					swap(pos, leftChild(pos)); 
					minHeapify(leftChild(pos)); 
				} 

				// Swap with the right child and heapify 
				// the right child 
				else { 
					swap(pos, rightChild(pos)); 
					minHeapify(rightChild(pos)); 
				} 
			} 
		} 
	} 

	// Function to insert a node into the heap 
	public void insert(int element) 
	{ 
		Heap[size++] = element; 
		int current = size-1; 

		while (Heap[current] < Heap[parent(current)]) { 
			swap(current, parent(current)); 
			current = parent(current); 
		} 
	} 

	// Function to print the contents of the heap 
	public void print() 
	{ 
		for (int i = 0; i <= (size / 2) -1; i++) { 
			System.out.print(" PARENT : " + Heap[i] 
					+ " LEFT CHILD : " + Heap[2 * i+1] 
				+ " RIGHT CHILD :" + Heap[2 * i + 2]); 
			System.out.println(); 
		} 
	} 

	// Function to build the min heap using 
	// the minHeapify 
	public void minHeap() 
	{ 
		for (int pos = ((Heap.length-1) / 2); pos >= 0; pos--) { 
			minHeapify(pos); 
		} 
	} 

	private int kthLargestElement() {
		int k=7;
		
		// TODO Auto-generated method stub
		for (int i = 1;  i<k; i++) { 
			swap(0, size); 
			minHeapify(0); 
			size--;
		}
		return Heap[0];
	} 
	// Function to remove and return the minimum 
	// element from the heap 
	public int remove() 
	{ 
		int popped = Heap[FRONT]; 
		Heap[FRONT] = Heap[size--]; 
		minHeapify(FRONT); 
		return popped; 
	} 

	// Driver code 
	public static void main(String[] arg) 
	{ 
		System.out.println("The Min Heap is "); 
		MinHeap minHeap = new MinHeap(9); 
		minHeap.insert(5); 
		minHeap.insert(3); 
		minHeap.insert(17); 
		minHeap.insert(10); 
		minHeap.insert(84); 
		minHeap.insert(19); 
		minHeap.insert(6); 
		minHeap.insert(22); 
		minHeap.insert(9); 
		minHeap.minHeap(); 

		minHeap.print(); 
	//	System.out.println("The Min val is " + minHeap.remove()); 
		
		int element=minHeap.kthLargestElement();
		System.out.println("Smallest kth element: "+element);
	}

} 
