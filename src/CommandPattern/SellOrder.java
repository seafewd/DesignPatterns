package CommandPattern;

public class SellOrder implements Order {
    private Stock abcStock;

    SellOrder(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.sell();
    }
}
