package dsalabexam;
public class StackUsingArray {
    int maxSize;
    int top;
    int[] numArray;

    StackUsingArray(int size){
        maxSize = size;
        top = -1;
        numArray = new int[maxSize];
    }

    void push(int value) {
        if(top < maxSize - 1) {
            numArray[++top] = value;
        }
        else {
            System.out.println("Stack is full.");
        }
    }

    public static void main(String[] args) {
        StackUsingArray numStack = new StackUsingArray(5);
        numStack.push(6);
        numStack.push(12);
        numStack.push(5);
        numStack.push(9);
        numStack.push(21);
        for (int i = 0; i < numStack.maxSize; i++) {
            System.out.println(numStack.numArray[i]);
        }
    }
}
