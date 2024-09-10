package Test;

import java.util.ArrayList;
import java.util.List;

public class Comanda implements Element{
    private final String id;
    private final List<Element> listaElement;


    public Comanda(String id) {
        this.id = id;
        this.listaElement = new ArrayList<>();
    }

    @Override
    public void print() {
        System.out.println("id ul comenzii: " +id);
        System.out.println(listaElement);
    }

    @Override
    public void add(Element element) {
        listaElement.add(element);
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

    }
}
