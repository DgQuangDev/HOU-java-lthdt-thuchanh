package Bai12;

import java.util.Scanner;
public class Nguoi {
    String hoTen, gioiTinh;
    public Nguoi(){
        
    }
    
    public Nguoi(String hoTen, String gioiTinh){
        this.hoTen=hoTen;
        this.gioiTinh=gioiTinh;
    }
    
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        hoTen= sc.nextLine();
        System.out.println("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
    }
    
    public void hien(){
        System.out.printf("%-25s %-15s",getHoTen(),getGioiTinh());
    }
    
}
