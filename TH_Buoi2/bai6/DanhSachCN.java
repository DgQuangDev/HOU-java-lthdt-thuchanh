package bai6;

import java.util.Scanner;

public class DanhSachCN {
    CongNhan ds[];
    int n, i;
    float s;

    public void nhapDS() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap so luong cong nhan: ");
            n = sc.nextInt();
            if (n <= 0 || n >= 20) {
                System.out.println("So luong cong nhan khong hop le!");
            }

        } while (n <= 0 || n >= 20);
        ds = new CongNhan[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new CongNhan();
            ds[i].nhap();
        }
    }

    public void xuatDS() {
        for (int i = 0; i < n; i++) {
            ds[i].hien();
        }
    }

    public void CNcoluongS() {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong S: ");
        s = sc.nextFloat();
        for (int i = 0; i < n; i++) {
            if (ds[i].tinhLuong() > s) {
                sum = 1;
                break;
            }
        }
        if (sum == 0) {
            System.out.println("Khong co cong nhan nao co luong > S");
        } else {
            System.out.println("Danh sach ho ten cong nhan co luong > S la: ");
            for (int i = 0; i < n; i++) {
                if (ds[i].tinhLuong() > s) {
                    System.out.println(ds[i].getHoten());
                }
            }
        }
    }
}
