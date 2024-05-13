package dsalabexam;

public class QueueUsingTwoStacks {
    private int[] stack1;
    private int[] stack2;
    private int top1;
    private int top2;
    private int capacity;
    private int size;

    public QueueUsingTwoStacks(int capacity) {
        this.capacity = capacity;
        this.stack1 = new int[capacity];
        this.stack2 = new int[capacity];
        this.top1 = -1;
        this.top2 = -1;
        this.size = 0;
    }

    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue item: " + item);
            return;
        }
        while (top1 >= 0) {
            stack2[++top2] = stack1[top1--];
        }
        stack1[++top1] = item;
        while (top2 >= 0) {
            stack1[++top1] = stack2[top2--];
        }
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }
        int item = stack1[top1--];
        size--;
        return item;
    }

    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1;
        }
        return stack1[top1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks(5);
        queue.enqueue(6);
        queue.enqueue(12);
        queue.enqueue(5);
        queue.enqueue(9);
        queue.enqueue(21);
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Peeked item: " + queue.peek());
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Dequeued item: " + queue.dequeue());
        System.out.println("Dequeued item: " + queue.dequeue());
    }
}



