package bai15;

import java.io.Serializable;

import java.util.Scanner;

public class HocSinh extends Nguoi implements Serializable, IHoatDong{

String lop;

public HocSinh(){
}

public HocSinh(String hoTen, boolean gioiTinh, int namSinh, String lop){
super(hoTen, gioiTinh, namSinh);
this.lop= lop;
}

public void nhap(){
Scanner sc= new Scanner(System.in);
super.nhap();
System.out.print("Nhap lop: ");
lop= sc.nextLine();
}

@Override
public String gioithieu() {
String output = String.format(super.hien()+"%-7s",lop);
return output;
}
}
