package Test;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements Element{
    private final String nume;
    private final int pret;

    private final List<Element> listaPizza;
    public Pizza(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
        this.listaPizza = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Pizza: " +  listaPizza);
    }

    @Override
    public void add(Element element) {
            listaPizza.add(element);
    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int indexulElementului) {
        return null;
    }

    @Override
    public void accept(Visitor visitor) {
            visitor.visitPizza(this);
            for(Element e: this.listaPizza)
            {
                e.accept(visitor);
            }
    }
}
