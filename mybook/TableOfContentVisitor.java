package mybook;

public class TableOfContentVisitor implements Visitor {

    private TableOfContent toc= new TableOfContent();
    @Override
    public void visitBook(Book book) {

    }

    @Override
    public void visitSection(Section section) {
        this.toc.add(section);
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {

    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {

    }

    @Override
    public void visitImage(Image image) {

    }

    @Override
    public void visitTable(Table table) {

    }

    public TableOfContent getToc() {
        return this.toc;
    }
}
