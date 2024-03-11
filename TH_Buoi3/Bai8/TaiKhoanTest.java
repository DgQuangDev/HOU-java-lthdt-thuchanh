package Bai8;

import java.util.Scanner;

public class TaiKhoanTest {

    static void menu() {
        System.out.println("================================================");
        System.out.println("-------------------" + "CHON TINH NANG BAN MUON SU DUNG" + "-----------------");
        System.out.println("1. Nhap thong tin tai khoan cua ban: ");
        System.out.println("2. Xuat thong tin tai khoan cua ban: ");
        System.out.println("3. Gui tien");
        System.out.println("4. Rut tien");
        System.out.println("5. Dao han");
        System.out.println("0. Thoat chuong trinh");
        System.out.println("================================================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Taikhoan tk = new Taikhoan();
        int chon;
        do {
            menu();
            System.out.println("Lua chon:");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    tk.Input();
                    break;
                case 2:
                    tk.output();
                    break;
                case 3:
                    tk.Guitien();
                    break;
                case 4:
                    tk.Ruttien();
                    break;
                case 5:
                    tk.DaoHan();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } while (chon != 0);
    }
}