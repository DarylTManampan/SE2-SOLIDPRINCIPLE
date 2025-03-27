package SOLIDPrinciple;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.setCustomerName("John Doe");
        order.setAddress("123 Main St");
        order.setPrice(10.0);
        order.setQuantity(2);
        order.setEmail("johndoe@example.com");
        order.setFileName("order_123.pdf");

        OrderAction orderAction = new OrderAction(order);
        orderAction.processOrder();
        
        // These methods might not be needed for all orders
        orderAction.generateInvoice();
        orderAction.sendEmailNotification();
    }
}