package uaslp.objetos.parcial1.examen.pos;

public class CartItem {
    private int quantity;
    private Product products;
    private String ProductName;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return products;
    }

    public void setProduct(Product products) {
        this.products = products;
    }

    public String getProductName() {
        return ProductName;
    }
}
