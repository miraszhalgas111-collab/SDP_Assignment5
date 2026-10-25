package strategy;

public class Main {

    public static void main(String[] args) {

        double distance = 10;

        DeliveryContext context =
                new DeliveryContext(new StandardDelivery());

        System.out.println("Standard: " +
                context.calculateDelivery(distance) + " KZT");

        context.setStrategy(new ExpressDelivery());

        System.out.println("Express: " +
                context.calculateDelivery(distance) + " KZT");

        context.setStrategy(new SameDayDelivery());

        System.out.println("Same Day: " +
                context.calculateDelivery(distance) + " KZT");
    }
}
