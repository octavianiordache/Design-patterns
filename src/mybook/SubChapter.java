package mybook;

import java.util.ArrayList;
import java.util.List;

public class SubChapter implements Element {
    private final String numeleSubcapitolului;
    private final List<Element> listaElemente;

    public SubChapter(String numeleSubcapitolului) {
        this.numeleSubcapitolului = numeleSubcapitolului;
        listaElemente = new ArrayList<>();
    }

    public void createNewParagraph(String numeleParagrafului) {
        listaElemente.add(new Paragraph(numeleParagrafului));
    }

    public void createNewImage(String numeleImaginii) {
        listaElemente.add(new Image(numeleImaginii));
    }

    public void createNewTable(String numeleTabelei) {
        listaElemente.add((Element) new Table(numeleTabelei));
    }

    public void print() {
        System.out.println("Subchapter: " + numeleSubcapitolului);
        listaElemente.forEach(Element::print);
    }

	@Override
	public void add(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Element element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Element get(int indexulElementului) {
		// TODO Auto-generated method stub
		return null;
	}

	
}