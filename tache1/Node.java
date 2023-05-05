package m1.examen_final.tache1;

public class Node {
    private int value;
    private Node next;
    private Node previous;
    
    public Node(Node previous, int value, Node next){
        this.previous = previous;
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }


}
