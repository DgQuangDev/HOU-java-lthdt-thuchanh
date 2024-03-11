package Bai11;

import java.util.Scanner;
public class Customer extends Person{
    String tenCT;
    float trigiaHD;
    
    public Customer(){
        
    }
    
    public Customer(String tenCT, float trigiaHD, String hoten, String diachi){
        super(hoten, diachi);
        this.tenCT=tenCT;
        this.trigiaHD=trigiaHD;
    }
    public String getTenCT() {
        return tenCT;
    }
    public void setTenCT(String tenCT) {
        this.tenCT = tenCT;
    }
    public float getTrigiaHD() {
        return trigiaHD;
    }
    public void setTrigiaHD(float trigiaHD) {
        this.trigiaHD = trigiaHD;
    }
    
    public void nhapCus(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap ten cong ty: ");
        tenCT= sc.nextLine();
        System.out.println("Nhap tri gia hoa don: ");
        trigiaHD= sc.nextFloat();
    }
    
    public void xuat(){
        System.out.println("===Customer===");
        super.xuat();
        System.out.println("Ten cong ty: "+getTenCT());
        System.out.println("Tri gia hoa don: "+ getTrigiaHD());
        System.out.println("======");
    }
}
