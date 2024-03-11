package Bai9;
import java.util.Scanner;
public class CongNhan {
    float lcb=1150, hsl, luong=0, pc;
    public float getPc() {
        return pc;
    }
    public void setPc(float pc) {
        this.pc = pc;
    }
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
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoten=sc.nextLine();
        System.out.println("Nhap he so luong: ");
        hsl= sc.nextFloat();
        System.out.println("Nhap phu cap: ");
        pc=sc.nextFloat();
    }
    
    public float tinhLuongS(){
        return luong=lcb*hsl*(1+pc);
    }
    
    public float tinhLuongT(){
        return luong=lcb*hsl;
    }
    
    public void xuat(){
        System.out.printf("\n%25s%16.2f%12.2f%15.2f", hoten, hsl, tinhLuongT(), tinhLuongS());
    }
}