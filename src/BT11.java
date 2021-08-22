import java.util.Scanner;
public class BT11 {
       public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap n phan tu mang: ");
                int n = sc.nextInt();
                int a[] = new int[n];
                for(int  i = 0 ; i < n;i++){
                        System.out.print("Nhap Gia Tri a"+ "[" + i + "] = ");
                        a[i] = sc.nextInt();
                }
                for(int j = n -1; j >= 0; j--){
                        if(a[j] < 0){
                                System.out.println("so am cuoi cung trong day la: " + a[j]);
                        }
                }
       } 
}
