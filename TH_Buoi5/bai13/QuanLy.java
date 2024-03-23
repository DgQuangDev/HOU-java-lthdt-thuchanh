package bai13;
import java.util.Scanner;
public class QuanLy extends CanBo implements Luong{
    float phuCap;
    Scanner sc = new Scanner(System.in);
    
    public void nhapQL(){
        super.nhap();
        System.out.println("Nhap phu cap: ");
        phuCap= sc.nextFloat();
    }
    
    @Override
    public float tinhLuong() {
        return (hsl+phuCap)*135000;
    }
    
    public void xuatQL(){
        super.xuat();
        System.out.println("Phu Cap: "+ phuCap);
        System.out.println("Luong: "+tinhLuong());
    }
    
}
