package Bai7;

import java.util.Scanner;

public class main {
    static void menu() {
        System.out.println("1. Nhap danh sach doan thang");
        System.out.println("2. Xuat danh sach doan thang");
        System.out.println("3. Thong tin doan thang co do dai lon nhat");
        System.out.println("4. Tong do dai tat ca doan thang");
        System.out.println("0. Thoat");
    }

    public static void main(String[] args) {
        int chon;
        DSDT dsdt = new DSDT();
        Scanner sc = new Scanner(System.in);
        do {
            menu();
            System.out.println("Lua chon:");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    dsdt.nhapDSDT();
                    break;
                case 2:
                    dsdt.xuatDSDT();
                    break;
                case 3:
                    dsdt.maxDT();
                    break;
                case 4:
                    dsdt.sumDT();
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