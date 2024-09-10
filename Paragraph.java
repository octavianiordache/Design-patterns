package mybook;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element{
	 private final String numeleParagrafului;

	 private AlignStrategy alignment;
	    private final List<Element> listaParagrafe;
	    public Paragraph(String numeleParagrafului) {
	        this.numeleParagrafului = numeleParagrafului;
	        this.listaParagrafe = new ArrayList<>();
	    }

	    @Override
	    public void print() {
	        if(this.alignment==null)
				System.out.println("Paragraph: " + numeleParagrafului);
			else
				this.alignment.render(this.numeleParagrafului);
	    }

	    @Override
	    public void add(Element element) {
	        listaParagrafe.add(element);
	    }

	    @Override
	    public void remove(Element element) {
	        listaParagrafe.remove(element);

	    }

	    @Override
	    public Element get(int indexulElementului) {
	        return listaParagrafe.get(indexulElementului);
	    }

	public void setAlignStrategy(AlignStrategy alignment) {
			this.alignment=alignment;
	}
}
