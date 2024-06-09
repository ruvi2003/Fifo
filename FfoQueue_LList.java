package FIFO;
		
		class Node {
		    int data;
		    Node next;

		    public Node(int data) {
		        this.data = data;
		        this.next = null;
		    }
		}

		public class FfoQueue_LList {
		    private Node front;
		    private Node rear;

		    public FfoQueue_LList() {
		        front = rear = null;
		    }

		    public boolean isEmpty() {
		        return front == null;
		    }

		    public void enqueue(int item) {
		        Node newNode = new Node(item);
		        if (rear == null) {
		            front = rear = newNode;
		        } else {
		            rear.next = newNode;
		            rear = newNode;
		        }
		    }

		    public int dequeue() {
		        if (isEmpty()) {
		            throw new IllegalStateException("Queue is empty");
		        }
		        int item = front.data;
		        front = front.next;
		        if (front == null) {
		            rear = null;
		        }
		        return item;
		    }

		    public int peek() {
		        if (isEmpty()) {
		            throw new IllegalStateException("Queue is empty");
		        }
		        return front.data;
		    }

		    public static void main(String[] args) {
		    	FfoQueue_LList queue = new FfoQueue_LList();
		        queue.enqueue(20);
		        queue.enqueue(30);
		        queue.enqueue(40);
		        System.out.println(queue.dequeue()); 
		        System.out.println(queue.peek());    
		        queue.enqueue(50);
		        queue.enqueue(60);
		        while (!queue.isEmpty()) {
		            System.out.println(queue.dequeue());
		        }
		    }


}
