package Bai10;
import java.util.Scanner;
public class TULANH extends MATHANG{
    int dungTich, soLuong;
    String mauSac, hangSX;
    float donGia;
    
    public TULANH(){
        
    }
    
    public TULANH(int dungTich, int soLuong, String mauSac, String hangSX, float donGia){
        this.dungTich=dungTich;
        this.soLuong=soLuong;
        this.mauSac=mauSac;
        this.donGia=donGia;
        this.hangSX=hangSX;
    }
    public int getDungTich() {
        return dungTich;
    }
    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
    public int getSoLuong() {
        return soLuong;
    }
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public String getMauSac() {
        return mauSac;
    }
    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }
    public String getHangSX() {
        return hangSX;
    }
    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }
    public float getDonGia() {
        return donGia;
    }
    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    
    public void nhapTL(){
        super.nhap();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap dung tich: ");
        dungTich=sc.nextInt();
        System.out.println("Nhap so luong: ");
        soLuong=sc.nextInt();
        System.out.println("Nhap don gia: ");
        donGia=sc.nextFloat();
        sc.nextLine();
        System.out.println("Nhap mau sac: ");
        mauSac= sc.nextLine();
        System.out.println("Nhap hang san xuat: ");
        hangSX=sc.nextLine();
    }
    
    public void xuatTL(){
        super.xuat();
        System.out.printf("%-10d %-10s %-10s %-10d %-10f %-10f",dungTich,mauSac,hangSX,soLuong,donGia, thanhTien());
    }
    
    public Float thanhTien(){
        return soLuong*donGia;
    }
}