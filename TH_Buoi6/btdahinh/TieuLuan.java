package btdahinh;

import java.util.Scanner;

public class TieuLuan extends Baitap{
    protected String Nguoihd;
    protected double Diemhd;
    protected int Namth;
    private int index;
    private SinhVien []sv;
    public TieuLuan(){

    }

    public TieuLuan(String Tenmon,String Debai,int Diem,String Nguoihd , int Diemhd,int Namth, int index){
        super(Tenmon,Debai,Diem);
        this.Nguoihd = Nguoihd;
        this.Diemhd =Diemhd;
        this.Namth = Namth;
        this.index=index;
    }

    public String Nguoihd(){
        return Nguoihd;
    }
    public double Diemhd(){
        return Diemhd;
    }
    public int Namth(){
        return Namth;
    }
    public int index(){
        return index;
    }

    public void inputTieuluan(){
        super.inputBaitap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten Nguoi Huong Dan: "); this.Nguoihd = sc.nextLine();
        System.out.println("Nhap Diem hd: "); this.Diemhd = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap nam thuc hien: ");this.Namth = sc.nextInt();
        sc.nextLine();
        // thong tin sinh vien
        System.out.println("Nhap So sinh vien thuc hien: ");
        this.index = sc.nextInt();
        sc.nextLine();
        this.sv = new SinhVien[this.index];
        for(int i = 0 ; i < this.index ; i++){
            System.out.println("nhap thong tin sinh vien thu " + (i +1)+" " );
                SinhVien vs = new SinhVien();
                vs.inputSinhVien();
                this.sv[i]= vs;
        }
    }

    
    public void showTieuluan(){
        super.showBaitap();
        System.out.printf("%-15s%-5d%-5d", this.Nguoihd,this.Diemhd,this.Namth);
    }

}