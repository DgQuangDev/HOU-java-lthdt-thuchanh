package Bai10;
import java.util.Scanner;
public class MATHANG {
    String tenHang;
    int maHang;
    String nuocSX;
    public String getTenHang() {
        return tenHang;
    }
    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }
    public int getMaHang() {
        return maHang;
    }
    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }
    public String getNuocSX() {
        return nuocSX;
    }
    public void setNuocSX(String nuocSX) {
        this.nuocSX = nuocSX;
    }
    
    public MATHANG(){
        
    }
    
    public MATHANG(String tenHang, int maHang, String nuocSX){
        this.tenHang=tenHang;
        this.maHang=maHang;
        this.nuocSX=nuocSX;
    }
    
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten hang: ");
        tenHang=sc.nextLine();
        System.out.println("Nhap nuoc san xuat:");
        nuocSX=sc.nextLine();
        System.out.println("Nhap ma hang: ");
        maHang= sc.nextInt();
    }
    
    public void xuat(){
        System.out.printf("\n%-10s %-10d %-10s",tenHang,maHang,nuocSX);
    }
        
}