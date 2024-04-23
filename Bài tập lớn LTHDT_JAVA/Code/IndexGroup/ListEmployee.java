package IndexGroup;

import java.util.Scanner;
import java.util.ArrayList;

public class ListEmployee {
    private ArrayList<Employee> listNV;

    public ListEmployee() {
        listNV = new ArrayList<>();
    }

    // Phương thức thêm nhân viên vào danh sách
    public void addEmployee(Employee employee) {
        listNV.add(employee);
    }

    // Phương thức hiển thị danh sách nhân viên
    public void outputListEmployee() {
        System.out.println("Danh sach nhan vien:");
        for (Employee employee : listNV) {
            employee.outputEmployee();
        }
    }

    // Phương thức nhập danh sách nhân viên
    public void inputListEmployee() {
        System.out.println("Nhap so luong nhan vien: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho nhan vien thu " + (i + 1) + ":");
            Employee employee = Employee.inputEmployee();
            listNV.add(employee);
        }
    }
    // Phương thức thêm nhân viên sau khi đã nhập danh sách nhân viên
    public void addEmployeeAfterInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thong tin cho nhan vien moi:");
        Employee newEmployee = Employee.inputEmployee();
        listNV.add(newEmployee);
    }

    // Phương thức tìm kiếm nhân viên theo mã nhân viên
    public Employee findEmployeeByID(int employeeID) {
        for (Employee employee : listNV) {
            if (employee.getEmployeeID() == employeeID) {
                return employee;
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }

    // Phương thức xóa nhân viên theo mã nhân viên
    public boolean deleteEmployeeByID(int employeeID) {
        for (Employee employee : listNV) {
            if (employee.getEmployeeID() == employeeID) {
                listNV.remove(employee);
                return true; // Trả về true nếu xóa thành công
            }
        }
        return false; // Trả về false nếu không tìm thấy
    }
}
