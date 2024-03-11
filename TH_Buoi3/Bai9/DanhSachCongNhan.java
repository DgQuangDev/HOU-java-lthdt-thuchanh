package Bai9;

import java.util.Scanner;
public class DanhSachCongNhan {
    CongNhan ds[];
    int n;
    
    public void nhapDS(){
        Scanner sc= new Scanner(System.in);
        do {            
            System.out.println("Nhap so luong cong nhan: ");
            n=sc.nextInt();
            if(n<=0 || n>20){
                System.out.println("So luong cong nhan khong hop le!");
            }
        } while (n<=0 || n>20);
        ds= new CongNhan[n];
        for(int i=0;i<n;i++){
            ds[i]= new CongNhan();
            ds[i].nhap();
        }
    }
    
    public void xuatDS(){
        System.out.println("Danh sach cong nhan:");
        System.out.printf("\n%25s%16s%12s%15s","Ten cong nhan","He so luong","Luong","Luong co PC");
        for(int i=0;i<n;i++){
            ds[i].xuat();
        }
        System.out.println("");
    }
    
    public void chenhLech(){
        float sumT=0, sumS=0;
        for(int i=0;i<n;i++){
            sumT+=ds[i].tinhLuongT();
        }
        
        for(int i=0;i<n;i++){
            sumS+=ds[i].tinhLuongS();
        }
        
        System.out.println("Tong so tien chenh lech do chi tra phu cap la: "+ (sumS-sumT));
    }
}