public class DeliveryContext {
    private DeliveryStrategy strategy;

    public DeliveryContext(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateDeliveryCost(double orderAmount) {
        return strategy.calculateCost(orderAmount);
    }
}