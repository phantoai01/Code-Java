import java.util.Scanner;

public class vidu {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Nhap vao gia tri a = ");
                int a = sc.nextInt();
                System.out.print("Nhap vao gia tri b =");
                int b = sc.nextInt();
                double nghiem;
                if(a == 0) {
                    if (b == 0) {
                                System.out.println("Phuong trinh vo so nghiem"); 
                        } else {
                                System.out.println("Phuong trinh vo nghiem");
                        }
                } else {
                        nghiem = (double)-b/a;
                        System.out.println("Phuong trinh co nghiem la: " + nghiem);
                }

        }
}