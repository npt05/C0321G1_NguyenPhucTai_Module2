package bai12_java_collection_frame_work.bai_tap.array_list_va_linked_list_in_java;

public class ProductTest {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        productManager.add(new Product("apple",1,10));
        productManager.add(new Product("samsung",2,20));
        productManager.add(new Product("sony",3,30));
        System.out.println(productManager.getProductById(2));
        productManager.display();
        productManager.edit(1,"xiaomi",25);
        productManager.display();
        System.out.println("----");
        System.out.println(productManager.find("xiaomi"));
        System.out.println(productManager.find("sony"));
        productManager.sortAscending();
        productManager.display();
        System.out.println();
        productManager.sortDescending();
        productManager.display();

    }

}
