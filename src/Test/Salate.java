package Test;

import java.util.ArrayList;
import java.util.List;

public class Salate implements Element {
    private final String nume;
    private final int pret;

    private final List<Element> listaSalate;
    public Salate(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
        this.listaSalate = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Salate: " + listaSalate);
    }

    @Override
    public void add(Element element) {
            listaSalate.add(element);
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
        visitor.visitSalate(this);
        for(Element e: this.listaSalate)
        {
            e.accept(visitor);
        }
    }
}
