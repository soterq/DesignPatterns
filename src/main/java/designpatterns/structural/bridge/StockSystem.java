package designpatterns.structural.bridge;

public class StockSystem extends Program{

    protected StockSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange development in progress");
        developer.writeCode();
    }
}
