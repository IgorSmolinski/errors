package good.patterns.challanges.Food2Door.Producers.model;

public class Order {
    private final Shops manufactor;
    private final String product;
    private final Double value;

    public Order(final Shops manufactor,final  String product, final Double value) {
        this.manufactor = manufactor;
        this.product = product;
        this.value = value;
    }

    public Shops getManufactor() {
        return manufactor;
    }

    public String getProduct() {
        return product;
    }

    public Double getValue() {
        return value;
    }

}
