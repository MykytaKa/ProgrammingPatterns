public class LinkedInConnector implements ISocialNetwork {
    private String email;
    private String password;

    public LinkedInConnector(String email, String password) {
        this.email = email;
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
