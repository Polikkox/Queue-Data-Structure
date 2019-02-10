import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    private Queue queue;

    @BeforeEach
    public void createInstanceOfClass(){
        this.queue = new Queue();

        assertNotNull(queue);
    }

    @Test
    public void testPeekReturnItemInQueueAfterEnqueueElement(){
        String expected = "test";
        this.queue.enqueue(expected);

        assertEquals(expected, this.queue.peek());
    }

    @Test
    public void testPeekReturnFirstItemInQueueAfterEnqueueThreeElements(){
        String expected = "test";
        String expected2 = "test2";
        String expected3 = "test3";

        this.queue.enqueue(expected);
        this.queue.enqueue(expected2);
        this.queue.enqueue(expected3);

        assertEquals(expected, this.queue.peek());
    }

    @Test
    public void testDequeueOneElement(){
        String expected = "test";
        this.queue.enqueue(expected);

        assertEquals(expected, this.queue.dequeue());
    }

    @Test
    public void testDequeueThreeElement(){
        String expected = "test";
        String expected2 = "test2";
        String expected3 = "test3";
        this.queue.enqueue(expected);
        this.queue.enqueue(expected2);
        this.queue.enqueue(expected3);

        assertEquals(expected, this.queue.dequeue());
        assertEquals(expected2, this.queue.dequeue());
        assertEquals(expected3, this.queue.dequeue());
    }

    @Test
    public void testPeekMethodThrowExceptionIfIsEmpty(){
        assertThrows(QueueIsEmptyException.class, ()-> this.queue.peek());
    }

    @Test
    public void testDequeueMethodThrowExceptionIfQueueIsEmpty(){
        assertThrows(QueueIsEmptyException.class, ()-> this.queue.dequeue());
    }

    @Test
    public void testIsEmptyMethodReturnTrue(){
        assertTrue(this.queue.isEmpty());
    }

    @Test
    public void testIsEmptyMethodReturnFalse(){
        this.queue.enqueue("test");
        assertFalse(this.queue.isEmpty());
    }
}