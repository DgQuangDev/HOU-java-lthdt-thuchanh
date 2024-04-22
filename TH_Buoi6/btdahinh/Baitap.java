package btdahinh;

import java.util.Scanner;

public class Baitap{
    protected String Tenmon;
    protected String Debai;
    protected int Diem;

    public Baitap(){
        this.Tenmon = "No Name";
        this.Debai = "No Title";
        this.Diem = 1;
    }

    public Baitap(String Tenmon , String Debai , int Diem){
        this.Tenmon = Tenmon;
        this.Debai = Debai;
        this.Diem = Diem;
    }

    public String Tenmon(){
        return Tenmon;
    }

    public String Debai(){
        return Debai;
    }

    public int Diem(){
        return Diem;
    }

    public void inputBaitap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten mon hoc: "); this.Tenmon = sc.nextLine();
        System.out.println("Nhap De bai: ");this.Tenmon = sc.nextLine();
        System.out.println("Nhap Diem: "); this.Diem = sc.nextInt();
    }
    public void showBaitap(){
        System.out.printf("\n%-15s%-15s%-5d",this.Tenmon,this.Debai,this.Diem);
    }
}