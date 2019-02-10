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
    public void testAddOneItemToQueue(){
        String value = "test";

        this.queue.enqueue(value);
        assertEquals(value, this.queue.peek());
    }

    @Test
    public void testAddThreeItemsToQueue(){
        String value = "test";
        String value2 = "test2";
        String value3 = "test3";

        this.queue.enqueue(value);
        this.queue.enqueue(value2);
        this.queue.enqueue(value3);
        assertEquals(value, this.queue.peek());
    }

    @Test
    public void testDequeueOneElement(){
        String value = "test";
        this.queue.enqueue(value);
        assertEquals(value, this.queue.dequeue());
    }

    @Test
    public void testDequeueThreeElement(){
        String value = "test";
        String value2 = "test2";
        String value3 = "test3";
        this.queue.enqueue(value);
        this.queue.enqueue(value2);
        this.queue.enqueue(value3);
        assertEquals(value, this.queue.dequeue());
        assertEquals(value2, this.queue.dequeue());
        assertEquals(value3, this.queue.dequeue());
    }
}