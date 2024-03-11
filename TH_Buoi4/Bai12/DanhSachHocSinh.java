package Bai12;

import java.util.ArrayList;
import java.util.Scanner;
public class DanhSachHocSinh {
    ArrayList<HocSinh> ds = new ArrayList<>();
    int n;
    Scanner sc = new Scanner(System.in);
    
    public void nhapDS(){
        System.out.println("Nhap so luong hoc sinh: ");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            HocSinh x= new HocSinh();
            System.out.println("Nhap hoc sinh thu"+ (i+1));
            x.nhapHS();
            ds.add(x);
        }
    }
    
    public void hienDS(){
        System.out.println("Danh sach hoc sinh: ");
        System.out.printf("%-25s%-15s%-10s","Ho ten","Gioi tinh","Lop");
        for(int i=0;i<n;i++){
            System.out.println("");
            ds.get(i).xuatHS();
        }
        System.out.println("");
    }
    
    public void sapXep(){
        HocSinh tg;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ds.get(i).getTenLop().compareTo(ds.get(j).getTenLop())>0){
                    tg= ds.get(i);
                    ds.set(i, ds.get(j));
                    ds.set(j, tg);
                }
            }
        }
        
        System.out.println("Danh sach hoc sinh theo ten lop la: ");
        hienDS();
    }
    
}
