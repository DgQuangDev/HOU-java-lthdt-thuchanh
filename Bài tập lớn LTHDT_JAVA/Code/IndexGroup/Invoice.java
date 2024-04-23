package IndexGroup;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {
    private int invoiceID;
    private String ngayLap;
    private String phuongThucThanhToan;
    private Customer customer;
    private ArrayList<Product> listProducts;

    public Invoice() {
        listProducts = new ArrayList<>();
    }

    public Invoice(int invoiceID, String ngayLap, String phuongThucThanhToan) {
        this.invoiceID = invoiceID;
        this.ngayLap = ngayLap;
        this.phuongThucThanhToan = phuongThucThanhToan;
        listProducts = new ArrayList<>();
    }

    // Getter và setter cho invoiceID
    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    // Getter và setter cho ngayLap
    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    // Getter và setter cho phuongThucThanhToan
    public String getPhuongThucThanhToan() {
        return phuongThucThanhToan;
    }

    public void setPhuongThucThanhToan(String phuongThucThanhToan) {
        this.phuongThucThanhToan = phuongThucThanhToan;
    }

    // Getter và setter cho customer
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    // Phương thức thêm sản phẩm vào danh sách của hóa đơn
    public void addProduct(Product product) {
        listProducts.add(product);
    }

    // Phương thức hiển thị thông tin của hóa đơn
    public void outputInvoice() {
        System.out.println("Invoice ID: " + invoiceID);
        System.out.println("Ngay lap: " + ngayLap);
        System.out.println("Phuong thuc thanh toan: " + phuongThucThanhToan);
        System.out.println("Customer information:");
        customer.outputCustomer();
        System.out.println("Danh sach san pham trong hoa don:");
        for (Product product : listProducts) {
            product.outputProduct();
        }
    }

    // Phương thức tính tổng tiền của hóa đơn
    public float calculateTotalPrice() {
        float totalPrice = 0;
        for (Product product : listProducts) {
            totalPrice += product.calculateTotalPrice();
        }
        return totalPrice;
    }

    // Phương thức tính tổng số lượng thiết bị trong hóa đơn
    public int calculateTotalQuantity() {
        int totalQuantity = 0;
        for (Product product : listProducts) {
            totalQuantity += product.getQuantity();
        }
        return totalQuantity;
    }

    // Phương thức nhập thông tin của hóa đơn
    public void inputInvoice(Customer customer) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma hoa don: ");
        invoiceID = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.println("Nhap ngay lap (dd/mm/yyyy): ");
        ngayLap = scanner.nextLine();
        System.out.println("Nhap phuong thuc thanh toan: ");
        phuongThucThanhToan = scanner.nextLine();
        this.customer = customer;
    }
}