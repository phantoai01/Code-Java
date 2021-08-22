import java.util.Scanner;
public class BT10 {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap n phan tu mang: ");
                int n = sc.nextInt();
                int a[] = new int[n];
                for(int  i = 0 ; i < n;i++){
                        System.out.print("Nhap Gia Tri a"+ "[" + i + "] = ");
                        a[i] = sc.nextInt();
                }
                System.out.println("cac so duong trong mang:");
                for(int i = 0; i < n ; i++){
                        if(a[i] > 0){
                                System.out.print(a[i] + " ");
                        }
                }
                System.out.println();
                System.out.println("cac so am trong mang: ");
                for (int i =0 ; i < n; i++){
                        if(a[i]<0){
                                System.out.print(a[i] + " ");
                        }
                }
        }
}
