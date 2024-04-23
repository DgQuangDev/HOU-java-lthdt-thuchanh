package IndexGroup;


import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListInvoice {
    private ArrayList<Invoice> listHD;

    public ListInvoice() {
        listHD = new ArrayList<>();
    }

    // Phương thức thêm hóa đơn vào danh sách
    public void addInvoice(Invoice invoice) {
        listHD.add(invoice);
    }

    // Phương thức hiển thị danh sách hóa đơn
    public void outputListInvoice() {
        System.out.println("Danh sach hoa don:");
        for (Invoice invoice : listHD) {
            invoice.outputInvoice();
        }
    }

    // Phương thức nhập danh sách hóa đơn
    public void inputListInvoice(ListCustomer listCustomer, ListProduct listProduct) {
        System.out.println("Nhap so luong hoa don: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho hoa don thu " + (i + 1) + ":");
            Invoice invoice = new Invoice();

            System.out.println("Nhap ma hoa don: ");
            int invoiceID = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống
            invoice.setInvoiceID(invoiceID);

            System.out.println("Nhap ngay lap hoa don (dd/mm/yyyy): ");
            String ngayLap = scanner.nextLine();
            invoice.setNgayLap(ngayLap);

            System.out.println("Nhap phuong thuc thanh toan: ");
            String phuongThucThanhToan = scanner.nextLine();
            invoice.setPhuongThucThanhToan(phuongThucThanhToan);

            System.out.println("Chon khach hang tu danh sach:");
            listCustomer.outputListCustomer();
            System.out.println("Nhap vi tri cua khach hang trong danh sach: ");
            int customerIndex = scanner.nextInt();
            Customer customer = listCustomer.getListKH().get(customerIndex - 1);
            invoice.setCustomer(customer);

            System.out.println("Nhap so luong san pham trong hoa don: ");
            int soLuongSanPham = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            for (int j = 0; j < soLuongSanPham; j++) {
                System.out.println("Chon san pham thu " + (j + 1) + " tu danh sach:");
                listProduct.outputListProduct();
                System.out.println("Nhap vi tri cua san pham trong danh sach: ");
                int productIndex = scanner.nextInt();
                Product product = listProduct.getListTB().get(productIndex - 1);
                invoice.addProduct(product);
            }

            listHD.add(invoice);
        }
    }

    // Phương thức tính tổng tiền các hóa đơn
    public float calculateTotalPriceOfInvoices() {
        float totalPrice = 0;
        for (Invoice invoice : listHD) {
            totalPrice += invoice.calculateTotalPrice();
        }
        return totalPrice;
    }

    // Phương thức sắp xếp hóa đơn theo thứ tự tăng dần giá tiền
    public void sortByTotalPrice() {
        Collections.sort(listHD, new Comparator<Invoice>() {
            @Override
            public int compare(Invoice o1, Invoice o2) {
                return Float.compare(o1.calculateTotalPrice(), o2.calculateTotalPrice());
            }
        });
    }
    public void addInvoiceAfterInput(ListCustomer listCustomer, ListProduct listProduct) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin cho hoa don moi:");
        Invoice newInvoice = new Invoice();

        System.out.println("Nhap ma hoa don: ");
        int invoiceID = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống
        newInvoice.setInvoiceID(invoiceID);

        System.out.println("Nhap ngay lap hoa don (dd/mm/yyyy): ");
        String ngayLap = scanner.nextLine();
        newInvoice.setNgayLap(ngayLap);

        System.out.println("Nhap phuong thuc thanh toan: ");
        String phuongThucThanhToan = scanner.nextLine();
        newInvoice.setPhuongThucThanhToan(phuongThucThanhToan);

        System.out.println("Chon khach hang tu danh sach:");
        listCustomer.outputListCustomer();
        System.out.println("Nhap vi tri cua khach hang trong danh sach: ");
        int customerIndex = scanner.nextInt();
        Customer customer = listCustomer.getListKH().get(customerIndex - 1);
        newInvoice.setCustomer(customer);

        System.out.println("Nhap so luong san pham trong hoa don: ");
        int soLuongSanPham = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        for (int j = 0; j < soLuongSanPham; j++) {
            System.out.println("Chon san pham thu " + (j + 1) + " tu danh sach:");
            listProduct.outputListProduct();
            System.out.println("Nhap vi tri cua san pham trong danh sach: ");
            int productIndex = scanner.nextInt();
            Product product = listProduct.getListTB().get(productIndex - 1);
            newInvoice.addProduct(product);
        }

        listHD.add(newInvoice);
    }

    // Phương thức xóa hóa đơn dựa theo mã hóa đơn
    public boolean deleteInvoiceByID(int invoiceID) {
        for (Invoice invoice : listHD) {
            if (invoice.getInvoiceID() == invoiceID) {
                listHD.remove(invoice);
                return true; // Trả về true nếu xóa thành công
            }
        }
        return false; // Trả về false nếu không tìm thấy
    }

    // Phương thức sắp xếp danh sách hóa đơn theo thứ tự tăng dần của mã hóa đơn
    public void sortInvoicesByIDAscending() {
        Collections.sort(listHD, new Comparator<Invoice>() {
            @Override
            public int compare(Invoice o1, Invoice o2) {
                return Integer.compare(o1.getInvoiceID(), o2.getInvoiceID());
            }
        });
    }
}
