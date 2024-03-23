package bai14;
public class XeMay extends Xe implements Thue{
    @Override
    public float thue() {
        return (float) (giaXe*0.1*0.05);
    }
    
    public void nhapXM(){
        super.nhap();
    }
    
    public void xuat(){
        super.xuat();
        System.out.println("Thue: "+thue());
    }
    
}