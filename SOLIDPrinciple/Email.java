package SOLIDPrinciple;

public class Email implements OrderEmailNotification {
    @Override
    public void sendEmailNotification(String email) {
        // Simulate sending email notification
        System.out.println("Email notification sent to: " + email);
    }
}