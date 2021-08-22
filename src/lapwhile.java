import java.util.Scanner;
public class lapwhile {
       public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               System.out.print("Nhap gia tri n: ");  int n = sc.nextInt();
               while(n != 0) {
                       System.out.println("Hello Helloooooooooooooo........");
                       System.out.print("Nhap gia tri n: "); n = sc.nextInt();
               }
               System.out.println("da thoat lan 1");
               do {
                       System.out.println("Hello Helloooooooooooooo........");
                       System.out.print("Nhap gia tri n: "); n = sc.nextInt();
               } while (n != 0); 
               System.out.println("da thoat lan 2");
       }
}
