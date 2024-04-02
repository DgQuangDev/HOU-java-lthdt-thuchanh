package bai15;

import java.io.Serializable;

import java.util.Scanner;

public class Nguoi implements Serializable{

String hoTen;

int namSinh;

boolean gioiTinh;

public Nguoi(){

}

public Nguoi(String hoTen, boolean gioiTinh, int namSinh){

this.hoTen= hoTen;

this.gioiTinh= gioiTinh;

this.namSinh= namSinh;

}

public String getHoTen() {

return hoTen;

}

public void setHoTen(String hoTen) {

this.hoTen = hoTen;

}

public boolean isGioiTinh() {

return gioiTinh;

}

public void setGioiTinh(boolean gioiTinh) {

this.gioiTinh = gioiTinh;

}

public int getNamSinh() {

return namSinh;

}

public void setNamSinh(int namSinh) {

this.namSinh = namSinh;

}

public void nhap(){

Scanner sc= new Scanner(System.in);

byte i;

while(true){

try {

System.out.print("Nhap ho va ten: ");

hoTen= sc.nextLine();;

System.out.print("Nhap nam sinh: ");

namSinh= sc.nextInt();

System.out.print("Gioi tinh(1:Nam - 0:Nu): ");

i=sc.nextByte();

if(namSinh<=0) throw new Exception(); break;

} catch (Exception e) {

System.out.print("Nhap sai gia tri, nhap lai!\n");

sc.nextLine();

System.out.println("----------------------------------------");
}

}

sc.nextLine();

if(i==1) gioiTinh=true; else gioiTinh=false;

}

public String hien(){

String gt= null;

if(gioiTinh) {

gt="Nam";

}else{

gt="Nu";

}

String output = String.format("%-30s|%-8d|%-9s|",hoTen,namSinh,gt);

return output;

}

}

