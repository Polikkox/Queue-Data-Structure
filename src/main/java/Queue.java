

public class Queue <E> {

    private Node head;
    private Node tail;

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

    }

    public Object dequeue(){
        Object holdTempValue =  this.head.getValue();
        this.head = head.getNextNode();
        return holdTempValue;
    }

    public Object peek(){
        return this.head.getValue();
    }
}
