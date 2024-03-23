package bai14;
import java.util.Scanner;
public class Xe {
    float giaXe;
    String hangXe;
    
    public Xe(){
        
    }
public Xe(float giaXe, String hangXe){
        this.giaXe= giaXe;
        this.hangXe=hangXe;
    }
    public float getGiaXe() {
        return giaXe;
    }
    public void setGiaXe(float giaXe) {
        this.giaXe = giaXe;
    }
    public String getHangXe() {
        return hangXe;
    }
    public void setHangXe(String hangXe) {
        this.hangXe = hangXe;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hang xe");
        hangXe= sc.nextLine();
        System.out.println("Nhap gia xe: ");
        giaXe= sc.nextFloat();
    }
    
    public void xuat(){
        System.out.println("Hang xe: "+getHangXe());
        System.out.println("Gia xe: "+ getGiaXe());
    }
    
    
}
