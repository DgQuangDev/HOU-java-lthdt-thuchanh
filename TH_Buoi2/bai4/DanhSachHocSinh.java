package bai4;

import java.util.Scanner;

public class DanhSachHocSinh {
    HocSinh ds[];
    int n;
    float sum = 0;

    public void nhapds() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong hoc sinh: ");
        n = sc.nextInt();
        ds = new HocSinh[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new HocSinh();
            ds[i].nhapDS();
        }
    }

    public void xuatds() {
        for (int i = 0; i < n; i++) {
            ds[i].xuatHS();
        }
    }

    public void TongTien() {
        for (int i = 0; i < n; i++) {
            sum = sum + ds[i].sotienAn;
        }
        System.out.println("Tong so tien an cua tat ca hoc sinh là: " + sum);
    }

    public void Sapxep() {
        HocSinh sosanh;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ds[i].sotienAn < ds[j].sotienAn) {
                    sosanh = ds[i];
                    ds[i] = ds[j];
                    ds[j] = sosanh;
                }
            }
        }
        xuatds();
    }

    public void DSHSsobuoian20() {
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (ds[i].sobuoiAn > 20) {
                dem = 1;
                break;
            }
        }
        if (dem == 1) {
            System.out.println("Ten hoc sinh co so buoi an ban tru tren 20 buoi la: ");
            for (int i = 0; i < n; i++) {
                if (ds[i].sobuoiAn > 20) {
                    System.out.println(ds[i].HoTen);
                }
            }
        } else {
            System.out.println("Khong co hoc sinh nao co so buoi an tren 20");
        }
    }
}