package m1.examen_final.tache2;

public abstract class Fruit {

    private long value;

    private String origin;

    private Ticket ticket;

    public Fruit(long value, String origin,Ticket ticket) {
        this.value = value;
        this.origin = origin;
        this.ticket = ticket;
    }

    public long getValue() {
        if (this.ticket == null){
            return value;
        }else {
            return ticket.getValue();
        }
    }

    public void setValue(long value) {
        this.value = value;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

}