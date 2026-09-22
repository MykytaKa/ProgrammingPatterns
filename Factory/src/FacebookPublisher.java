public class FacebookPublisher extends SocialNetworkPublisher {
    private String login;
    private String password;

    public FacebookPublisher(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public ISocialNetwork createConnector() {
        return new FacebookConnector(login, password);
    }
}
