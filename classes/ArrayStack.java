public class ArrayStack implements Stack {
    private static final int capacity = 100;
    double[] Array = new double[capacity];
    private int top;
    
    public ArrayStack(){
        for (int i=0; i<=capacity-1; i++){
            Array[i] = -Double.MAX_VALUE;
        }
        top=-1;
    }
    
    public int size() {
        return top + 1;
    }
    
    public boolean isEmpty(){
        if (top==-1)
            return true;
        else
            return false;
    }
    
    public boolean isFull(){
        for (int i=0; i<=capacity-1; i++){
            if (Array[i]==-Double.MAX_VALUE)
                return false;
        }
        return true;
    }
    
    public double top() throws EmptyStack{
        if (isEmpty())
            throw new EmptyStack("Error: The Stack is empty.");
        return Array[top];
    }
    
    public void push(double num) throws FullStack{
        if (isFull())
            throw new FullStack("Error: The Stack is full.");
        Array[++top] = num;
    }
    
    public double pop() throws EmptyStack{
        if (isEmpty())
            throw new EmptyStack("Error: The Stack is empty.");
        return Array[top--];
    }
    
    public String toString(){
        String s="";
        for (int i=0; i<=top; i++)
            s += " | " + Array[i];
        return s + " | ";
    }
    
}
