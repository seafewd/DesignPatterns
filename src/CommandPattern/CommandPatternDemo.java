package CommandPattern;

public class CommandPatternDemo {
    public static void main(String[] args) {

        Stock abcStock = new Stock();

        BuyOrder buyOrder = new BuyOrder(abcStock);
        SellOrder sellOrder = new SellOrder(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyOrder);
        broker.takeOrder(sellOrder);

        broker.placeOrders();
    }
}
