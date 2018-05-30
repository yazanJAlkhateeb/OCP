package C$$GenericsandCollections.B$$UsingListsANDSetsANDMapsandQueues.UsingtheQueueInterface;

public class ArrayDequeImpl {
    /*An ArrayDeque is a “pure” double-ended queue. It was introduced in Java 6, and it
stores its elements in a resizable array. The main benefit of an ArrayDeque is that it is more
efficient than a LinkedList . Deque is supposed to be pronounced “deck,” but many people,
including the authors, say it wrong as “d-queue.”*/

/*Method                Description                For queue For stack
boolean add(E e)            Adds an element to the back of the queue
                            and returns true or throws an exception Yes No
E element()                 Returns next element or throws an
                            exception if empty queue Yes No
boolean offer(E e)          Adds an element to the back of the queue
                            and returns whether successful Yes No
E remove()                   Removes and returns next element or
                            throws an exception if empty queue Yes No
void push(E e)                Adds an element to the front of the queue Yes Yes
E poll()                     Removes and returns next element or
                            returns null if empty queue Yes No
E peek()                    Returns next element or returns null if
                                            empty queue Yes Yes
E pop()                     Removes and returns next element or
                               throws an exception if empty queue No Yes
*/
/*What if we want to insert an ele-
ment at the other end, just as we could with a Stack ? No problem. We just call the push()
method. It works just like offer() except at the other end of the queue. When talking
about LIFO (stack), people say push / poll / peek . When talking about FIFO (single-ended
queue), people say offer / poll / peek .*/
}
