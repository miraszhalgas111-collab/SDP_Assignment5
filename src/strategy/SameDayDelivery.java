package strategy;

public class SameDayDelivery implements DeliveryStrategy {

    @Override
    public double calculateCost(double distance) {
        return 1500 + distance * 300;
    }
}
