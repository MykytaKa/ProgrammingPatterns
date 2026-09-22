public class LinkedInPublisher extends SocialNetworkPublisher {
    private String email;
    private String password;

    public LinkedInPublisher(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public ISocialNetwork createConnector() {
        return new LinkedInConnector(email, password);
    }
}
