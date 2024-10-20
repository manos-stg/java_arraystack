# ArrayStack Implementation in Java

This repository contains a Java implementation of a stack data structure using an array. The `ArrayStack` class adheres to the standard stack operations, including push, pop, and peek (top). It is designed to hold double values and provides methods to check if the stack is empty or full, as well as to retrieve the current size of the stack.

## Features

- **Capacity**: The stack can hold up to 100 double values.
- **Basic Operations**:
  - **push**: Adds a new element to the top of the stack.
  - **pop**: Removes and returns the top element of the stack.
  - **top**: Returns the top element without removing it.
  - **size**: Returns the number of elements currently in the stack.
  - **isEmpty**: Checks if the stack is empty.
  - **isFull**: Checks if the stack has reached its maximum capacity.
  
## Exception Handling

The implementation includes custom exception handling for empty and full stack conditions:
- **EmptyStack**: Thrown when trying to pop or access the top element of an empty stack.
- **FullStack**: Thrown when trying to push an element onto a full stack.

## Usage

Here is an example of how to use the `ArrayStack` class:

```java
public class TestStack {
    public static void main(String[] args){
        ArrayStack stack = new ArrayStack();

        try {
            stack.push(10.5);
            System.out.println("Top element: " + stack.top()); // Outputs: 10.5
            System.out.println("Stack size: " + stack.size()); // Outputs: 1
            
            stack.push(20.5);
            System.out.println("Popped element: " + stack.pop()); // Outputs: 20.5
            System.out.println("Is stack empty? " + stack.isEmpty()); // Outputs: false

            // Attempt to pop more elements than available
            stack.pop();
            stack.pop(); // This will throw EmptyStack exception
            
        } catch (FullStack e) {
            System.out.println(e.getMessage());
        } catch (EmptyStack e) {
            System.out.println(e.getMessage());
        }
        
    }
}
```
