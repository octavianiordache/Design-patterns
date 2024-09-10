package Test;

public interface Element {

    void print();

    void add(Element element);

    void remove(Element element);

    Element get(int indexulElementului);

    void accept(Visitor visitor);
}
