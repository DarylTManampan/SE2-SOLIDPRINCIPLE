package SOLIDPrinciple;

public class OrderAction {
    private OrderCalculation calculator;
    private OrderPlacement placement;
    private OrderInvoice invoice;
    private OrderEmailNotification emailNotification;
    private Order order;

    public OrderAction(Order order) {
        this.order = order;
        this.calculator = new Calculator();
        this.placement = new Placement();
        this.invoice = new Invoice();
        this.emailNotification = new Email();
    }

    public void processOrder() {
        calculator.calculateTotal(order.getPrice(), order.getQuantity());
        placement.placeOrder(order.getCustomerName(), order.getAddress());
    }

    // These methods might not be needed for all orders
    public void generateInvoice() {
        invoice.generateInvoice(order.getFileName());
    }

    public void sendEmailNotification() {
        emailNotification.sendEmailNotification(order.getEmail());
    }
}