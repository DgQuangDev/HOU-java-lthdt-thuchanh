package Bai9;
import java.util.Scanner;
public class main {
    static void menu(){
        System.out.println("1. Nhap danh sach cong nhan");
        System.out.println("2. Xuat danh sach cong nhan");
        System.out.println("3. Tong so tien chenh lech so chi tra phu cap");
        System.out.println("0. Thoat");
    }
    public static void main(String[] args) {
        DanhSachCongNhan ds = new DanhSachCongNhan();
        int chon;
        do {            
            menu();
            Scanner sc= new Scanner(System.in);
            System.out.println("Lua chon: ");
            chon = sc.nextInt();
            switch(chon){
                case 1: ds.nhapDS(); break;
                case 2: ds.xuatDS();  break;
                case 3: ds.chenhLech(); break;
                case 0: System.exit(0); break;
                default: break;
            }
        } while (chon!=0);
    }
    
}