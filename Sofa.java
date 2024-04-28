public class Sofa implements Furniture {
    @Override
    public double accept(ShippingCostVisitor visitor) {
        return visitor.visit(this);
    }
}
