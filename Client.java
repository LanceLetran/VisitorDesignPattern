public class Client {
    public static void main(String[] args) {
        Furniture chair = new Chair();
        Furniture table = new Table();
        Furniture sofa = new Sofa();

        ShippingCostVisitor flatRateVisitor = new FlatRateShippingCostVisitor(20.0);
        ShippingCostVisitor distanceBasedVisitor = new DistanceBasedShippingCostVisitor(1.5, 100);

        System.out.println("Chair shipping cost (Flat Rate): " + chair.accept(flatRateVisitor));
        System.out.println("Table shipping cost (Flat Rate): " + table.accept(flatRateVisitor));
        System.out.println("Sofa shipping cost (Flat Rate): " + sofa.accept(flatRateVisitor));

        System.out.println("Chair shipping cost (Distance Based): " + chair.accept(distanceBasedVisitor));
        System.out.println("Table shipping cost (Distance Based): " + table.accept(distanceBasedVisitor));
        System.out.println("Sofa shipping cost (Distance Based): " + sofa.accept(distanceBasedVisitor));
    }
}
