package IndexGroup;

import java.util.Scanner;

public class Employee extends Person {
    private int employeeID;
    private float salaryCoefficient;

    public Employee() {}

    public Employee(String name, String address, String phoneNumber, int employeeID, float salaryCoefficient) {
        super(name, address, phoneNumber);
        this.employeeID = employeeID;
        this.salaryCoefficient = salaryCoefficient;
    }

    // Getter và setter cho employeeID
    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    // Getter và setter cho salaryCoefficient
    public float getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(float salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    // Phương thức nhập thông tin của Employee
    public static Employee inputEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien: ");
        String name = scanner.nextLine();
        System.out.println("Nhap dia chi nhan vien: ");
        String address = scanner.nextLine();
        System.out.println("Nhap so dien thoai nhan vien: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhap ma nhan vien: ");
        int employeeID = scanner.nextInt();
        System.out.println("Nhap he so luong cua nhan vien: ");
        float salaryCoefficient = scanner.nextFloat();
        return new Employee(name, address, phoneNumber, employeeID, salaryCoefficient);
    }

    // Phương thức hiển thị thông tin của Employee
    public void outputEmployee() {
        super.outputPerson();
        System.out.println("Ma nhan vien: " + employeeID);
        System.out.println("He so luong: " + salaryCoefficient);
    }

    // Phương thức tính lương của Employee
    public float calculateEmployeeSalary() {
        // Giả sử lương cơ bản là 10 triệu VND và được nhân với hệ số lương
        float baseSalary = 10000000; // 10 triệu VND
        return baseSalary * salaryCoefficient;
    }
}
