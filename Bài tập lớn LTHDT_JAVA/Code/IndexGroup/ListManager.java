package IndexGroup;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;

public class ListManager {
    private ArrayList<Manager> listManagers;

    public ListManager() {
        listManagers = new ArrayList<>();
    }

    // Getter cho listManagers
    public ArrayList<Manager> getListManagers() {
        return listManagers;
    }

    // Setter cho listManagers
    public void setListManagers(ArrayList<Manager> listManagers) {
        this.listManagers = listManagers;
    }

    // Phương thức thêm cán bộ quản lý vào danh sách
    public void addManager(Manager manager) {
        listManagers.add(manager);
    }

    // Phương thức hiển thị danh sách cán bộ quản lý
    public void outputListManager() {
        System.out.println("Danh sach can bo quan ly:");
        for (Manager manager : listManagers) {
            manager.outputManager();
        }
    }

    // Phương thức nhập danh sách cán bộ quản lý
    public void inputListManager() {
        System.out.println("Nhap so luong can bo quan ly: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cho can bo quan ly thu " + (i + 1) + ":");
            Manager manager = Manager.inputManager();
            listManagers.add(manager);
        }
    }

    //In ra màn hình các cán bộ quản lý có mã nhân viên được nhập vào ( )
    public Manager findManagerByID(String managerID) {
        for (Manager manager : listManagers) {
            if (manager.getManagerID().equals(managerID)) {
                return manager;
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }
    public void sortInvoicesByIDAscending() {
        Collections.sort(listManagers, new Comparator<Invoice>() {
            @Override
            public int compare(Invoice o1, Invoice o2) {
                return Integer.compare(o1.getInvoiceID(), o2.getInvoiceID());
            }
        });
    }



}