/*Bài 2 (TH-LTHDT-02: Viết chương trình nhập vào số nguyên n và thực hiện.
 Xuất ra màn hình n số đầu tiên của chuỗi Fibonaci (có 2 giá trị đầu là 1 và 1). */





import java.util.Scanner;
public class TH1_Bai2 {
    public static void main(String[] args) {
        int a[];
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so nguyen n: ");
        n = sc.nextInt();
        
        if (n == 1) {
            System.out.println("Day Fibonacci: " + 1);
        } else {
            a = new int[n];
            a[0] = 1;
            a[1] = 1;
            for (int i = 2; i < n; i++) {
                // cong thuc tinh so Fibonaci
                a[i] = a[i - 1] + a[i - 2];
            }
            System.out.print("Day Fibonacci bao gom: ");
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
}

