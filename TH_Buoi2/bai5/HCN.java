package bai5;

import java.util.Scanner;

public class HCN {
    float cd;
    float cr;

    public float getCd() {
        return cd;
    }

    public void setCd(float cd) {
        this.cd = cd;
    }

    public float getCr() {
        return cr;
    }

    public void setCr(float cr) {
        this.cr = cr;
    }

    public float ChuVi() {
        return (float) ((cd + cr) * 2);
    }

    public float DienTich() {
        return (float) (cd * cr);
    }

    public void nhap() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap chieu dai:");
            cd = sc.nextFloat();
            System.out.println("Nhap chieu rong: ");
            cr = sc.nextFloat();
            if (cd < cr) {
                System.out.println("Chieu dai phai lon hon chieu rong!");
            }
        } while (cd < cr);
    }

    @Override
    public String toString() {
        return "Chieu dai: " + cd + "\nChieu rong: " + cr + "\nDien tich: " + DienTich() + "\nChu vi: " + ChuVi();
    }
}