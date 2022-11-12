package practiceJava.warehouseManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    static Scanner scan = new Scanner(System.in);

    private int id;
    private String productName;
    private String producer;
    private int quantity;
    private String unit;
    private String shelf;
    static int idNum = 1000;

    static List<Product> productList = new ArrayList<>();

    public static List<Product> getProductList() {
        return productList;
    }

    public static void addProductToList(Product p) {
        productList.add(p);
    }


    public Product() {
    }

    public Product(String productName, String producer, String unit) {
        this.productName = productName;
        this.producer = producer;
        this.unit = unit;
    }

    public Product(int id,String productName, String producer, String unit) {
        this.id=id;
        this.productName = productName;
        this.producer = producer;
        this.unit = unit;
    }

    public static void productIdentify() {
        System.out.print("Product Name : ");
        String newProductName = scan.next();
        scan.nextLine();
        System.out.print("Producer Name : ");
        String newProducer = scan.next();
        scan.nextLine();
        System.out.print("Product Unit : ");
        String newProductUnit = scan.next();

        Product product = new Product(newProductName
                , newProducer, newProductUnit);

        product.setId(++idNum);

        addProductToList(product);

        System.out.println(product.getProductName() + " added.");
    }

    public static void listOfProducts() {
        System.out.println("=======================================================");
        System.out.printf("%-6s%-12s%-12s%-12s%-8s%-8s\n","id","name","producer","quantity","unit","shelf");
        System.out.println("-------------------------------------------------------");
        for (Product p : productList) {
            System.out.printf("%-6s%-12s%-12s%-12s%-8s%-8s\n",p.getId(),p.getProductName(),p.getProducer(),p.getQuantity(),p.getUnit(),p.getShelf());

        }
        System.out.println("=======================================================");
    }

    public static void addProduct() {
        listOfProducts();
        System.out.print("Please write the product id : ");
        int addingPrId = scan.nextInt();
                boolean prExist = false;
        for (Product p : getProductList()) {
            if (addingPrId == p.getId()) {
                System.out.print("Please write the quantity of your product : ");
                int prQuantity = scan.nextInt();
                p.setQuantity(prQuantity + p.getQuantity());
                prExist = true;
                System.out.println("Added " + prQuantity + " " + p.getProductName());
                break;
            }
        }
        if (!prExist) {
            System.out.println("invalid id.");
        }
    }

    public static void placeProduct() {
        listOfProducts();
        System.out.print("Write the product id you want to place : ");
        int placedPrId = scan.nextInt();

        boolean prExist = false;

        for (Product p : getProductList()) {
            if (placedPrId == p.getId()) {
                System.out.print("Please write the shelf number: ");
                int shelfNum = scan.nextInt();
                p.setShelf("shlf" + shelfNum);
                System.out.println(p.getProductName() + " placed on " + p.getShelf());
                prExist = true;
                break;
            }
        }
        if (!prExist) {
            System.out.println("invalid id.");
        }
    }

    public static void sellProduct() {
        listOfProducts();
        System.out.print("Please write the product id : ");
        int sellingPrId = scan.nextInt();

        boolean prExist = false;

        for (Product p : getProductList()) {
            if (sellingPrId == p.getId()) {
                prExist = true;
                System.out.print("Please write the quantity of your product : ");
                int prQuantity = scan.nextInt();
                if (prQuantity > p.getQuantity()) {
                        System.out.println("amount of product is not enough");
                        break;
                } else {
                    p.setQuantity(p.getQuantity() - prQuantity);
                    System.out.println(prQuantity + " " + p.getProductName() + " removed");
                    break;
                }
            }
        }
        if (!prExist) {
            System.out.println("invalid id.");
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public static int getIdNum() {
        return idNum;
    }

    public static void setIdNum(int idNum) {
        Product.idNum = idNum;
    }


}
