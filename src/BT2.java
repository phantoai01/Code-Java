import java.util.Scanner;

public class BT2 {
       public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
               int a, b, c, d, e, f;     
               int D, Dx, Dy, x, y;
               System.out.println("ax + by = c"); 
               System.out.println("dx + ey = f"); 
               System.out.print("Nhap gia tri a = ");   a = sc.nextInt();
               System.out.print("Nhap gia tri b = ");  b = sc.nextInt();
               System.out.print("Nhap gia tri c = ");  c = sc.nextInt();
               System.out.print("Nhap gia tri d = ");  d = sc.nextInt();
               System.out.print("Nhap gia tri e = ");  e = sc.nextInt();
               System.out.print("Nhap gia tri f = ");  f = sc.nextInt();
               D = a * e - d * b;
               Dx = c * e - f * b;
               Dy = a * f - d * c;
               if (D == 0){
                       if (Dx + Dy == 0)
                                System.out.println("He Phuong Tring co Vo So nghiem");
                       else
                                System.out.println("He Phuong Trinh Vo Nghiem.");
               }else{
                       x = Dx / D;
                       y = Dy / D;
                       System.out.println("He Phuong Trinh Co Nghiem: X = " + x + ",   Y = " + y);
               }
        }
}
