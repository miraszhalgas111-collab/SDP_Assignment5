package strategy;

public class ExpressDelivery implements DeliveryStrategy {

    @Override
    public double calculateCost(double distance) {
        return 1000 + distance * 200;
    }
}
