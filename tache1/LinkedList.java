package m1.examen_final.tache1;

import java.util.NoSuchElementException;

public class LinkedList {
    private m1.examen_final.tache1.Node first; //can be called head
    private m1.examen_final.tache1.Node last; //can be called tail


    public LinkedList() {
        this.first = null;
        this.last = null;
    }

    public int getFirst() {
        return first.getValue();
    }

    public int getLast() {
        return last.getValue();
    }

    public void addFirst(int value){
        if (first == null) {
            this.first = new Node(last,value,null);
            if (last != null)
                this.last.setNext(first);
        }else {
            this.first.setNext(new Node(first,value,null));
            this.first = first.getNext();
        }
    }

    public void addLast(int value){
        if (last == null) {
            this.last = new Node(null,value, first);
            if (first != null)
                this.first.setPrevious(last);
        }else {
            this.last.setPrevious(new Node(null,value,last));
            this.last = last.getPrevious();
        }
    }

    public void deleteFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        } else {
            this.first = this.first.getPrevious();
            if (first != null)
                this.first.setNext(null);
        }
    }

    public void deleteLast(){
        if (last == null){
            throw new NoSuchElementException();
        }else {
            this.last = this.last.getNext();
            if (last != null)
                this.last.setPrevious(null);
        }
    }

    public int indexOf(int value){
        var index = 0;
        for(Node i = this.first; i != null; i = i.getPrevious() ){
            if (i.getValue() == value){
                return index;
            }
            index++;
        }
        return -1;
    }

    public boolean contains(int value){
        return indexOf(value) != -1;
    }
}
