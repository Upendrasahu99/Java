package topics._18_solid_principle.single_responsibility;

public class Example2 {
}
 class EmailSender {

    public void sendEmail(String recipient, String subject, String body) {
        // Code to send an email to the recipient with the provided subject and body
        // ...
    }

    // Other methods related to email sending can be added here, as long as they are related to the EmailSender

}