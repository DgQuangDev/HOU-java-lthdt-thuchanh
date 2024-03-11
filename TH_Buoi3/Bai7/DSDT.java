package Bai7;

import java.util.Scanner;

public class DSDT {
    DOANTHANG ds[];
    int i, n;

    public void nhapDSDT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong doan thang:");
        n = sc.nextInt();

        ds = new DOANTHANG[n];
        for (i = 0; i < n; i++) {
            ds[i] = new DOANTHANG();
            System.out.println("Nhap duong thang thu: " + (i + 1));
            ds[i].nhapDT();
        }
    }

    public void xuatDSDT() {
        System.out.println("Danh sach duong thang: ");
        for (i = 0; i < n; i++) {
            System.out.println("\n Doan thang thu: " + (i + 1));
            ds[i].xuatDT();
        }
    }

    public void maxDT() {
        float max = ds[0].ChieuDai();
        for (int i = 1; i < n; i++) {
            if (max < ds[i].ChieuDai()) {
                max = ds[i].ChieuDai();
            }
        }

        System.out.println("Thong tin doan thang co do dai lon nhat là: ");
        for (int i = 0; i < n; i++) {
            if (max == ds[i].ChieuDai()) {
                ds[i].xuatDT();
            }
        }
    }

    public void sumDT() {
        float sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + ds[i].ChieuDai();
        }
        System.out.println("Tong do dai tat ca cac doan thang da nhap la: " + sum);
    }
}