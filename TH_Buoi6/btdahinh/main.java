package btdahinh;
import java.util.Scanner;

public class main {
    static void menu(){
        System.out.println("1. Nhap danh sach quan ly do an , tieu luan");
        System.out.println("2. Hien danh sach do an , tieu luan ra man hinh");
        System.out.println("3. Sap xep danh sach do an , tieu luan");
        System.out.println("4. Tim danh sach do an , tieu luan");
        System.out.println("5. Hien thong tin do an co diem bao ve cao nhat 2024");
        System.out.println("0. Thoat");
    }
    public static void main(String[] args) throws Exception {
        DoAn d = new DoAn();
        int chon;
        Scanner sc = new Scanner(System.in);
        
        do {            
            menu();
            System.out.print("Lua chon: ");
            chon = sc.nextInt();
            switch(chon){
                case 1: d.inputDoan();break;
                case 2: d.outputDoan();break;
                case 0: System.exit(0); break;
                default: break;
            }
        } while (chon!=0);
    }
    
}