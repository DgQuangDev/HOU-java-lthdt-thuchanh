package btdahinh;

import java.util.Scanner;

public class DoAn extends TieuLuan {
    protected String Nguoipb;
    protected int Diempb;
    protected int Diembv;

    public DoAn(){

    }
    public DoAn(String Tenmon,String Debai,int Diem,String Nguoihd , int Diemhd,int Namth,int index, String Nguoipb,int Diempb ,int Diembv){
        super(Tenmon,Debai,Diem,Nguoihd,Diemhd,Namth,index);
        this.Nguoipb = Nguoipb;
        this.Diempb = Diempb;
        this. Diembv = Diembv;
    }

    public String Nguoipb(){
        return Nguoipb;
    }
    public double Diempb(){
        return Diempb;
    }
    public double Diembv(){
        return Diembv;
    }
    public void inputDoan(){
        super.inputTieuluan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Nguoi phan bien: ");this.Nguoipb = sc.nextLine();
        System.out.println("Nhap Diem phan Bien: "); this.Diempb = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap Diem bao ve: "); this.Diembv = sc.nextInt();
        sc.nextLine();
        
    }
    public void outputDoan(){
        super.showTieuluan();
        System.out.printf("%-15s%-5d%-5d", this.Nguoipb,this.Diempb,this.Diembv);
    }
}

