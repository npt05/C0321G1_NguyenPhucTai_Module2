package bai17_binary_file_serialization.bai_tap.product_management_file_binary;

import java.io.Serializable;

public class Products implements Serializable {
    private String id;
    private String productName;
    private String brand;
    private float price;
    private String description;

    public Products() {
    }

    public Products(String id, String productsName, String brand, float price, String description) {
        this.id = id;
        this.productName = productsName;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return
                "id= " + id +
                        ", name= '" + productName + '\'' +
                        ", brand= '" + brand + '\'' +
                        ", price= " + price +
                        ", description= '" + description + '\'';
    }
}
