public class Main {
    public static void main(String[] args) {
        Renderer htmlRenderer = new HTMLRenderer();
        Renderer jsonRenderer = new JSONRenderer();
        Renderer xmlRenderer = new XMLRenderer();

        Product laptop = new Product("1", "Laptop", "Gaming laptop", "laptop.png");

        Page simplePageHTML = new SimplePage(htmlRenderer, "Hello", "Content");
        simplePageHTML.view();

        Page simplePageJSON = new SimplePage(jsonRenderer, "Hello", "Content");
        simplePageJSON.view();

        Page productPageHTML = new ProductPage(htmlRenderer, laptop);
        productPageHTML.view();

        Page productPageXML = new ProductPage(xmlRenderer, laptop);
        productPageXML.view();

        productPageHTML.setRenderer(jsonRenderer);
        productPageHTML.view();
    }
}