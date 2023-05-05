package m1.examen_final.tache2;

public class Banana extends Fruit {


    static final private long value = 3;


    public Banana(String origin) {
        super(value,origin,null);
    }

    public Banana(String origin,Ticket ticket) {
        super(value,origin,null);
    }

    @Override
    public String toString() {
        return "Banana " + getOrigin() + " " + getValue()/100+"."+getValue()%100 ;
    }
}