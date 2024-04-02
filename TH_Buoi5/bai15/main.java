package bai15;
import java.util.Scanner;
public class main {
    
    static void menu(){
        System.out.println("1. Nhap danh sach hoc sinh");
        System.out.println("2. Xuat danh sach hoc sinh");
        System.out.println("3. Loc danh sach theo nam sinh");
        System.out.println("4. Ghi file");
        System.out.println("5. Doc File");
        System.out.println("0. Thoat");
    }
    public static void main(String[] args) throws Exception {
        DanhSach d = new DanhSach();
        int chon;
        Scanner sc = new Scanner(System.in);
        
        do {            
            menu();
            System.out.print("Lua chon: ");
            chon = sc.nextInt();
            switch(chon){
                case 1: d.nhapDS();break;
                case 2: d.xuatDS();break;
                case 3: d.timKiem();break;
                case 4: d.ghiFile();break;
                case 5: d.docFile();break;
                case 0: System.exit(0); break;
                default: break;
            }
        } while (chon!=0);
    }
    
}
