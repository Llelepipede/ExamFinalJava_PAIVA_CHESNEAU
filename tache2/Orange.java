package m1.examen_final.tache2;

import java.security.InvalidParameterException;

public class Orange extends Fruit {

    private int seedsLevel;

    public Orange(long value, String origin, int seedsLevel) {
        super(value, origin,null);

        if (seedsLevel*0.5>value/2){
            throw new InvalidParameterException();
        }else {
            this.seedsLevel = seedsLevel;
        }

    }
    public Orange(long value, String origin) {
        super(value, origin, null);
        this.seedsLevel = 0;
    }
    public Orange(long value, String origin,Ticket ticket) {
        super(value, origin,ticket);
        this.seedsLevel = 0;
    }


    public Orange(long value, String origin,Ticket ticket, int seedsLevel) {
        super(value, origin,ticket);

        if (seedsLevel*0.5>value/2){
            throw new InvalidParameterException();
        }else {
            this.seedsLevel = seedsLevel;
        }
    }

    @Override
    public long getValue() {
        return super.getValue()-seedsLevel;
    }

    // overide signifie que cette fonction "ecrase" une focntion
    // deja existante ayant la meme definition.
    @Override
    public String toString() {
        return "Orange " + getOrigin() + " " +getValue()/100+"."+getValue()%100;
    }

    public boolean equals(Orange orange) {
        if(this == orange)
            return true;

        if (!(orange instanceof Orange))
            return false;

        Orange other = orange;
        return this.getValue() == other.getValue() && this.getOrigin() == other.getOrigin();
    }
}