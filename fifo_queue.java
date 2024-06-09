package FIFO;
		
		import java.util.LinkedList;
		import java.util.Queue;

		public class fifo_queue {
		    private Queue<Integer> queue;

		    public fifo_queue() {
		        queue = new LinkedList<>();
		    }

		    public boolean isEmpty() {
		        return queue.isEmpty();
		    }

		    public void enqueue(int item) {
		        queue.add(item);
		    }

		    public int dequeue() {
		        if (isEmpty()) {
		            throw new IllegalStateException("Queue is empty");
		        }
		        return queue.poll();
		    }

		    public int peek() {
		        if (isEmpty()) {
		            throw new IllegalStateException("Queue is empty");
		        }
		        return queue.peek();
		    }

		    public static void main(String[] args) {
		    	fifo_queue queue = new fifo_queue();
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
