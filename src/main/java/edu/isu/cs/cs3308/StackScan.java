package edu.isu.cs.cs3308;

import edu.isu.cs.cs3308.structures.Queue;
import edu.isu.cs.cs3308.structures.Stack;
import edu.isu.cs.cs3308.structures.impl.LinkedQueue;
import edu.isu.cs.cs3308.structures.impl.LinkedStack;

/**
 *
 * @author Isaac Griffith
 * @author
 */
public class StackScan {

    /**
     * Tests whether the given stack contains the provided element.
     * Implementation should use a queue to scan the stack and reconstruct it
     * when done.
     *
     * @param <E> Type of elements stored in the stack
     * @param stack Stack to be scanned.
     * @param element Element to search the stack for.
     * @return True if the given stack is not null and contains the given
     * element. Returns false if both the stack and element are not null and the
     * stack does not contain the element, if either the stack or element is
     * null, or if the stack is emtpy.
     */
    public static <E> boolean scanStack(final Stack<E> stack, E element) {
        boolean wasFound = false;
        if(stack == null || stack.isEmpty() || element == null)
        {
            return wasFound;
        }
        else
        {
            LinkedStack<E> temp = new LinkedStack<>();
            while(!stack.isEmpty())
            {
                E val = stack.pop();
                temp.push(val);
                if(val == element)
                {
                    wasFound = true;
                }
            }
            while(!temp.isEmpty())
            {
                E val = temp.pop();
                stack.push(val);
            }
        }
        return wasFound;
    }
}
