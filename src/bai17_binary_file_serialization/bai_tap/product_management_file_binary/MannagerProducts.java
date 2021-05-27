package bai17_binary_file_serialization.bai_tap.product_management_file_binary;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MannagerProducts {
    public static List<Products> products = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        products.add(new Products("1", "xiaomi 4", "Samsung", 1000, "Thiết kế bình thường"));
        products.add(new Products("2", "xiaomi 5", "Samsung", 800, "Thiết kế màn hình lớn phẳng"));
        products.add(new Products("3", "xiaom remid ", "Samsung", 500, "Thiết kế màn hình cong"));
        writeToFile("bt_th_module2/src/bai16_io_file_binary/bai_tap/product_management_file_binary/products.txt", products);
        boolean checkMenu = true;
        while (checkMenu) {
            System.out.println("Quản lí sản phẩm");
            System.out.println("chọn 1 để thêm sản phẩm");
            System.out.println("chọn 2 để hiển thị dấnh sách sản phẩm");
            System.out.println("chọn 3 để tìm kiếm sản phẩm");
            System.out.println("chọn 0 để thoát");
            int choise = sc.nextInt();
            switch (choise) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProducts();
                    break;
                case 3:
                    foundProduct();
                    break;
                case 0:
                    checkMenu = false;
                    break;
            }

        }
    }

    public static void addProduct() {
        System.out.println("nhập id: ");
        String id = sc.nextLine();
        System.out.println("nhập tên sản phẩm: ");
        String nameProduct = sc.nextLine();
        System.out.println("nhập thương hiệu: ");
        String brand = sc.nextLine();
        System.out.println("nhập giá: ");
        float price = sc.nextFloat();
        System.out.println("mô tả sản phẩm; ");
        String disription = sc.nextLine();
        Products product = new Products(id, nameProduct, brand, price, disription);
        products.add(product);
        writeToFile("C:/Hoc_lap_trinh/C0321G1_NguyenPhucTai_module2/src/bai17_binary_file_serialization/bai_tap/product_management_file_binary/product.txt", products);
    }

    public static void writeToFile(String path, List<Products> products) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Products> readDataFromFile(String path) {
        List<Products> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Products>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return products;
    }

    public static void showProducts() {
        readDataFromFile("bt_th_module2/src/bai16_io_file_binary/bai_tap/product_management_file_binary/products.txt");
        for (Products elment : products) {
            System.out.println(elment.toString());
        }
    }

    public static void foundProduct() {
        System.out.println("nhap id can tim kiem:");
        String inputId = sc.nextLine();
        readDataFromFile("bt_th_module2/src/bai16_io_file_binary/bai_tap/product_management_file_binary/product.txt");
        boolean check = false;
        for (int i = 0; i < products.size(); i++) {
            check = false;
            String checkId = products.get(i).getId();
            if (checkId.equals(inputId)) {
                check = true;
                System.out.println(products.get(i));
                break;
            }

        }
        if (!check) {
            System.out.println("id này không tồn tại");
        }
    }
}
