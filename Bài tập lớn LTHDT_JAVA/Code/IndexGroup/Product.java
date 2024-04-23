package IndexGroup;

import java.util.Scanner;

public class Product {
    private String productID;
    private String productName;
    private int quantity;
    private float price;
    private String warrantyPeriod;
    private String manufactureDate;
    private int employeeID;

    public Product() {}

    public Product(String productID, String productName, int quantity, float price, String warrantyPeriod, String manufactureDate, int employeeID) {
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.warrantyPeriod = warrantyPeriod;
        this.manufactureDate = manufactureDate;
        this.employeeID = employeeID;
    }

    // Getter và setter cho productID
    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    // Getter và setter cho productName
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter và setter cho quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Getter và setter cho price
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Getter và setter cho warrantyPeriod
    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    // Getter và setter cho manufactureDate
    public String getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    // Getter và setter cho employeeID
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    // Phương thức nhập thông tin của Product
    public static Product inputProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma san pham: ");
        String productID = scanner.nextLine();
        System.out.println("Nhap ten san pham: ");
        String productName = scanner.nextLine();
        System.out.println("Nhap so luong: ");
        int quantity = scanner.nextInt();
        System.out.println("Nhap gia tien: ");
        float price = scanner.nextFloat();
        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.println("Nhap thoi gian bao hanh: ");
        String warrantyPeriod = scanner.nextLine();
        System.out.println("Nhap ngay san xuat: ");
        String manufactureDate = scanner.nextLine();
        System.out.println("Nhap ma nhan vien: ");
        int employeeID = scanner.nextInt();
        return new Product(productID, productName, quantity, price, warrantyPeriod, manufactureDate, employeeID);
    }

    // Phương thức hiển thị thông tin của Product
    public void outputProduct() {
        System.out.println("Ma san pham: " + productID);
        System.out.println("Ten san pham: " + productName);
        System.out.println("So luong: " + quantity);
        System.out.println("Gia tien: " + price);
        System.out.println("Thoi gian bao hanh: " + warrantyPeriod);
        System.out.println("Ngay san xuat: " + manufactureDate);
        System.out.println("Ma nhan vien: " + employeeID);
    }

    // Phương thức tính tiền của Product
    public float calculateTotalPrice() {
        return quantity * price;
    }
}