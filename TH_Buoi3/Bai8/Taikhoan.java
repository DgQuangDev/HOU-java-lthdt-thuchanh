package Bai8;

import java.util.Scanner;

public class Taikhoan {
    String SoTK;
    String TenTK;
    Double SoTien;
    Double laisuat = 0.05;

    public Taikhoan() {
        SoTK = "";
        TenTK = "";
        SoTien = 100.0;
    }

    public void Taikhoan(String SoTK, String TenTK, Double SoTien, Double laisuat) {
        this.SoTK = SoTK;
        this.TenTK = TenTK;
        this.laisuat = laisuat;
        this.SoTien = SoTien;
    }

    public double getlaisuat() {
        return laisuat;
    }

    public double setlaisuat(double laisuat) {
        this.laisuat = laisuat;
    }

    public String getSoTK() {
        return SoTK;
    }

    public String setSoTK(String SoTK) {
        this.SoTK = SoTK;
    }

    public String getTenTK() {
        return TenTK;
    }

    public String setTenTK(String TenTK) {
        this.TenTK = TenTK;
    }

    public double getSoTien() {
        return SoTien;
    }

    public double setSoTien(double SoTien) {
        this.SoTien = SoTien;
    }

    public void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================================================");

        System.out.println("Nhap so tai khoan: ");
        SoTK = sc.nextLine();

        System.out.println("Nhap ten tai khoan:");
        TenTK = sc.nextLine();

        System.out.println("Nhap so tien trong tai khoan:");
        SoTien = sc.nextDouble();

    }

    public void output() {
        System.out.println("================================================");
        System.out.println("So tai khoan:" + getSoTK());
        System.out.println("Ten tai khoan:" + getTenTK());
        System.out.println("So tien co trong tai khoan:" + getSoTien());
        System.out.println("Lai suat: " + getlaisuat());
    }

    public void Guitien() {
        Scanner sc = new Scanner(System.in);
        Double tiengui;

        System.out.println("Nhap so tien ban muon gui:");
        tiengui = sc.nextDouble();
        if (tiengui <= 0) {
            System.out.println("So tien ban muon gui khong hop le");
        }
        while (tiengui <= 0)
            ;
        SoTien = SoTien + tiengui;

        System.out.println("so tien hien tai trong tai khoan la: " + getSoTien());
    }

    public void Ruttien() {
        Scanner sc = new Scanner(System.in);
        double sotienrut;
        int phiruttien = 0;

        System.out.println("Nhap so tien ban muon rut khoi tai khoan");
        sotienrut = sc.nextDouble();
        if (sotienrut < 0) {
            System.out.println("So tien ban rut phai lon hon 0");
        }
        while (sotienrut < 0)
            ;
        if (sotienrut > SoTien) {
            System.out.println("So du cua ban khong du");
        } else {
            SoTien = SoTien - (sotienrut + phiruttien);
            System.out.println("Ban da thanh cong rut " + sotienrut + " khoi tai khoan");
            System.out.println("So tien trong tai khoan cua ban hien tai: " + getSoTien());
        }
    }

    public void DaoHan() {
        SoTien = SoTien + SoTien * laisuat;
        System.out.println("So tien trong tai khoan cua ban sau dao han la: " + getSoTien());
    }
}
