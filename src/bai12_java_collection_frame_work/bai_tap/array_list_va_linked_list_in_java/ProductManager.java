package bai12_java_collection_frame_work.bai_tap.array_list_va_linked_list_in_java;



import java.util.*;

public class ProductManager {
    ArrayList<Product> productArrayList = new ArrayList<>();

    public boolean add(Product p){
        if (productArrayList.add(p)){
            return true;
        }

        return false;
    }

    public boolean edit(int productID){
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean result = true;
        Product currentProduct = getProductById(productID);
        if (currentProduct == null){
            return false;
        }

        while (result) {
            System.out.println("Chọn thông tin cần sửa: ");
            System.out.println("1. Tên sản phẩm ");
            System.out.println("2. Giá sản phẩm ");
            System.out.println("0. Thoát ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhập tên mới cho sản phẩm: ");
                    String newName = sc.nextLine();
                    currentProduct.setProductName(newName);
                    break;
                case 2:
                    System.out.println("Nhập giá mới cho sản phẩm: ");
                    int newPrice = sc.nextInt();
                    currentProduct.setProductPrice(newPrice);
                    break;
                case 0:
                    result = false;
                    break;
                default:
                    System.out.println("Mòi nhập lại");
            }
        }
        return true;
    }

    public boolean edit(int productID,String newName,int newPrice){
        Product currentProduct = getProductById(productID);
        if (currentProduct == null)
            return false;
        currentProduct.setProductPrice(newPrice);
        currentProduct.setProductName(newName);
        return true;
    }

    public boolean delete(int productID){
        Product currentProduct = getProductById(productID);
        if (productArrayList.remove(currentProduct))
            return true;
        return false;
    }

    public void display(){
        for (Product e : productArrayList){
            System.out.println(
                    "name: " + e.getProductName() + "\t" +
                            "ID: " + e.getProductID() + "\t" +
                            "Price: " + e.getProductPrice()
            );
        }
    }

    public boolean find(String productName){
        for (Product product: productArrayList){
            if (product.getProductName().equals(productName));
            return true;
        }
        return false;
    }

    public Product getProductById(int productID){
        for (Product product : productArrayList){
            if (product.getProductID() == productID)
                return product;
        }
        return null;
    }

    public void sortAscending(){
        Collections.sort(productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getProductPrice() - p2.getProductPrice();
            }
        });

    }

    public void sortDescending(){
        Collections.sort(productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p2.getProductPrice() - p1.getProductPrice();
            }
        });
    }
}
