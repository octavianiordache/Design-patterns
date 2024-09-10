package mybook;

public class Author implements Element{
    private final String numeleAutorului;
    public Author(String numeleAutorului) {
        this.numeleAutorului = numeleAutorului;
    }

    public void print() {
        System.out.println("Author: " + numeleAutorului);
    }

    @Override
    public void add(Element element) {

    }

    @Override
    public void remove(Element element) {

    }

    @Override
    public Element get(int indexulElementului) {
        return null;
    }

    public void accept (Visitor visitor){

    }
}