public class InternalCourierDeliveryStrategy implements DeliveryStrategy {
    @Override
    public double calculateCost(double orderAmount) {
        return 0.0;
    }
}