package Bai11;
import java.util.Scanner;
public class Person {
    String hoten;
    String diachi;
    
    public Person(){
        
    }
    
    public Person(String hoten, String diachi){
        this.hoten= hoten;
        this.diachi=diachi;
    }
    public String getHoten() {
        return hoten;
    }
    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    public String getDiachi() {
        return diachi;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    public void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ho va ten: ");
        hoten= sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi= sc.nextLine();
    }
    
    public void xuat(){
        System.out.println("Ho ten: "+ getHoten());
        System.out.println("Dia chi: "+ getDiachi());
    }
}