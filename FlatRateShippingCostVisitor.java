public class FlatRateShippingCostVisitor implements ShippingCostVisitor {
    private final double flatRate;

    public FlatRateShippingCostVisitor(double flatRate) {
        this.flatRate = flatRate;
    }

    @Override
    public double visit(Chair chair) {
        return flatRate;
    }

    @Override
    public double visit(Table table) {
        return flatRate;
    }

    @Override
    public double visit(Sofa sofa) {
        return flatRate;
    }
}
