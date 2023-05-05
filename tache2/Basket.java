package m1.examen_final.tache2;

import java.util.ArrayList;

public class Basket {


    static private int GId= 1;
    private int id;

    private ArrayList<Fruit> contenue;

    public Basket(){
        this.id = GId;
        GId++;
        this.contenue = new ArrayList<Fruit>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        var ret = "Basket id - ";
        ret += id;
        ret += " [\n";
        for (Fruit fruit:
             contenue) {
            ret += fruit+"\n";
        }
        ret+= "]";


        return ret;
    }

    public void boycottOrigin(String Origin) {

        for (int i = 0; i < contenue.size();) {
            if (contenue.get(i).getOrigin() == Origin){
                contenue.remove(i);
            }else {
                i++;
            }
        }

    }

    public void addFruit(Fruit fruit) {
        this.contenue.add(fruit);
    }

    public long SumBasket(){
        long ret = 0;

        for (Fruit fruit:
             this.contenue) {
            System.out.println(ret);
            ret+= fruit.getValue();
            System.out.println(fruit.getValue());
        }
        return  ret;
    }

}