package bai12_java_collection_frame_work.bai_tap.array_list_and_linked_list_in_java;



import java.util.*;

public class ProductManager {
    static List<Product> listProduct = new ArrayList();
    Scanner scanner = new Scanner(System.in);


    public void add() {
        int id = (listProduct.size() > 0) ? (listProduct.size() + 1) : 1;
        System.out.println("product id = " + id);
        String inputNameProduct = inputName();
        String inputBrand = inputBrand();
        int inputPrice = inputPrice();
        Product product = new Product(id, inputNameProduct, inputBrand, inputPrice);
        listProduct.add(product);
        display();
    }

    public void edit() {
        boolean isExisted = false;
        int size = listProduct.size();
        int id = inputId();
        for (int i = 0; i < size; i++) {
            if (listProduct.get(i).getProductId() == id) {
                isExisted = true;
                listProduct.get(i).setProductId(inputId());
                listProduct.get(i).setProductName(inputName());
                listProduct.get(i).setProductBrand(inputBrand());
                listProduct.get(i).setProductPrice(inputPrice());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", inputId());
        }
        display();
    }

    public void delete() {
        int id = inputId();
        int size = listProduct.size();
        Product product = null;
        for (int i = 0; i < size; i++) {
            if (listProduct.get(i).getProductId() == id) {
                product = listProduct.get(i);
                break;
            }
        }
        if (product != null) {
            listProduct.remove(product);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
        display();
    }

    public void searchName() {
        String searchName = inputName();
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getProductName().equals(searchName)) {
                System.out.println(listProduct.get(i).toString());
                break;
            }
            System.out.println("Not Found");
        }
    }

    public void display() {
        for (Product element : listProduct) {
            System.out.println(element);
        }
    }

    public int inputId() {
        System.out.print("Input product id: ");
        while (true) {
            try {
                int id = Integer.parseInt((scanner.nextLine()));
                return id;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input product id again: ");
            }
        }
    }

    private String inputName() {
        System.out.print("Input product name: ");
        return scanner.nextLine();
    }

    private String inputBrand() {
        System.out.print("Input Product brand: ");
        return scanner.nextLine();
    }

    private int inputPrice() {
        System.out.println("Input Product price");
        return scanner.nextInt();
    }


    public void sortAscending(){
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getProductPrice() - p2.getProductPrice();
            }
        });
    }

    public void sortDescending(){
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p2.getProductPrice() - p1.getProductPrice();
            }
        });
    }
}
