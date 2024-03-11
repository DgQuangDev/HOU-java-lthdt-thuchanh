package Bai11;

import java.util.Scanner;
public class Student extends Person{
    float diem1, diem2;
    
    public Student(){
        
    }
    
    public Student(float diem1, float diem2, String hoten, String diachi){
        super(hoten, diachi);
        this.diem1=diem1;
        this.diem2=diem2;
    }
    public float getDiem1() {
        return diem1;
    }
    public void setDiem1(float diem1) {
        this.diem1 = diem1;
    }
    public float getDiem2() {
        return diem2;
    }
    public void setDiem2(float diem2) {
        this.diem2 = diem2;
    }
    
    public void nhapStu(){
        Scanner sc= new Scanner(System.in);
        super.nhap();
        System.out.println("Nhap diem 1: ");
        diem1= sc.nextFloat();
        System.out.println("Nhap diem 2: ");
        diem2= sc.nextFloat();
    }
    
    float diemTB(){
        return (diem1+diem2)/2;
    }
    
    String danhGia(){
        if(diemTB()>=8&& getDiem1()>=6.5&& getDiem2()>=6.5){
            return "Gioi";
        }else if(diemTB()<8&& getDiem1()>=6.5&& getDiem2()>=6.5&& diemTB()>=6.5){
            return "Kha";
        }else if(diemTB()>=5 && diemTB()<6.5){
            return "Trung Binh";
        }else return "Yeu";
    }
    
    public void xuat(){
        System.out.println("===Student===");
        super.xuat();
        System.out.println("Diem 1: "+ getDiem1());
        System.out.println("Diem 2: "+ getDiem2());
        System.out.println("Diem trung binh"+ diemTB());
        System.out.println("Danh gia: "+ danhGia());
        System.out.println("======");
    }
}
