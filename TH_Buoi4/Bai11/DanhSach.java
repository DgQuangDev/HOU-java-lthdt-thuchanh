package Bai11;

import java.util.ArrayList;
import java.util.Scanner;
public class DanhSach {
    int chon,a,b,c;
    ArrayList<Person> list = new ArrayList<>();
    ArrayList<Student> listS = new ArrayList<>();
    ArrayList<Employee> listE = new ArrayList<>();
    ArrayList<Customer> listC = new ArrayList<>();
    Scanner sc= new Scanner(System.in);
    
    public void menu(){
        System.out.println("1. Nhap danh sach Hoc Sinh");
        System.out.println("2. Nhap danh sach Nhan vien");
        System.out.println("3. Nhap sanh sach Khach hang");
        System.out.println("4. Xuat danh sach");
        System.out.println("5. Xoa nguoi theo ten");
        System.out.println("0.Thoat");
    }
    
    public void nhapDSStu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hoc sinh muon nhap: ");
        a= sc.nextInt();
        listS = new ArrayList(a);
        for(int i=0;i<a;i++){
            Student stu = new Student();
            stu.nhapStu();
            list.add(stu);
        }
    }
    
    public void nhapDSEmp(){
        System.out.println("Nhap so nhan vien muon nhap: ");
        b= sc.nextInt();
        listE = new ArrayList(b);
        for(int i=0;i<b;i++){
            Employee emp = new Employee();
            emp.nhapEmp();
            list.add(emp);
        }
    }
    
    public void nhapDSCus(){
        System.out.println("Nhap so khach hang muon nhap: ");
        c= sc.nextInt();
        listC = new ArrayList(c);
        for(int i=0;i<c;i++){
            Customer cus = new Customer();
            cus.nhapCus();
            list.add(cus);
        }
    }
    
    
    public void nhapDS(){
        do {            
            menu();
            System.out.println("Lua chon: ");
            chon= sc.nextInt();
            
            switch(chon){
                case 1: nhapDSStu();break;
                case 2: nhapDSEmp(); break;
                case 3: nhapDSCus(); break;
                case 4: xuatDS(); break;
                case 5: xoaNguoi(); break;
                case 0: System.exit(0);break;
            }
        } while (chon!=0);
    }
    
    public void xuatDS(){
        for(int i=0;i<list.size();i++){
            list.get(i).xuat();
        }
    }
    
    public void xoaNguoi(){
        Scanner sc = new Scanner(System.in);
        String ten;
        System.out.println("Nhap ten nguoi can xoa: ");
        ten= sc.nextLine();
        for(int i=0;i<list.size();i++){
            if(list.get(i).hoten.equals(ten)){
                list.remove(i);
            }
        }
        
    }
    
}