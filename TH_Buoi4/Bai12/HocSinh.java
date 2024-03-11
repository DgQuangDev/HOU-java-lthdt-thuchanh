package Bai12;

import java.util.Scanner;
public class HocSinh extends Nguoi{
    String tenLop;
    
    public HocSinh(){
        
    }
    
    public HocSinh(String hoTen, String gioiTinh,String tenLop){
        super(hoTen, gioiTinh);
        this.tenLop=tenLop;
    }
    public String getTenLop() {
        return tenLop;
    }
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    
    public void nhapHS(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten lop: ");
        tenLop= sc. nextLine();
    }
    
    public void xuatHS(){
        super.hien();
        System.out.printf("%-10s",getTenLop());
    }
}