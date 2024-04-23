package IndexGroup;

import java.util.ArrayList;
import java.util.Scanner;


public class ListCustomer {
    private ArrayList<Customer> listKH;

    public ListCustomer() {
        listKH = new ArrayList<>();
    }
    public ArrayList<Customer> getListKH() {
        return listKH;
    }

    // Setter cho listKH
    public void setListKH(ArrayList<Customer> listKH) {
        this.listKH = listKH;
    }

    // Phương thức thêm khách hàng vào danh sách
    public void addCustomer(Customer customer) {
        listKH.add(customer);
    }

    // Phương thức hiển thị danh sách khách hàng
    public void outputListCustomer() {
        System.out.println("Danh sach khach hang:");
        for (Customer customer : listKH) {
            customer.outputCustomer();
        }
    }

    // Phương thức nhập danh sách khách hàng
    public void inputListCustomer() {
        System.out.println("Nhap so luong khach hang: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho khach hang thu " + (i + 1) + ":");
            Customer customer = Customer.inputCustomer();
            listKH.add(customer);
        }
    }
    // Phương thức thêm khách hàng sau khi đã nhập danh sách khách hàng
    public void addCustomerAfterInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin cho khach hang moi:");
        Customer newCustomer = Customer.inputCustomer();
        listKH.add(newCustomer);
    }
    

    // Phương thức tìm kiếm khách hàng theo mã
    public Customer findCustomerByID(String customerID) {
        for (Customer customer : listKH) {
            if (customer.getCustomerID().equals(customerID)) {
                return customer;
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }

    // Phương thức xóa khách hàng theo mã
    public boolean deleteCustomerByID(String customerID) {
        for (Customer customer : listKH) {
            if (customer.getCustomerID().equals(customerID)) {
                listKH.remove(customer);
                return true; // Trả về true nếu xóa thành công
            }
        }
        return false; // Trả về false nếu không tìm thấy
    }
}
