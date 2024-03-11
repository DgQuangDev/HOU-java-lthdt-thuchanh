package bai4;

import java.util.Scanner;

public class HocSinh {
    int maHS;
    String HoTen;
    String Lop;
    int sobuoiAn;
    float sotienAn;

    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hoc sinh: ");
        maHS = sc.nextInt();
        System.out.println("Nhap ho ten hoc sinh: ");
        sc.nextLine();
        HoTen = sc.nextLine();
        System.out.println("Nhap so buoi an ban tru: ");
        sobuoiAn = sc.nextInt();
        sotienAn = sobuoiAn * 30000;
    }

    public void xuatHS() {
        System.out.println(maHS + "\t" + HoTen + "\t" + lop + "\t" + sobuoiAn + "\t" + sotienAn);
    }
}