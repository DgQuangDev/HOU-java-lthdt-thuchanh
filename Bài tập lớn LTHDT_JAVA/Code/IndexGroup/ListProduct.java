package IndexGroup;

import java.util.Scanner;
import java.util.ArrayList;

public class ListProduct {
    private ArrayList<Product> listTB;

    public ListProduct() {
        listTB = new ArrayList<>();
    }

    // Phương thức thêm sản phẩm vào danh sách
    public void addProduct(Product product) {
        listTB.add(product);
    }
    // Getter cho listTB
    public ArrayList<Product> getListTB() {
        return listTB;
    }

    // Setter cho listTB
    public void setListTB(ArrayList<Product> listTB) {
        this.listTB = listTB;
    }

    // Phương thức hiển thị danh sách sản phẩm
    public void outputListProduct() {
        System.out.println("Danh sach san pham:");
        for (Product product : listTB) {
            product.outputProduct();
        }
    }

    // Phương thức nhập danh sách sản phẩm
    public void inputListProduct() {
        System.out.println("Nhap so luong san pham: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho san pham thu " + (i + 1) + ":");
            Product product = Product.inputProduct();
            listTB.add(product);
        }
    }
     // Phương thức thêm sản phẩm sau khi đã nhập danh sách sản phẩm
    public void addProductAfterInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin cho san pham moi:");
        Product newProduct = Product.inputProduct();
        listTB.add(newProduct);
    }
    // Phương thức tìm kiếm sản phẩm theo mã
    public Product findProductByID(String productID) {
        for (Product product : listTB) {
            if (product.getProductID().equals(productID)) {
                return product;
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }
    
}