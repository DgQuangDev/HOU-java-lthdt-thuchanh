package bai4;

import java.util.Scanner;

public class main {
    public static void menu() {
        System.out.println("1.Nhap danh sach hoc sinh");
        System.out.println("2.Xuat danh sach hoc sinh");
        System.out.println("3.Tinh tong tien ban tru");
        System.out.println("4.Sap xep danh sach hoc sinh theo thu tu tang dan");
        System.out.println("5.In cac ten hoc sinh co so buoi an tren 20 buoi");
        System.out.println("0.Thoat");
    }

    public static void main(String[] args) {
        DanhSachHocSinh ds = new DanhSachHocSinh();
        int chon;
        do {
            menu();
            Scanner sc = new Scanner(System.in);
            System.out.println("Lua chon chuong trinh: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("----NHAP DANH SACH XUONG DUOI DAY----");
                    ds.nhapds();
                    break;
                case 2:
                    System.out.println("----DUOI DAY LA DANH SACH HOC SINH----");
                    ds.xuatds();
                    break;
                case 3:
                    System.out.println("----TONG TIEN BAN TRU----");
                    ds.TongTien();
                    break;
                case 4:
                    System.out.println("----SAP XEP DANH SACH HOC SINH THEO THU TU TANG DAN TIEN AN BAN TRU----");
                    ds.Sapxep();
                    break;
                case 5:
                    System.out.println("----DANH SACH TEN CAC HOC SINH AN BAN TRU > 20 BUOI");
                    ds.DSHSsobuoian20();
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