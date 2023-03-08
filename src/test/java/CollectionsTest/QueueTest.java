package CollectionsTest;

import Lecture_Code.Collections.Queue.Queue;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class QueueTest {
    private Queue<Integer> queue;

    @BeforeEach
    void setUp(){
        this.queue = new Queue<>();
    }
    @Test
    @Order(1)
    public void testChecksEmptyQueue() {
        assertTrue(this.queue.isEmpty());
    }
    @Test
    @Order(2)
    public void testChecksEnqueue() {
        this.queue.enqueue(1);
        this.queue.enqueue(2);
        assertEquals(2, this.queue.size());
    }

    @Test
    @Order(3)
    public void testChecksDequeue() {
        this.queue.enqueue(3);
        this.queue.enqueue(4);
        assertEquals(3, this.queue.dequeue());
    }
    @Test
    @Order(4)
    public void testChecksEnqueueAndDequeue(){
        this.queue.enqueue(5);
        this.queue.enqueue(3);
        this.queue.enqueue(8);
        assertEquals(3, this.queue.size());

        assertEquals(5, this.queue.dequeue());
        assertEquals(3, this.queue.dequeue());
        assertEquals(8, this.queue.dequeue());
        assertEquals(0, this.queue.size());
    }
    @Test
    @Order(4)
    public void testChecksException(){
        assertThrows(IndexOutOfBoundsException.class, () -> this.queue.dequeue());
    }

    @AfterEach
    void tearDown(){
        this.queue = null;
    }
}
