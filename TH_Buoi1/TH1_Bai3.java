import static java.lang.Math.sqrt;
    import java.util.Scanner;
    public class TH1_Bai3{
        public static void main(String[] args) {
            int a,b,c;
            float p,S;
            Scanner Nhap = new Scanner(System.in);
            System.out.print("Nhap canh thu nhat: "); a=Nhap.nextInt();
            System.out.print("Nhap canh thu hai: "); b=Nhap.nextInt();
            System.out.print("Nhap canh thu ba: "); c=Nhap.nextInt();
            if( a > 0  && b > 0 && c >0)
            {
                if( a + b > c && a + c > b && b+ c > a )
                  {
                     p = (a + b +c)/2 ;
                     S = (float) sqrt(p*(p - a)*(p - b)*(p-c));
                     System.out.print("Dien tich cua tam giac la: " +S);
                  }
                else
                {
                    System.out.println("Khong thoa man 1 tam giac");
                }
            }
            else
            {
                System.out.println("So duoc nhap khong thoa man");
            }
        }
    }
    
