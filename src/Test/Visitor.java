package Test;

public interface Visitor {
    void visitPizza(Pizza pizza);

    void visitPaste(Paste paste);

    void visitSalate(Salate salate);

    void visitComanda(Comanda comanda);

    void visitClient(Client client);
}
