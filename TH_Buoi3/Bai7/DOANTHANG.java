package Bai7;

import java.util.Scanner;

public class DOANTHANG {
    DIEM A, B;

    DOANTHANG() {
        this.A = new DIEM();
        this.B = new DIEM();
    }

    public DOANTHANG(int x1, int y1, int x2, int y2) {
        this.A = new DIEM(x1, y1);
        this.B = new DIEM(x2, y2);
    }

    public void nhapDT() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem A: ");
        A.nhap();
        System.out.println("Nhap diem B: ");
        B.nhap();
    }

    public float ChieuDai() {

        return (float) (Math.sqrt(Math.pow(B.getX() - A.getX(), 2) + (Math.pow(B.getY() - A.getY(), 2))));
    }

    public void xuatDT() {
        System.out.println("A:");
        A.xuat();
        System.out.println("B:");
        B.xuat();
        System.out.println("Chieu dai: " + ChieuDai());
    }
}
