package CommandPattern;

public class BuyOrder implements Order {
    private Stock abcStock;

    BuyOrder(Stock abcStock) {
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
