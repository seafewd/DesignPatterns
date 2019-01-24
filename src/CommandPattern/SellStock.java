package CommandPattern;

public class SellStock implements Order {
    private Stock abcStock;

    SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
