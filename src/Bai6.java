import java.util.Scanner;

public class Bai6 {
       public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               System.out.print("Nhap do dai cua day so: "); int n = sc.nextInt();
               double a[] = new double[n];
               for(int i = 0; i < n; i++){
                       System.out.print("Nhap phan tu thu " + (i + 1) + ": ");
                       a[i] = sc.nextDouble();
               }
               double duong = 0, am =0;
               int cout = 0, coutam =0;
               for(int i =0; i < n; i++){
                       if(a[i] > 0){
                               duong += a[i];
                               cout ++; 
                       }
                       if(a[i] < 0 ){
                               am += a[i]; 
                               coutam ++;
                       }
               }

                       System.out.println("Tong duong : " + (duong/cout) );
                       System.out.println("Tong am : "+ (am/coutam));
       } 
}
