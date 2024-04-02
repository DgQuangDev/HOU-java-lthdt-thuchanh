package bai15;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DanhSach {
    ArrayList<HocSinh> ds= new ArrayList<>();
    int n;
    Scanner sc = new Scanner(System.in);
    
    public void nhapDS(){
        System.out.print("Nhap so hoc sinh: ");
        n= sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("\nHoc sinh thu "+(i+1));
            HocSinh hs= new HocSinh();
            hs.nhap();
            ds.add(hs);
        }
    }
    
    public void xuatDS() {
  System.out.print("\nDanh sach hoc sinh: ");
  System.out.printf("%-30s|%-8s|%-9s|%-7s\n","Ho ten","Nam sinh","Gioi tinh","Lop");
  for(HocSinh hs:ds) {
                    System.out.println(hs.gioithieu());
  }
  System.out.println("-----------------------------------------------------------------");
 }
    
    public void timKiem(){
        int nam = 0, dem=0;
        while(true){
            try {
                System.out.print("Nhap nam sinh can tim: ");
                nam= sc.nextInt();
                if(nam<=0) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.print("Nhap gia tri sai, nhap lai!\n");
  sc.nextLine();
            }
        }
        System.out.print("\nDanh sach học sinh: ");
 System.out.printf("%-30s|%-8s|%-9s|%-7s\n","Ho ten","Nam sinh","Gioi tinh","Lop");
            for(HocSinh hs:ds){
                if(hs.getNamSinh()==nam){
                    dem++;
                    System.out.println(hs.gioithieu());
                    System.out.println("--------------------------------------------------------");
                }
            }
            if(dem==0){
                System.out.println("Nam sinh khong ton tai");
                System.out.println("--------------------------------------------------------");
            }
    }
    
    public void ghiFile() throws Exception{
        try {
            FileOutputStream fout = new FileOutputStream("bai15luu.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(ds);
            out.close();
            fout.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ghi file khong thanh cong!");
            System.out.println("------------------------------------------");
        }
        System.out.println("Ghi file thanh cong");
        System.out.println("-------------------------------------------------------");
        
    }
    
    public void docFile() throws Exception{
        try {
            DanhSach fin = new DanhSach("bai15luu.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            ds = (ArrayList) in.readObject();
            in.close();
            fin.close();
            xuatDS();
        }catch(FileNotFoundException e){
            System.out.println("Khong tim thay file");
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ghi file khong thanh cong");
        }
    }
}
