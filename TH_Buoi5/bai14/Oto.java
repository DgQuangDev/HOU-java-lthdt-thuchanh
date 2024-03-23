package bai14;
public class Oto extends Xe implements Thue{
    @Override
    public float thue() {
        return (float) (giaXe*0.1*0.02);
    }
    
    public void nhapOto(){
        super.nhap();
    }
    
    public void xuat(){
        super.xuat();
        System.out.println("Thue: "+thue());
    }
    
}
