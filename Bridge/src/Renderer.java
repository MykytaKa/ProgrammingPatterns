public interface Renderer {
    String renderTitle(String title);
    String renderContent(String content);
    String renderProductDetails(String id, String name, String description, String image);
}
