package Test;

public class Main {
    public static void main(String[] args) {
            Comanda c= new Comanda("1");
            Salate salad= new Salate("Caesar", 5);
            Pizza pizza= new Pizza("Diavola", 25);
            c.add(salad);
            c.add(pizza);
            c.print();
    }
}