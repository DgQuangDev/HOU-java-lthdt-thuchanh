package bai14;
import java.util.ArrayList;
import java.util.Scanner;
public class DanhSachXe {
    int chon;
    ArrayList<Xe> ds= new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void menu(){
        System.out.println("1. Nhap Xe Dap");
        System.out.println("2. Nhap Xe May");
        System.out.println("3. Nhap Oto");
        System.out.println("4. Nhap Oto Khach");
        System.out.println("5. Hien Danh Sach");
        System.out.println("0.Thoat");
    }
    
    public void nhapDS(){
        do {            
            menu();
            System.out.println("Lua chon: ");
            chon = sc.nextInt();
            switch(chon){
                case 1: {
                    XeDap xd = new XeDap();
                    xd.nhapXD();
                    ds.add(xd);
                    break;
                }
                case 2: {
                    XeMay xm= new XeMay();
                    xm.nhapXM();
                    ds.add(xm);
                    break;
                }
                case 3: {
                    Oto o = new Oto();
                    o.nhapOto();
                    ds.add(o);
                    break;
                }
                case 4: {
                    OtoK k = new OtoK();
                    k.nhapOtoK();
                    ds.add(k);
                    break;
                }
                case 5: xuatDS(); break;
                case 0: System.exit(0); break;
                    
            }
        } while (chon!=0);
    }
    
    public void xuatDS(){
        for(int i=0;i<ds.size();i++){
            ds.get(i).xuat();
        }
    }
}
