

public class Queue <E> {

    private Node head;
    private Node tail;
    private int size = 0;

    @SuppressWarnings({"unchecked"})
    public void enqueue (E value){
        if(head == null){
            this.head = new Node(value);
            this.tail = head;
        }
        else{
            while (this.tail.getNextNode() != null){
                this.tail = this.tail.getNextNode();
            }
            this.tail.setNextNode(new Node(value));
        }
    this.size++;
    }

    public Object dequeue(){
        if(isEmpty()){
            throw new QueueIsEmptyException("Queue is empty");
        }

        Object holdTempValue =  this.head.getValue();
        this.head = head.getNextNode();
        this.size--;
        return holdTempValue;
    }

    public Object peek(){
        if(isEmpty()){
            throw new QueueIsEmptyException("Queue is empty");
        }
        return this.head.getValue();
    }

    public int queueSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.head == null;
    }
}
