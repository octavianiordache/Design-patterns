package mybook;

import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private final String titlulCapitolului;
    private final List<SubChapter> listaSubCapitole;

    public Chapter(String titlulCapitolului) {
        this.titlulCapitolului = titlulCapitolului;
        listaSubCapitole = new ArrayList<>();
    }

    public void print() {
        System.out.println(titlulCapitolului);
    }

    public int createSubChapter(String numeleSubCapitolului) {
        listaSubCapitole.add(new SubChapter(numeleSubCapitolului));
        return listaSubCapitole.size() - 1;
    }

    public SubChapter getSubChapter(int indexulSubCapitolului) {
        return listaSubCapitole.get(indexulSubCapitolului);
    }
}