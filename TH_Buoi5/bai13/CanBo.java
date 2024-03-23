package bai13;
import java.util.Scanner;
public class CanBo {
    int maCB, tuoi;
    float hsl;
    String tenCB, diaChi;
    
    public CanBo(){
        
    }
    
    public CanBo(int maCB, int tuoi, float hsl, String tenCB, String diaChi){
        this.maCB=maCB;
        this.tuoi=tuoi;
        this.tenCB=tenCB;
        this.hsl=hsl;
        this.diaChi=diaChi;
    }
    public int getMaCB() {
        return maCB;
    }
    public void setMaCB(int maCB) {
        this.maCB = maCB;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public float getHsl() {
        return hsl;
    }
    public void setHsl(float hsl) {
        this.hsl = hsl;
    }
    public String getTenCB() {
        return tenCB;
    }
    public void setTenCB(String tenCB) {
        this.tenCB = tenCB;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma can bo: ");
        maCB= sc.nextInt();
        System.out.println("Nhap ten can bo: ");
        sc.nextLine();
        tenCB= sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi= sc.nextLine();
        System.out.println("Nhap tuoi can bo: ");
        tuoi = sc.nextInt();
        System.out.println("Nhap he so luong: ");
        hsl= sc.nextFloat();
    }
    
    public void xuat(){
        System.out.println("Ma can bo: "+ getMaCB());
        System.out.println("Ten can bo: "+ getTenCB());
        System.out.println("Dia chi: "+ getDiaChi());
        System.out.println("Tuoi can bo: "+ getTuoi());
        System.out.println("He so luong: "+getHsl());
        
    }
    
}