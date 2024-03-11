package Bai10;
import java.util.ArrayList;
import java.util.Scanner;
public class DANHSACHTULANH {
    ArrayList<TULANH> list = new ArrayList<>();
    int n;
    public void nhapDSTL(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap so luong tu lanh: ");
        n=sc.nextInt();
        list= new ArrayList(n);
        for(int i=0;i<n;i++){
            TULANH tl = new TULANH();
            System.out.println("Nhap thong tin tu lanh thu "+(i+1));
            tl.nhapTL();
            list.add(tl);
        }
    }
    
    public void xuatDSTL(){
        System.out.println("Danh sach tu lanh:");
        System.out.printf("\n%-10s %-10s %-10s","Ten Hang","Ma Hang","NuocSX");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s","Dung Tich","Mau Sac","HangSX","So Luong","Don Gia","Thanh Tien");
        for(int i=0;i<n;i++){
            list.get(i).xuatTL();
        }
        
        System.out.println("");
        System.out.println("");
    }
    
    public void lietkeHSX(){
        String hangsx;
        int dem=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hang san xuat can tim: ");
        hangsx= sc.nextLine();
        
        for(int i=0;i<n;i++){
            if(list.get(i).hangSX.equals(hangsx)){
                dem++;
            }
        }
        
        if(dem==0){
            System.out.println("Khong ton tai hang san xuat");
        }else{
            for(int i=0;i<n;i++){
                if(list.get(i).hangSX.equals(hangsx)){
                list.get(i).xuatTL();
                }
            }
        }
        System.out.println("");
    }
    
    public void tongTien(){
        float sum=0;
        for(int i=0;i<n;i++){
            sum+=list.get(i).thanhTien();
        }
        
        System.out.println("Tong tien cac tu lanh co trong danh sach la: "+ sum);
    }
    
    public void lietkeTL200(){
        int dem=0;
        for(int i=0;i<n;i++){
            if(list.get(i).dungTich>200){
                dem++;
            }
        }
        
        if(dem==0){
            System.out.println("Khong co tu lanh nao co dung tich tren 200");
        }else{
            for(int i=0;i<n;i++){
                if(list.get(i).dungTich>200){
                list.get(i).xuatTL();
                }
            }
        }
    }
    
    public void sapXep(){
        TULANH tg;
        tg= new TULANH();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(list.get(i).soLuong<list.get(j).soLuong){
                    tg=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j, tg);
                }
            }
        }
    }
    
}