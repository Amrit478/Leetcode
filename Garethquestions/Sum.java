/* Java Program to implement a stack using
two queue */
import java.util.*;

class Sum {

    static class Stack {
        
        // Two inbuilt queues
        static Queue<Integer> amrit = new LinkedList<Integer>();
        static Queue<Integer> amrits = new LinkedList<Integer>();

        // To maintain current number of
        // elements
        static int curr_size;

        static void push(int x)
        {
            amrits.add(x);
        
            // Push all the remaining elements of amrit to amrits
            while (!amrit.isEmpty()) {
                amrits.add(amrit.peek());
                amrit.remove();
            }
        
            // Swap amrit and amrits
            Queue<Integer> q = amrit;
            amrit = amrits;
            amrits = q;
        }

        static void pop()
        {

            // if no elements are there in q1
            if (amrit.isEmpty())
                return;
            amrit.remove();
        }

        static int top()
        {
            if (amrit.isEmpty())
                return -1;
            return amrit.peek();
        }

        static int size() { return amrit.size(); }
    }

    // driver code
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }
}

