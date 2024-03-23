package bai13;
public class ChuyenVien extends CanBo implements Luong{
    @Override
    public float tinhLuong() {
        return hsl*135000;
        
    }
    
    public void nhapCV(){
        super.nhap();
    }
    
    public void xuatCV(){
        super.xuat();
        System.out.println("Luong: "+tinhLuong());
    }
    
}
