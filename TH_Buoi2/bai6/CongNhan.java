package bai6;

import java.util.Scanner;

public class CongNhan {
    float lcb = 1150;
    float hsl;
    String hoten;

    public float getLcb() {
        return lcb;
    }

    public void setLcb(float lcb) {
        this.lcb = lcb;
    }

    public float getHsl() {
        return hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float tinhLuong() {
        return lcb * hsl;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap he so luong: ");
        hsl = sc.nextFloat();
        System.out.print("\n-------------------------\n");
    }

    public void hien() {
        System.out.println("Ho ten: " + hoten + " ");
        System.out.println("He so luong: " + hsl + " ");
        System.out.println("Luong: " + tinhLuong());
        System.out.println("------------------------");
    }
}
