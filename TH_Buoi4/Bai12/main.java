import java.util.Scanner;
public class main {
    static void menu(){
        System.out.println("1. Nhap danh sach hoc sinh");
        System.out.println("2. Xuat danh sach hoc sinh");
        System.out.println("3. Sap xep danh sach hoc sinh theo lop");
        System.out.println("0. Thoat");
    }
    public static void main(String[] args) {
        int chon;
        Scanner sc = new Scanner(System.in);
        DanhSachHocSinh dshs= new DanhSachHocSinh();
        do {            
            menu();
            System.out.println("Lua chon: ");
            chon= sc.nextInt();
            switch(chon){
                case 1: dshs.nhapDS(); break;
                case 2: dshs.hienDS(); break;
                case 3: dshs.sapXep(); break;
                case 0: System.exit(0); break;
                default: break;
            }
        } while (chon!=0);
    }
    
}
