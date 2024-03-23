package bai13;
public class GiangVien extends CanBo implements Luong{
    @Override
    public float tinhLuong() {
        return hsl*135000 + hsl*135000*0.2f;
    }
    
    public void nhapGV(){
        super.nhap();
    }
    
    public void xuatGV(){
        super.xuat();
        System.out.println("Luong: "+tinhLuong());
    }
    
}