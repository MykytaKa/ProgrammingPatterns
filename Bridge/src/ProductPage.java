public class ProductPage extends Page {
    private Product product;

    public ProductPage(Renderer renderer, Product product) {
        super(renderer);
        this.product = product;
    }

    @Override
    public String view() {
        return null;
    }
}