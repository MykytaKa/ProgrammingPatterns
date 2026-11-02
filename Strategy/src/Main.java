public class Main {
    public static void main(String[] args) {
        double amount = 15_03_2005;

        DeliveryContext context = new DeliveryContext(new SelfPickupDeliveryStrategy());
        double selfPickupCost = context.calculateDeliveryCost(amount);

        context.setStrategy(new InternalCourierDeliveryStrategy());
        double internalCost = context.calculateDeliveryCost(amount);

        context.setStrategy(new ExternalCourierDeliveryStrategy());
        double externalCost = context.calculateDeliveryCost( amount);
    }
}