package bai13;
import java.util.ArrayList;
import java.util.Scanner;
public class DanhSachCanBo {
    ArrayList<CanBo> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int chon;
    public void menu(){
        System.out.println("1.Nhap Chuyen Vien");
        System.out.println("2.Nhap Giang Vien");
        System.out.println("3.Nhap Quan Ly");
        System.out.println("4.Xuat danh sach");
        System.out.println("0.Thoat");
    }
    
    public void nhapDS(){
        do {            
            menu();
            System.out.println("Lua chon: ");
            chon = sc.nextInt();
            switch(chon){
                case 1: {
                    ChuyenVien cv = new ChuyenVien();
                    cv.nhapCV();
                    ds.add(cv);
                    break;
                }
                case 2: {
                    GiangVien gv= new GiangVien();
                    gv.nhapGV();
                    ds.add(gv);
                    break;
                }
                case 3: {
                    QuanLy ql = new QuanLy();
                    ql.nhapQL();
                    ds.add(ql);
                    break;
                }
                case 4: xuatDS(); break;
                case 0: System.exit(0); break;
                default: break;
            }
        } while (chon!=0);
    }
    
    public void xuatDS(){
        System.out.println("Danh sach can bo: ");
        for(int i=0;i<ds.size();i++){
            ds.get(i).xuat();
        }
    }
}