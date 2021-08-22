import java.util.Scanner;

public class lapfo {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap n phan tu mang: ");
                int n = sc.nextInt();
                int a[] = new int[n];
                for(int  i = 0 ; i < n;i++){
                        System.out.print("Nhap Gia Tri a"+ "[" + i + "] = ");
                        a[i] = sc.nextInt();
                }
                int sum = 0;
                for(int i = 0;i < n;i++ ){
                        sum += a[i];
                }
                System.out.println("Tong tu a[0] den a[n] la : " + sum);
        }
}