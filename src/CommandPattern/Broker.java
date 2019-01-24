package CommandPattern;

import java.util.ArrayList;
import java.util.List;

class Broker {
    private List<Order> orderList = new ArrayList<>();

    void takeOrder(Order order) {
        orderList.add(order);
    }

    void placeOrders() {
        for (Order order : orderList)
            order.execute();
        orderList.clear();
    }
}
