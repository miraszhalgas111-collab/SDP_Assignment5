package strategy;

import java.util.Objects;

public class DeliveryContext {

    private DeliveryStrategy strategy;

    public DeliveryContext(DeliveryStrategy strategy) {
        setStrategy(strategy);
    }

    public void setStrategy(DeliveryStrategy strategy) {
        this.strategy = Objects.requireNonNull(strategy);
    }

    public double calculateDelivery(double distance) {
        if (distance < 0) {
            throw new IllegalArgumentException(
                    "Distance cannot be negative"
            );
        }
        return strategy.calculateCost(distance);
    }
}
