package bai12_java_collection_frame_work.bai_tap.array_list_and_linked_list_in_java;


import java.util.Comparator;

public class Product implements Comparable<Product>, Comparator<Product> {
    private int productId;
    private String productName;
    private String productBrand;
    private int productPrice;

    public Product() {
    }

    public Product(int id, String nameProduct, String brand, int price) {
        this.productId = id;
        this.productName = nameProduct;
        this.productBrand = brand;
        this.productPrice = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "id=" + productId +
                ", name='" + productName + '\'' +
                ", brand='" + productBrand + '\'' +
                ", price=" + productPrice;
    }

    @Override
    public int compareTo(Product p) {
        return this.getProductName().compareTo(p.getProductName());
    }

    @Override
    public int compare(Product p1, Product p2) {
        return p1.getProductPrice() - p2.getProductPrice();
    }
}