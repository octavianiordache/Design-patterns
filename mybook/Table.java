package mybook;

import java.util.ArrayList;
import java.util.List;

public class Table implements Element {
	 private final String numeleTabelei;
	    private final List<Element> listaTabele;

	    public Table(String numeleTabelei) {
	        this.numeleTabelei = numeleTabelei;
	        this.listaTabele = new ArrayList<>();
	    }

	    @Override
	    public void print() {
	        System.out.println("Table with Title: " + numeleTabelei);
	    }

	    @Override
	    public void add(Element element) {
	        listaTabele.add(element);
	    }

	    @Override
	    public void remove(Element element) {
	        listaTabele.remove(element);

	    }

	    @Override
	    public Element get(int indexulElementului) {
	        return listaTabele.get(indexulElementului);
	    }

		@Override
		public void accept(Visitor visitor) {
			visitor.visitTable(this);
			for(Element e: this.listaTabele)
			{
				e.accept(visitor);
			}
		}
}