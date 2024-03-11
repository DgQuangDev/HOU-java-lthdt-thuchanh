package Bai10;
import java.util.Scanner;
public class main {
    static void menu(){
        System.out.println("==============MENU=============");
        System.out.println("1. Nhap thong tin");
        System.out.println("2. Hien thong tin");
        System.out.println("3. Liet ke theo hang san xuat");
        System.out.println("4. Tong tien");
        System.out.println("5. Danh sach cac tu lanh co dung tich tren 200");
        System.out.println("6. Sap xep giam dan");
        System.out.println("0. Thoat");
    }
    public static void main(String[] args) {
        DANHSACHTULANH ds = new DANHSACHTULANH();
        int chon;
        Scanner sc = new Scanner(System.in);
        do {            
            menu();
            
            System.out.println("Lua chon: ");
            chon = sc.nextInt();
            switch(chon){
                case 1: ds.nhapDSTL(); break;
                case 2: ds.xuatDSTL(); break;
                case 3: ds.lietkeHSX(); break;
                case 4: ds.tongTien(); break;
                case 5: ds.lietkeTL200(); break;
                case 6: ds.sapXep(); ds.xuatDSTL(); break;
                case 0: System.exit(0); break;
                default: break;
            }
                
        } while (chon!=0);
    }
    
}