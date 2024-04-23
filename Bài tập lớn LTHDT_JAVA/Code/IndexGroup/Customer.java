package IndexGroup;

import java.util.Scanner;

public class Customer extends Person {
    private String customerID;
    private String email;

    public Customer() {}

    public Customer(String name, String address, String phoneNumber, String customerID , String email) {
        super(name, address, phoneNumber);
        this.email = email;
        this.customerID = customerID;
    }

    // Getter và setter
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Phương thức nhập thông tin của Customer
    public static Customer inputCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ma khach hang: ");
        String customerID = scanner.nextLine();
        System.out.println("Nhap ten khach hang: ");
        String name = scanner.nextLine();
        System.out.println("Nhap dia chi khach hang: ");
        String address = scanner.nextLine();
        System.out.println("Nhap so dien thoai cua khach hang: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhap Email cua khach hang: ");
        String email = scanner.nextLine();
        return new Customer(name, address, phoneNumber, customerID , email);
    }

    // Phương thức hiển thị thông tin của Customer
    public void outputCustomer() {
        super.outputPerson();
        System.out.println("Ma cua khach hang la: " + customerID);
        System.out.println("Email cua khach hang la: " + email);
    }
}
