package IndexGroup;

import java.util.Scanner;

public class Main {

    public static void menu() {
        System.out.println("===== CHUONG TRINH QUAN LY =====");
        System.out.println("1. Quan ly khach hang");
        System.out.println("2. Quan ly nhan vien");
        System.out.println("3. Quan ly san pham");
        System.out.println("4. Quan ly hoa don");
        System.out.println("5. Quan ly can bo quan ly");
        System.out.println("6. Thoat");
        System.out.println("=================================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListCustomer listCustomer = new ListCustomer();
        ListEmployee listEmployee = new ListEmployee();
        ListProduct listProduct = new ListProduct();
        ListInvoice listInvoice = new ListInvoice();
        ListManager listManager = new ListManager();

        int choice;
        do {
            menu();
            System.out.println("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống

            switch (choice) {
                case 1:
                    // Menu cho quản lý khách hàng
                    int customerChoice;
                    do {
                        System.out.println("===== QUAN LY KHACH HANG =====");
                        System.out.println("1. Nhap danh sach khach hang");
                        System.out.println("2. Hien thi danh sach khach hang");
                        System.out.println("3. Them khach hang moi");
                        System.out.println("4. Tim kiem khach hang theo ma");
                        System.out.println("5. Xoa khach hang theo ma");
                        System.out.println("6. Quay lai");
                        System.out.println("===============================");
                        System.out.println("Nhap lua chon cua ban: ");
                        customerChoice = scanner.nextInt();
                        scanner.nextLine(); // Đọc bỏ dòng trống

                        switch (customerChoice) {
                            case 1:
                                listCustomer.inputListCustomer();
                                break;
                            case 2:
                                listCustomer.outputListCustomer();
                                break;
                            case 3:
                                listCustomer.addCustomerAfterInput();
                                break;
                            case 4:
                                System.out.println("Nhap ma khach hang can tim: ");
                                String customerID = scanner.nextLine();
                                Customer foundCustomer = listCustomer.findCustomerByID(customerID);
                                if (foundCustomer != null) {
                                    foundCustomer.outputCustomer();
                                } else {
                                    System.out.println("Khong tim thay khach hang voi ma " + customerID);
                                }
                                break;
                            case 5:
                                System.out.println("Nhap ma khach hang can xoa: ");
                                String deleteCustomerID = scanner.nextLine();
                                if (listCustomer.deleteCustomerByID(deleteCustomerID)) {
                                    System.out.println("Xoa khach hang thanh cong.");
                                } else {
                                    System.out.println("Khong tim thay khach hang voi ma " + deleteCustomerID);
                                }
                                break;
                        }
                    } while (customerChoice != 6);
                    break;

                case 2:
                    // Menu cho quản lý nhân viên
                    int employeeChoice;
                    do {
                        System.out.println("===== QUAN LY NHAN VIEN =====");
                        System.out.println("1. Nhap danh sach nhan vien");
                        System.out.println("2. Hien thi danh sach nhan vien");
                        System.out.println("3. Them nhan vien moi");
                        System.out.println("4. Tim kiem nhan vien theo ma");
                        System.out.println("5. Xoa nhan vien theo ma");
                        System.out.println("6. Quay lai");
                        System.out.println("===============================");
                        System.out.println("Nhap lua chon cua ban: ");
                        employeeChoice = scanner.nextInt();
                        scanner.nextLine(); // Đọc bỏ dòng trống

                        switch (employeeChoice) {
                            case 1:
                                listEmployee.inputListEmployee();
                                break;
                            case 2:
                                listEmployee.outputListEmployee();
                                break;
                            case 3:
                                listEmployee.addEmployeeAfterInput();
                                break;
                            case 4:
                                System.out.println("Nhap ma nhan vien can tim: ");
                                int employeeID = scanner.nextInt();
                                Employee foundEmployee = listEmployee.findEmployeeByID(employeeID);
                                if (foundEmployee != null) {
                                    foundEmployee.outputEmployee();
                                } else {
                                    System.out.println("Khong tim thay nhan vien voi ma " + employeeID);
                                }
                                break;
                            case 5:
                                System.out.println("Nhap ma nhan vien can xoa: ");
                                int deleteEmployeeID = scanner.nextInt();
                                if (listEmployee.deleteEmployeeByID(deleteEmployeeID)) {
                                    System.out.println("Xoa nhan vien thanh cong.");
                                } else {
                                    System.out.println("Khong tim thay nhan vien voi ma " + deleteEmployeeID);
                                }
                                break;
                        }
                    } while (employeeChoice != 6);
                    break;

                case 3: //quan ly san pham
                    int productChoice;
                    do {
                        System.out.println("===== QUAN LY SAN PHAM =====");
                        System.out.println("1. Nhap danh sach san pham");
                        System.out.println("2. Hien thi danh sach san pham");
                        System.out.println("3. Them san pham moi");
                        System.out.println("4. Tim kiem san pham theo ma");
                        System.out.println("5. Quay lai");
                        System.out.println("===============================");
                        System.out.println("Nhap lua chon cua ban: ");
                        productChoice = scanner.nextInt();
                        scanner.nextLine(); // Đọc bỏ dòng trống

                            switch (productChoice) {
                            case 1:
                                listProduct.inputListProduct();
                                break;
                            case 2:
                                listProduct.outputListProduct();
                                break;
                            case 3:
                                listProduct.addProductAfterInput();
                                break;
                            case 4:
                                System.out.println("Nhap ma san pham can tim: ");
                                String productID = scanner.nextLine();
                                Product foundProduct = listProduct.findProductByID(productID);
                                if (foundProduct != null) {
                                    foundProduct.outputProduct();
                                } else {
                                    System.out.println("Khong tim thay san pham voi ma " + productID);
                                }
                                break;
                            }
                    } while (productChoice != 5);
                    break;

            // Phần cho quản lý hóa đơn (thêm vào case 4)

                case 4:
                    int invoiceChoice;
                    do {
                        System.out.println("===== QUAN LY HOA DON =====");
                        System.out.println("1. Nhap danh sach hoa don");
                        System.out.println("2. Hien thi danh sach hoa don");
                        System.out.println("5. Quay lai");
                        System.out.println("===============================");
                        System.out.println("Nhap lua chon cua ban: ");
                        invoiceChoice = scanner.nextInt();
                        scanner.nextLine(); // Đọc bỏ dòng trống

                        switch (invoiceChoice) {
                            case 1:
                                listInvoice.inputListInvoice(listCustomer, listProduct);
                                break;
                            case 2:
                                listInvoice.outputListInvoice();
                                break;
                            case 3:
                                listInvoice.addInvoiceAfterInput(listCustomer, listProduct);
                                break;
                            case 4:
                                System.out.println("Nhap ma hoa don can xoa: ");
                                int deleteInvoiceID = scanner.nextInt();
                                if (listInvoice.deleteInvoiceByID(deleteInvoiceID)) {
                                    System.out.println("Xoa hoa don thanh cong.");
                                } else {
                                    System.out.println("Khong tim thay hoa don voi ma " + deleteInvoiceID);
                                }
                                break;
                            case 5:
                                listInvoice.sortByTotalPrice();
                                System.out.println("Da sap xep hoa don theo tong tien tang dan.");
                                break;
                        }
                    } while (invoiceChoice != 6);
                    break;
                case 5:
                    // Menu cho quản lý cán bộ
                    int managerChoice;
                    do {
                        System.out.println("===== QUAN LY CAN BO QUAN LY =====");
                        System.out.println("1. Nhap danh sach can bo quan ly");
                        System.out.println("2. Hien thi danh sach can bo quan ly");
                        System.out.println("3. Hien thi danh sach can bo quan ly theo ma can bo (managerID)");
                        System.out.println("===============================");
                        System.out.println("Nhap lua chon cua ban: ");
                        managerChoice = scanner.nextInt();
                        scanner.nextLine(); // Đọc bỏ dòng trống

                        switch (managerChoice) {
                            case 1: // Nhap
                                listManager.inputListManager();
                                break;
                            case 2: // in ra man hình
                                listManager.outputListManager();
                                break;
                            case 3: // In ra màn hình theo điều kiện đúng với mã cán bộ cần in
                                System.out.println("Nhap ma can bo quan ly can in: ");
                                String managerID = scanner.nextLine();
                                Manager foundManager = listManager.findManagerByID(managerID);
                                if (foundManager != null) {
                                    foundManager.outputManager();
                                } else {
                                    System.out.println("Khong tim thay san pham voi ma " + managerID);
                                }
                                break;
                             
                         }
                    } while (managerChoice != 5);
                    break;
                
                case 6:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
            }

        } while (choice != 5);
    }
}
