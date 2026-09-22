public abstract class SocialNetworkPublisher {
    public abstract ISocialNetwork createConnector();

    public boolean publish(String message) {
        ISocialNetwork network = createConnector();

        if (network.connect()) {
            return network.postMessage(message);
        }
        return false;
    }
}
