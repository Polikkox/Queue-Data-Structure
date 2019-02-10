public class Node <E> {

    private E value;
    private Node nextNode;

    public Node(E value){
        this.value = value;
    }

    public E getValue(){
        return this.value;
    }

    public Node getNextNode(){
        return this.nextNode;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }
}