public class DistanceBasedShippingCostVisitor implements ShippingCostVisitor {
    private final double ratePerMile;
    private final double distance;

    public DistanceBasedShippingCostVisitor(double ratePerMile, double distance) {
        this.ratePerMile = ratePerMile;
        this.distance = distance;
    }

    @Override
    public double visit(Chair chair) {
        return ratePerMile * distance;
    }

    @Override
    public double visit(Table table) {
        return ratePerMile * distance;
    }

    @Override
    public double visit(Sofa sofa) {
        double bulkySurcharge = 50.0;
        return (ratePerMile * distance) + bulkySurcharge;
    }
}
