package FIFO;

public class FifoQueue_Array {

		    private int[] queue;
		    private int front;
		    private int rear;
		    private int size;
		    private int capacity;

		    public FifoQueue_Array(int capacity) {
		        this.capacity = capacity;
		        queue = new int[capacity];
		        front = 0;
		        rear = -1;
		        size = 0;
		    }

		    public boolean isEmpty() {
		        return size == 0;
		    }

		    public boolean isFull() {
		        return size == capacity;
		    }

		    public void enqueue(int item) {
		        if (isFull()) {
		            throw new IllegalStateException("Queue is full");
		        }
		        rear = (rear + 1) % capacity;
		        queue[rear] = item;
		        size++;
		    }

		    public int dequeue() {
		        if (isEmpty()) {
		            throw new IllegalStateException("Queue is empty");
		        }
		        int item = queue[front];
		        front = (front + 1) % capacity;
		        size--;
		        return item;
		    }

		    public int peek() {
		        if (isEmpty()) {
		            throw new IllegalStateException("Queue is empty");
		        }
		        return queue[front];
		    }

		    public static void main(String[] args) {
		    	FifoQueue_Array queue = new FifoQueue_Array(5);
		        queue.enqueue(20);
		        queue.enqueue(10);
		        queue.enqueue(30);
		        System.out.println(queue.dequeue()); 
		        System.out.println(queue.peek());    
		        queue.enqueue(40);
		        queue.enqueue(60);
		        queue.enqueue(70);
		        while (!queue.isEmpty()) {
		            System.out.println(queue.dequeue());
		      }
	   }
	
}

