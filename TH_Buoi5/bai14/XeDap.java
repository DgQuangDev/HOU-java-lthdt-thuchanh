package bai14;
public class XeDap extends Xe implements Thue{
    @Override
    public float thue() {
        return 0;
    }
    
    public void nhapXD(){
        super.nhap();
    }
    
    public void xuat(){
        super.xuat();
        System.out.println("Thue: "+thue());
    }
    
}
