
package strategy;

public class StandardDelivery implements DeliveryStrategy {

    @Override
    public double calculateCost(double distance) {
        return 500 + distance * 100;
    }
}
