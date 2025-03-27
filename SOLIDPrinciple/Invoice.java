package SOLIDPrinciple;

public class Invoice implements OrderInvoice {
    @Override
    public void generateInvoice(String fileName) {
        // Simulate generating invoice file
        System.out.println("Invoice generated: " + fileName);
    }
}