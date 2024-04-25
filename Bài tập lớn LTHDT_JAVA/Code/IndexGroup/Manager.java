package IndexGroup;

import java.util.Scanner;

//đổi tên class THi_MORONG thành class Manager để dễ quản lý
public class Manager extends Person { //class THI_MORONG
    private String managerID; // mã người cán bộ quản lý
    private String chucVu; // chức vụ

    public Manager() {}

    public Manager(String name, String address, String phoneNumber, String managerID, String chucVu) {
        super(name, address, phoneNumber);
        this.managerID = managerID;
        this.chucVu = chucVu;
    }

    // Getter và setter cho managerID

    public String getManagerID() {
        return managerID;
    }

    public void setManagerID(String managerID) {
        this.managerID = managerID;
    }

    // Getter và setter cho position
    public String getchucVu() {
        return chucVu;
    }

    public void setchucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    // Phương thức nhập thông tin của Manager
    public static Manager inputManager() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten quan ly: ");
        String name = scanner.nextLine();
        System.out.println("Nhap dia chi quan ly: ");
        String address = scanner.nextLine();
        System.out.println("Nhap so dien thoai quan ly: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhap ma quan ly: ");
        String managerID = scanner.nextLine();
        System.out.println("Nhap chuc vu: ");
        String chucVu = scanner.nextLine();
        return new Manager(name, address, phoneNumber, managerID, chucVu);
    }

    // Phương thức hiển thị thông tin của Manager
    public void outputManager() {
        super.outputPerson();
        System.out.println("Ma can bo quan ly: " + managerID);
        System.out.println("Chuc vu: " + chucVu);
    }
}