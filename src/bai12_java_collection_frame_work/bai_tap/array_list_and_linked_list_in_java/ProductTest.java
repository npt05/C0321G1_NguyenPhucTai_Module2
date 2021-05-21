package bai12_java_collection_frame_work.bai_tap.array_list_and_linked_list_in_java;


import java.util.Scanner;

import static bai12_java_collection_frame_work.bai_tap.array_list_and_linked_list_in_java.ProductManager.listProduct;

public class ProductTest {
    public static void displayMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add product.");
        System.out.println("2. Edit product.");
        System.out.println("3. Delete product.");
        System.out.println("4. Sort Ascending product .");
        System.out.println("5. Sort Desending product .");
        System.out.println("6. Show product.");
        System.out.println("7. Search name product.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose again: ");
    }
    public static void main(String[] args) {
        Product product = new Product(1, "iphone" , "apple" , 1000);
        listProduct.add(product);
        ProductManager productManager = new ProductManager();
        displayMenu();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (true) {
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    productManager.add();
                    break;
                case "2":
                    productManager.edit();
                    break;
                case "3":
                    productManager.delete();
                    break;
                case "4":
                    productManager.sortAscending();
                    break;
                case "5":
                    productManager.sortDescending();
                    break;
                case "6":
                    productManager.display();
                    break;
                case "7":
                    productManager.searchName();
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            displayMenu();
        }

    }
}
