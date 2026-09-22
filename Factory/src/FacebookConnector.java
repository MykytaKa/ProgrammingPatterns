public class FacebookConnector implements ISocialNetwork {
    private String login;
    private String password;

    public FacebookConnector(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @Override
    public boolean connect() {
        return true;
    }

    @Override
    public boolean postMessage(String message) {
        return true;
    }
}
