package m1.examen_final.tache2;

public class Main {

    public static void main(String[] args) {
        Basket b = new Basket();

        Orange orange1 = new Orange(22, "France");
        Orange orange2 = new Orange(40, "Espagne",5);
        Orange orange3 = new Orange(10, "Espagne");

        Banana banana1 = new Banana("Belgique");

        b.addFruit(orange1);
        b.addFruit(orange2);
        b.addFruit(orange3);

        b.addFruit(banana1);

        System.out.println(b);

        b.boycottOrigin("France");
        System.out.println(b);

        System.out.println(b.SumBasket());

    }
}
