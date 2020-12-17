public class PriorityQueue {
    private Integer[] heap;
    private static final int MAX_SIZE = 100;
    private static int size = 0;

    public PriorityQueue() {
        heap = new Integer[MAX_SIZE];
    }

    public int peek() {
        return heap[0];
    }

    public void insert(int priority) {
        heap[size] = priority;
        bubbleUp(size);
        size++;
    }

    private void bubbleUp(int size) {
        int parent = (size - 1) / 2;

        if (heap[parent] > heap[size]) {
            int temp = heap[parent];
            heap[parent] = heap[size];
            heap[size] = temp;
            bubbleUp(parent);
        }
    }

    public int delete() {
        int temp = heap[0];		// store
        heap[0] = heap[size - 1];	// override root w/ last item
        size--;						// remove last item
        bubbleDown(0);				// call bubble down w root

        return temp;				// return old root
    }

    private void bubbleDown(int i) {
        Integer leftChild = i * 2 + 1;
        Integer rightChild = i * 2 + 2;

        if (leftChild == null && rightChild == null) {
            return;		// nothing is broken
        } else if (leftChild != null && rightChild == null) {
            if (heap[i] > heap[leftChild]) {
                int temp = heap[rightChild];
                heap[rightChild] = heap[i];
                heap[i] = temp;
                bubbleDown(rightChild);
            }
        } else if(leftChild != null && rightChild != null	) {
            int min = 0;

            if (heap[leftChild] <= heap[rightChild]) {
                min = leftChild;
            } else {
                min = rightChild;
            }

            if (heap[i] > heap[min]) {
                int temp = heap[min];
                heap[min] = heap[i];
                heap[i] = temp;
                bubbleDown(min);
            }
        }
    }
}