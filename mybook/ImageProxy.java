package mybook;

public class ImageProxy implements Element{
    private String url;
    int dim;
    private Image realImage;

    public ImageProxy(String url) {
        this.url = url;
    }

    public Image loadImage(){
        if(realImage==null)
            realImage=new Image(url);
        return realImage;
    }

    public void print(){
        Image poza= loadImage();
        poza.print();
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

    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);

    }
}
