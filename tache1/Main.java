package m1.examen_final.tache1;

public class Main {
    public static void main(String[] args) {
        var testLiked = new LinkedList();

        testLiked.addFirst(3);
        testLiked.addFirst(11);

        System.out.println("add 3 at first");
        System.out.println("add 11 at first");
        System.out.println("first should be 11 => "+testLiked.getFirst());

        testLiked.deleteFirst();
        System.out.println("deleting the first one ...");
        System.out.println("first should be 3 => "+testLiked.getFirst());

        testLiked.addLast(9);
        testLiked.addLast(6);
        System.out.println("add 9 at last");
        System.out.println("add 6 at last");

        System.out.println("last should be 6 => "+testLiked.getLast());
        testLiked.deleteLast();
        System.out.println("deleting the last one ...");
        System.out.println("last should be 9 => "+testLiked.getLast());

        System.out.println("contains should be true  => "+testLiked.contains(3));
        System.out.println("contains should be false => "+testLiked.contains(6));

        System.out.println("indexOf should be  0 => "+testLiked.indexOf(3));
        System.out.println("indexOf should be -1 => "+testLiked.indexOf(1));
        System.out.println("indexOf should be  1 => "+testLiked.indexOf(9));

        testLiked.deleteFirst();
        testLiked.deleteFirst();
        testLiked.deleteFirst();
    }
}
