package Test;

import java.util.ArrayList;
import java.util.List;

public class Paste implements Element {
    private final String nume;
    private final int pret;

    private final List<Element> listaPaste;

    public Paste(String nume, int pret) {
        this.nume = nume;
        this.pret = pret;
        this.listaPaste = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("Paste: " + listaPaste);
    }

    @Override
    public void add(Element element) {
        listaPaste.add(element);
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
        visitor.visitPaste(this);
        for(Element e: this.listaPaste)
        {
            e.accept(visitor);
        }
    }

}
