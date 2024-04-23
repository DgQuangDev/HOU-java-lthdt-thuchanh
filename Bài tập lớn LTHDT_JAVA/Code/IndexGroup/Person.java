package IndexGroup;

import java.util.Scanner;

public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;

    public Person() {}

    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getter và setter cho name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter và setter cho address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter và setter cho phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Phương thức nhập thông tin từ người dùng
    public static Person inputPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Nhap so dien thoai: ");
        String phoneNumber = scanner.nextLine();
        return new Person(name, address, phoneNumber);
    }

    // Phương thức hiển thị thông tin của Person
    public void outputPerson() {
        System.out.println("Ten: " + name);
        System.out.println("Dia chi: " + address);
        System.out.println("So dien thoai: " + phoneNumber);
    }
}