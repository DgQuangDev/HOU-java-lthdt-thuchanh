package btdahinh;

import java.util.Scanner;

public class SinhVien {
    private String Masv;
    private String Ten;
    private String lop;
    private String ChuyenNganh;

    public SinhVien(){
        this.Masv = "ID current";
        this.Ten = "No Name";
        this.lop = null;
        this.ChuyenNganh = null;
    }

    public SinhVien(String Masv,String Ten,String lop,String ChuyenNganh){
        this.Masv = Masv;
        this.Ten = Ten;
        this.lop = lop;
        this.ChuyenNganh = ChuyenNganh;
    }

    public String Masv(){
        return Masv;
    }

    public String Ten(){
        return Ten;
    }

    public String lop(){
        return lop;
    }
    public String ChuyenNganh(){
        return ChuyenNganh;
    }

    public void inputSinhVien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma sinh vien: "); this.Masv = sc.nextLine();
        System.out.println("Nhap Ten Sinh Vien: "); this.Ten=sc.nextLine();
        System.out.println("Nhap Ten Lop: "); this.lop = sc.nextLine();
        System.out.println("Nhap Chuyen nganh: ");this.ChuyenNganh = sc.nextLine();
    }

    public void showSinhvien(){
        System.out.printf("\n%-15s%-15s%-15s%-15s", this.Masv,this.Ten,this.lop,this.ChuyenNganh);
    }
}
