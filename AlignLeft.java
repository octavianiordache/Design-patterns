package mybook;

public class AlignLeft implements AlignStrategy{
    @Override
    public void render(String p) {
        System.out.println("    " + p);
    }
}
