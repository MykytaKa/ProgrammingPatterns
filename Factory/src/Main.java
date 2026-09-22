public class Main {
    public static void main(String[] args) {
        SocialNetworkPublisher facebookPublisher = new FacebookPublisher("login", "123");

        facebookPublisher.publish("Test message on Facebook.");

        SocialNetworkPublisher linkedInPublisher = new LinkedInPublisher("user@email.com", "123");

        linkedInPublisher.publish("Test message on LinkedIn.");
    }
}