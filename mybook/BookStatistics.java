package mybook;

public class BookStatistics implements Visitor{

    private int bookCounter;
    private int sectionCounter;
    private int tableCounter;
    private int paragraphCounter;
    private int imageCounter;

    private int imageProxyCounter;

    @Override
    public void visitBook(Book book) {
        this.bookCounter=this.bookCounter+1;
    }

    @Override
    public void visitSection(Section section) {
        this.sectionCounter=this.sectionCounter+1;
    }

    @Override
    public void visitParagraph(Paragraph paragraph) {
            this.paragraphCounter=this.paragraphCounter+1;
    }

    @Override
    public void visitImageProxy(ImageProxy imageProxy) {
        this.imageProxyCounter=this.imageProxyCounter+1;
    }

    @Override
    public void visitImage(Image image) {
        this.imageCounter=this.imageCounter+1;
    }

    @Override
    public void visitTable(Table table) {
        this.tableCounter=this.tableCounter+1;
    }

    void printStatistics(){
        int totalImagesCounter= this.imageCounter+this.imageProxyCounter;
        System.out.println("Book statistics:");
        System.out.println("***Number of images: "+ totalImagesCounter);
        System.out.println("***Number of paragraphs: " + this.paragraphCounter);
        System.out.println("***Number of tables: " + this.tableCounter);
        System.out.println("***Number of sections: " + this.sectionCounter);
    }
}
