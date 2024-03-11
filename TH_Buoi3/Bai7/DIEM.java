package Bai7;
import java.util.Scanner;
public class DIEM {
    int x,y;
    DIEM() {
        x=0; 
        y=0;
    }
    
    DIEM(int xx, int yy){
        x=xx;
        y=yy;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap X: ");
        x= sc.nextInt();
        System.out.print("Nhap Y: ");
        y= sc.nextInt();
    }
    
    public void xuat(){
        System.out.println("X: "+x+" "+ "Y: "+y);
    }
}