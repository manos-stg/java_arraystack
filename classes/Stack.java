public interface Stack {
    public int size();
    public boolean isEmpty();
    public double top() throws EmptyStack;
    public void push(double num) throws FullStack;
    public double pop() throws EmptyStack;
}
